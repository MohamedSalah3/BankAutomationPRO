package aui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter; 
import java.util.Scanner; 


public class Work_With_files 
{
	 int ERROR_STATUS ;
	Queue files = new Queue();
	Work_With_files() {

		
		// TODO Auto-generated constructor stub
	}
	int create_file(String Name_Path) throws IOException
	{
		
		File obj = new File(Name_Path);
		if(obj.createNewFile())
		{	
		this.ERROR_STATUS = 1;
		System.out.println("File is new ");
		}else {
			this.ERROR_STATUS = 0;
		System.out.println("File Exists");
		}
		return this.ERROR_STATUS;
	}
	int write_file(String Name_Path) throws IOException 
	{	
		FileWriter myWriter = new FileWriter(Name_Path);
		 // Writes this content into the specified file
		myWriter.write("Java is the prominent programming language of the millenium!"); 
		 
		// Closing is necessary to retrieve the resources allocated
		myWriter.close(); 
		
		return ERROR_STATUS;
	}
	int read_file(Queue files) 
	{
		
		try {
			// Creating an object of the file for reading the data
			File myObj = new File(files.dequeue());  
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
			}
			myReader.close();
			} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			}
		
		return ERROR_STATUS;
	}
	
	int Write_email_file(Request email_req,String path) throws IOException {
		
		FileWriter myWriter = new FileWriter(path+"\\"+"emailto"+email_req.Req_email.TO_Field+email_req.Req_email.Subject+".txt");
	//debug
		System.out.println(path+"emailto"+email_req.Req_email.TO_Field+email_req.Req_email.Subject+".txt");
		 // Writes this content into the specified file
		myWriter.write("\nTO : "+email_req.Req_email.TO_Field+"\nFrom : "+email_req.Req_email.From+"\n CC : "+email_req.Req_email.CC+"\nSubject : "+email_req.Req_email.Subject+"\nBody : "+email_req.Req_email.Body); 
		 
		// Closing is necessary to retrieve the resources allocated
		myWriter.close(); 
		
		return this.ERROR_STATUS;
	}
	
	String path_generator(Request email_req) throws IOException{
    String Branch=email_req.get_branch();
    String year_S;
    String month;
    String Day;
    String To_date=email_req.get_Date();
    System.out.println("ToDate ="+ To_date);
    Day =""+To_date.charAt(0)+To_date.charAt(1);
    month=""+To_date.charAt(3)+To_date.charAt(4)+email_req.Month;
    year_S=""+To_date.charAt(6)+To_date.charAt(7)+To_date.charAt(8)+To_date.charAt(9);
    /*make a dir Branch*/
    	/*year*/
    	/*inside it make dir Month*/
    			/*inside it make dir Day*/
    				String path ="C:\\REQ\\"+ Branch+"\\"+year_S+"\\"+month+"\\"+Day+"\\"+"Offline_Req"+"\\"+email_req.get_Req_number();
    				
    email_req.Req_email.Attachment_path=path;
    System.out.println(email_req.Req_email.get_attachment_path());
    /*Make folders*/
    
    	Call_Script makeFolder= new Call_Script();
    	makeFolder.Send_commands_String("powershell.exe -Command mkdir "+email_req.Req_email.get_attachment_path());
    	
    return email_req.Req_email.Attachment_path;
	}
	
}
