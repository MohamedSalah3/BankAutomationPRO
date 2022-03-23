package aui;

import java.io.IOException;

public class Queue_of_Requests {


static final char Queue_max_size = 10;	
/*ERROR_STATUS here used to return Errors in Queue 
 *so each value will mean something  
 *when =0 it is ok
 *when =1 the queue is empty not able to dequeue
 *when =2 the Queue will circulate
 * when =3 Queue is Full
 * */
	Request[] processes= new Request[Queue_max_size];
	
	int front ;
	int rare ;
	int size ;
	int ERROR_STATUS;
	Queue_of_Requests(){
		/*front index is pointing on the first element*/
		this.front =  0;
		/*rare index is negative one to make this queue circular*/
		this.rare  =  -1;
		/*size is zero because no element had been enqueued */
		this.size = 0;
	}
	
	boolean Is_Full() {
		return (this.size == (Queue_max_size - 1));
	}
	boolean Is_Empty() {
		return (this.size == 0);
	}
int inQueue(Request x) throws CloneNotSupportedException {
this.ERROR_STATUS = 0;/*No problem */
if(this.Is_Full())
{
System.out.println("Queue is full");
this.rare = -1;
}else {
	this.rare++;
this.processes[this.rare]=(Request)x.clone();

	this.size++;
	
	// System.out.println(this.processes[this.rare].get_Req_number());
}


return this.ERROR_STATUS;
}

Request dequeue() {
	Request RequestID = new Request();
if (this.Is_Empty())
{System.out.println("Queue is Empty");
this.front = 0;
this.rare = -1;
}else {

 RequestID.Copy(this.processes[this.front]);
	this.front++;
	this.size--;
}
	return RequestID;
}

Request dequeue_all(Queue_of_Requests ReQ) throws IOException {
	  
	Work_With_files file = new Work_With_files();
	   final String CC = "Digital BackOffice";
	   final String From ="Mohamed\'s Bot";
	
	   Request Temp = new Request(ReQ.dequeue());
	  Temp.set_Request_email(From,CC);
	  file.Write_email_file(Temp, file.path_generator(Temp));
	  System.out.println(Temp.get_Req_number());	  
	  return Temp;
}



void debug()
{
	   System.out.println("Error = "+this.ERROR_STATUS);
	   System.out.println("size  = "+this.size);
	   System.out.println("front = "+this.front);
	   System.out.println("rare  = "+this.rare);
	  String print = 
	   this.processes[this.front].get_branch()+" " +
	   this.processes[this.front].get_MajorReqType()+" "+
	   this.processes[this.front].get_MinorReqType()+" "+
	   this.processes[this.front].get_Req_number()+" "+
	   this.processes[this.front].get_Request_status()+" "+
	   this.processes[this.front].get_rim_number()+" "+
	   this.processes[this.front].get_TO_Date();
System.out.println(print);	   
}

	
	
}
