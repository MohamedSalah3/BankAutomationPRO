package aui;

public class tasks {
static Queue tasks= new Queue();
static Queue Branch= new Queue();
static Queue offline_request= new Queue();
static Queue offline_request_type = new Queue();

int ERROR_STATUS ;
	tasks(){
tasks.inQueue("read .csv branch file");		
tasks.inQueue("Open Portal");
tasks.inQueue("choose Branch ");
tasks.inQueue("get Date");
tasks.inQueue("choose Request type");
tasks.inQueue("choose Request status");
tasks.inQueue("filter requests");
tasks.inQueue("Download pdf");
tasks.inQueue("send Email");


		
	}
	
	
	
	
int inque_branches_data() {
	Branch.inQueue("Ismailia");
	Branch.inQueue("Mansoura");
	Branch.inQueue("Cairo");
	return this.ERROR_STATUS;
}
String dequeue_branches_data() {

String Branch_data=Branch.dequeue();
	
	return Branch_data;	
}

String dequeue_tasks_data() 
{
	String MyTask=tasks.dequeue();
	return MyTask;
}


void dequeue_Request(){
	this.dequeue_branches_data();
	this.dequeue_offline_request_type();
	this.getDate();
	
	
}   
String getDate() {
	String Date = null ;
	/*call a script to get date */
	return Date;
}
int dequeue_offline_request_type(){
	
	
	return this.ERROR_STATUS;
}

}






