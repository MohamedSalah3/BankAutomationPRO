package aui;
import java.io.IOException;
import java.util.*; 
import javax.mail.*; 
import javax.mail.internet.*; 
//import javax.activation.*; 

public class Emails {
	int ERROR_STATUS ; 
	String TO_Field ;
	String From;
	String Subject;
	String Body;
	String Attachment_path;
	String CC;
	final int Port = 25;
	final long SMTP_Server = 200;
//	Queue Mail_waitingList;
	Emails(){/*
		String to = "w4led86@gmail.com"; 
		String from = "mhmd.ahmd789@gmail.com"; 
		String host = "localhost"; // or IP address 

		// Get the session object 
		// Get system properties 
		Properties properties = System.getProperties(); 

		// Setup mail server 
		properties.setProperty("mail.smtp.host", host); 

		// Get the default Session object 
		Session session = Session.getDefaultInstance(properties); 

		// compose the message 
		try { 

			// javax.mail.internet.MimeMessage class 
			// is mostly used for abstraction. 
			MimeMessage message = new MimeMessage(session); 

			// header field of the header. 
			message.setFrom(new InternetAddress(from)); 
			message.addRecipient(Message.RecipientType.TO, 
								new InternetAddress(to)); 
			message.setSubject("subject"); 
			message.setText("Hello, aas is sending email "); 

			// Send message 
			Transport.send(message); 
			System.out.println("Yo it has been sent.."); 
		} 
		catch (MessagingException mex) { 
			mex.printStackTrace(); 
		} 
		
	*/	
	}
	
	/*
	int Inqueue_Mail(Queue Waiting_list) {
		


		
		return this.ERROR_STATUS;
	}
	
	
	
	int dequeue_Mail() {
		return this.ERROR_STATUS ;
	}
	
	*/
	
	int send_email() {
	
		return this.ERROR_STATUS;
	}
	

	
	int set_attachment_path() throws IOException{
	Call_Script get_path = new Call_Script();
	this.Attachment_path =	get_path.Send_commands_String("powershell.exe -Command \"&{Write-Host \" This is attachment path \" }\"");
	//this.Attachment_path = "This is attachment path";
	
	return this.ERROR_STATUS;
	}
	String get_attachment_path() {
		
		return this.Attachment_path;
	}

}
