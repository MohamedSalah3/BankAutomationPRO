package aui;

import java.io.BufferedReader;


//import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class Call_Script  {

	Call_Script()throws IOException{

System.out.println("Call Script :");
	
	}
	
		
	

	
	Mystring Send_commands(Queue Statements) throws IOException 
	{
		
	Mystring Ret = new Mystring();


	
	//Statements.inQueue("PowerShell.exe");
	//Statements.inQueue("Write-Host \"hello Mohamed\" ");
    

	  //String command = "powershell.exe  your command";
	  //Getting the version
	  String command = Statements.dequeue();
			  //"powershell.exe C:\\Users\\Dell\\eclipse-workspace\\comm\\Functions.ps1 ";
	  // Executing the command
	  Process powerShellProcess = Runtime.getRuntime().exec(command);
	  // Getting the results
	  powerShellProcess.getOutputStream().close();
	  String line;
	  System.out.println("Standard Output:");
	  BufferedReader stdout = new BufferedReader(new InputStreamReader(
	  powerShellProcess.getInputStream()));
	  while ((line = stdout.readLine()) != null) {
	   System.out.println(line+"This is line");
		  Ret.set_Output_Power_shell(line);

	  
	  }
	  stdout.close();
	  System.out.println("Standard Error:");
	  String line2;
	  BufferedReader stderr = new BufferedReader(new InputStreamReader(
	    powerShellProcess.getErrorStream()));
	  while ((line2 = stderr.readLine()) != null) 
	  {
	   System.out.println("hello  am here"+line2 );
	  }


	  
	  stderr.close();
	  System.out.println("Done");
	 System.out.println("Ret.SetOut"+" "+Ret.get_Output_Power_shell());
	 return Ret ;
	}

	




	 String Send_commands_String(String command) throws IOException {
		// TODO Auto-generated method stub
		  Process powerShellProcess = Runtime.getRuntime().exec(command);
		  // Getting the results
		  powerShellProcess.getOutputStream().close();
		  String line;
		  System.out.println("Standard Output:");
		  BufferedReader stdout = new BufferedReader(new InputStreamReader(
		  powerShellProcess.getInputStream()));
		  while ((line = stdout.readLine()) != null) {
		   System.out.println(line+"This is line");		  
		  }
		  stdout.close();
		  System.out.println("Standard Error:");
		  String line2;
		  BufferedReader stderr = new BufferedReader(new InputStreamReader(
		    powerShellProcess.getErrorStream()));

		  while ((line2 = stderr.readLine()) != null) 
		  {
		   System.out.println("hello  am here"+line2 );
		  }


		  
		  stderr.close();
	return line;
	 }
	


	
	
}
