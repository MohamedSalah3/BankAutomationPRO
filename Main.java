package aui;

import java.io.IOException;
//import java.util.*;
import java.sql.SQLException;


public class Main {
   public static void main(String args[])throws IOException, CloneNotSupportedException, SQLException 
   { 
	   final String CC = "Digital BackOffice";
	   final String From ="Mohamed\'s Bot";
	  	PORTAL selenium =new PORTAL();
	      Queue_of_Requests ReQ =new Queue_of_Requests();
        //Call_Script script = new Call_Script();		
		  Connect_URL connect_to_SQL = new Connect_URL();
		  connect_to_SQL.selectAll(ReQ);
		  Work_With_files file = new Work_With_files();
		  System.out.println(ReQ);
     	  Request Temp = new Request(ReQ.dequeue());
		  Temp.set_Request_email(From,CC);
		  file.Write_email_file(Temp, file.path_generator(Temp));
		  System.out.println(Temp.get_Req_number());
          int size=ReQ.size;
		  for(int i=0;i<size;i++) 
		  Temp.Copy(ReQ.dequeue_all(ReQ));
   }
   

}




