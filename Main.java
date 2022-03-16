package aui;

import java.io.IOException;

public class Main {
   public static void main(String args[])throws IOException 
   { 
	//   Scanner scan = new Scanner(System.in);
	   // PORTAL selenium = new PORTAL();
    // scan.close();
	   
	Call_Script script = new Call_Script();
	  // Integer y=20;
//	Queue commands = new Queue();

//System.out.println(y);
	   Queue queue = new Queue();
	   Queue_of_Requests ReQ =new Queue_of_Requests();
	   Request REQ = new Request();
	   REQ.set_branch("Cairo");
	   REQ.set_MajorReqType(0);
	   REQ.set_MinorReqType(1111);
	   REQ.set_rim_number(25982);
	   REQ.set_Req_number("REQ125422385523");
	   REQ.set_Request_Status(1);
	   REQ.setFrom_Date("25/05/2022");
	   REQ.setTO_Date("Sunday, December 13, 2022 11:22:45 AM");
	   REQ.Req_email.set_attachment_path();
	   
	   ReQ.inQueue(REQ);
	   ReQ.debug();
	   Request Result =new Request();
			   Result =  ReQ.dequeue();
				  String print = Result.get_branch()+" " + Result.get_MajorReqType()+" "+
						  Result.get_MinorReqType()+" "+
						  Result.get_Req_number()+" "+
						  Result.get_Request_status()+" "+
						  Result.get_rim_number()+" "+
						  Result.get_TO_Date();
	   System.out.println(print);
	   Result.set_Request_email();
	   
	   
	   queue.inQueue("powershell.exe -Command \"&{C:\\Users\\Dell\\eclipse-workspace\\comm\\Functions.ps1}\" ");
	   queue.inQueue("powershell.exe -Command \"&{Write-Host \" nice work \" }\"");
 		
	   queue.debug();
  		script.Send_commands(queue);
//Emails em = new Emails();
  		queue.debug();
  		script.Send_commands(queue);
	   queue.inQueue("three");
  		queue.debug();
  		System.out.println("1 Deq"+queue.dequeue());
   		queue.debug();
  		System.out.println("2 Deq"+queue.dequeue());
   		queue.debug();
  		System.out.println("3 Deq"+queue.dequeue());
      	queue.debug();
 	   queue.inQueue("four");
   		queue.debug();
 	   queue.inQueue("five");
   		queue.debug();
 	   queue.inQueue("six");
 	  queue.debug();
 	   queue.inQueue("7");
 	  queue.debug();
 	   queue.inQueue("8");
 	  queue.debug();
 	   queue.inQueue("9");
 	  queue.debug();
 	   queue.inQueue("10");
 	  queue.debug();
 		System.out.println("Deq"+queue.dequeue());
   		queue.debug();
  		System.out.println("Deq"+queue.dequeue());
   		queue.debug();
  		System.out.println("Deq"+queue.dequeue());
  		System.out.println("Deq"+queue.dequeue());
  		System.out.println("Deq"+queue.dequeue());
  		System.out.println("Deq"+queue.dequeue());
  		System.out.println("Deq"+queue.dequeue());
  		System.out.println("Deq"+queue.dequeue());
  		System.out.println("Deq"+queue.dequeue());
  		System.out.println("Deq"+queue.dequeue());
  		for(int i=0;i<10;i++)
  		System.out.println(queue.processes[i]);
  		tasks Task = new tasks();
  		Task.inque_branches_data();
  		for(int i = 0 ;i<3;i++)
  		System.out.println(Task.dequeue_branches_data());
  		
  		Request New_Req = new Request();
  		New_Req.set_rim_number(9625898);
  		New_Req.set_branch("Cairo");
  		New_Req.set_MajorReqType(1111);
  		New_Req.set_MinorReqType(303);
  		New_Req.set_Req_number("REQ429679679");
  		New_Req.setTO_Date("Sunday, December 13, 2022 11:22:45 AM");
  		System.out.println(New_Req.get_rim_number());
  		System.out.println(New_Req.get_branch());
  		System.out.println(New_Req.get_MajorReqType());
  		System.out.println(New_Req.get_MinorReqType());
  		System.out.println(New_Req.get_Req_number());
  		System.out.println(New_Req.get_TO_Date());
  		/*
	   for(;;) 
	   {
	   System.out.println("hello");
	   
	   }
*/

   }

}




