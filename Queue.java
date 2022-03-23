package aui;
/*For dev*/


/*For dev*/
//import java.util.ArrayList;


public class Queue {
static final char Queue_max_size = 10;	
/*ERROR_STATUS here used to return Errors in Queue 
 *so each value will mean something  
 *when =0 it is ok
 *when =1 the queue is empty not able to dequeue
 *when =2 the Queue will circulate
 * when =3 Queue is Full
 * */
	String[] processes= new String[Queue_max_size];
	
	int front ;
	int rare ;
	int size ;
	int ERROR_STATUS;
	Queue(){
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
int inQueue(String Statment) {
this.ERROR_STATUS = 0;/*No problem */
if(this.Is_Full())
{
System.out.println("Queue is full");
this.rare = -1;
}else {
	this.rare++;
	 this.processes[this.rare]=Statment;
		this.size++;
	 System.out.println(this.processes[this.rare]);
}


return this.ERROR_STATUS;
}

String dequeue() {
String Statement = new String();
if (this.Is_Empty())
{System.out.println("Queue is Empty");
this.front = 0;
this.rare = -1;

}else {
	Statement=this.processes[this.front];
	this.front++;
	this.size--;
}
	return Statement;
}

void debug(){
	   System.out.println("Error = "+this.ERROR_STATUS);
	   System.out.println("size  = "+this.size);
	   System.out.println("front = "+this.front);
	   System.out.println("rare  = "+this.rare);


}

}
