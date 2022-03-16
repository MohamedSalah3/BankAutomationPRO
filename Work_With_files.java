package aui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter; 

import java.util.Scanner; 

public class Work_With_files 
{
	static int ERROR_STATUS ;
	Queue files = new Queue();
	Work_With_files() {

		
		// TODO Auto-generated constructor stub
	}
	int create_file(String Name_Path) throws IOException
	{
		
		File obj = new File(Name_Path);
		if(obj.createNewFile())
		{	
		Work_With_files.ERROR_STATUS = 1;
		System.out.println("File is new ");
		}else {
		Work_With_files.ERROR_STATUS = 0;
		System.out.println("File Exists");
		}
		return Work_With_files.ERROR_STATUS;
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
	
}
