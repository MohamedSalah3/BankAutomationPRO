package aui;
/*This is My progress bar 
 * Get date and set date needs to call scripts (Not implemented)
 * Get Req_number Needs selenium Functionality or SQL (Not implemented)
 * 
 * 
 * **/
public class Request implements Cloneable {
int ERROR_STATUS;
 long  rim_number ;
/*a number of 6 digits represents the customer account*/
 String REQ_number ;
/*REQ+number represents the customer request*/
/*
 * this will be used as a search filter
 * **/
 String TO_Date ;
 String From_Date ;
 String Req_Date;
String Month ;
String Sub_Month ;
 String Req_Status_String;
/*a string we will use to search for new requests*/
 String Branch;

/*a number from 2 to 41*/
 int BranchInt;

 int  MinorReqType;
/*	offline transfer inside egypt 	1111
 * 	offline transfer outside egypt 	2222
 *  funds                           3333 
 *  
 * */
 int  MajorReqType;
/*offline transfer
 * retail
 * SO
 * */
 int Req_Status ;
/*
 * 	submitted 		101
 *  in progress 	202
 *  approved 		303
 *  rejected 		404
 */
Emails Req_email=new Emails();

Request(){
	
	
} 
Request(Request x){
	rim_number=x.rim_number ;
	REQ_number=x.REQ_number ;
	 TO_Date=x.TO_Date ;
	 From_Date=x.From_Date ;
	 Req_Date=x.Req_Date;
	 Month=x.Month ;
	 Sub_Month=x.Sub_Month ;
	 Req_Status_String=x.Req_Status_String;
	 Branch=x.Branch;
	 BranchInt=x.BranchInt;
	 MinorReqType=x.MinorReqType;
	 MajorReqType=x.MajorReqType;
	 Req_Status= x.Req_Status ;

}
public Object clone() throws CloneNotSupportedException 
{
   return (Request)super.clone();
   
}

void Copy(Request x){
	
	this.rim_number=x.rim_number ;
	this.REQ_number=x.REQ_number ;
	this.TO_Date=x.TO_Date ;
	this.From_Date=x.From_Date ;
	this.Req_Date=x.Req_Date;
	this.Month=x.Month ;
	this.Sub_Month=x.Sub_Month ;
	this.Req_Status_String=x.Req_Status_String;
	this.Branch=x.Branch;
	this.BranchInt=x.BranchInt;
	this.MinorReqType=x.MinorReqType;
	this.MajorReqType=x.MajorReqType;
	this.Req_Status= x.Req_Status ;

	
}
int set_Req_number(String REQuest_number)
{
	this.REQ_number = REQuest_number;
return this.ERROR_STATUS;

}
String get_Req_number()
{
	return this.REQ_number;
}

int set_rim_number(long Rim_Number) 
{
	this.rim_number=Rim_Number;	
return this.ERROR_STATUS;
}

long get_rim_number() {
	return this.rim_number;
}

int setTO_Date(String DateByScript) 
{

//	Request.Date=DateByScript;
if(DateByScript.contains("Jan")) 
{
	 Month = "January" ;
	Sub_Month = "/01/"; 
}

if(DateByScript.contains("Feb")) 
{
	Month = "February" ;
	Sub_Month = "/02/"; 
}
if(DateByScript.contains("Mar"))
{
		Month = "March" ;
		Sub_Month = "/03/"; 

}
if(DateByScript.contains("Apr")) 
{
	Month = "April" ;
	Sub_Month = "/04/"; 
}

if(DateByScript.contains("May")) 
{
	Month = "May" ;
	Sub_Month = "/05/"; 
}
if(DateByScript.contains("Jun"))
{
		Month = "June" ;
		Sub_Month = "/06/"; 

}
if(DateByScript.contains("Jul")) 
{
	Month = "July" ;
	Sub_Month = "/07/"; 
}

if(DateByScript.contains("Aug")) 
{
	Month = "August" ;
	Sub_Month = "/08/"; 
}
if(DateByScript.contains("Sep"))
{
		Month = "September" ;
		Sub_Month = "/09/"; 

}
if(DateByScript.contains("Oct")) 
{
	Month = "Octoper" ;
	Sub_Month = "/10/"; 
}

if(DateByScript.contains("Nov")) 
{
	Month = "November" ;
	Sub_Month = "/11/"; 
}
if(DateByScript.contains("Dec"))
{
		Month = "December" ;
		Sub_Month = "/12/"; 

}

	
	System.out.println( DateByScript.indexOf(Month));
	this.TO_Date ="" +DateByScript.charAt( DateByScript.indexOf(Month)+Month.length()+1) 
	+ DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+2) + Sub_Month + 
	DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+5) +
	DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+6)
			+ DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+7) 
			+ DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+8);	
	
	
	
	return this.ERROR_STATUS;
}

String get_TO_Date() {
	return this.TO_Date;
}
String get_From_Date() {
	return this.From_Date;
}

int setFrom_Date(String DateByScript ) 
{
	

//	Request.Date=DateByScript;
if(DateByScript.contains("Jan")) 
{
	 Month = "January" ;
	Sub_Month = "/01/"; 
}

if(DateByScript.contains("Feb")) 
{
	Month = "February" ;
	Sub_Month = "/02/"; 
}
if(DateByScript.contains("Mar"))
{
		Month = "March" ;
		Sub_Month = "/03/"; 

}
if(DateByScript.contains("Apr")) 
{
	Month = "April" ;
	Sub_Month = "/04/"; 
}

if(DateByScript.contains("May")) 
{
	Month = "May" ;
	Sub_Month = "/05/"; 
}
if(DateByScript.contains("Jun"))
{
		Month = "June" ;
		Sub_Month = "/06/"; 

}
if(DateByScript.contains("Jul")) 
{
	Month = "July" ;
	Sub_Month = "/07/"; 
}

if(DateByScript.contains("Aug")) 
{
	Month = "August" ;
	Sub_Month = "/08/"; 
}
if(DateByScript.contains("Sep"))
{
		Month = "September" ;
		Sub_Month = "/09/"; 

}
if(DateByScript.contains("Oct")) 
{
	Month = "Octoper" ;
	Sub_Month = "/10/"; 
}

if(DateByScript.contains("Nov")) 
{
	Month = "November" ;
	Sub_Month = "/11/"; 
}
if(DateByScript.contains("Dec"))
{
		Month = "December" ;
		Sub_Month = "/12/"; 

}

	
	System.out.println( DateByScript.indexOf(Month));
	this.From_Date ="" +DateByScript.charAt( DateByScript.indexOf(Month)+Month.length()+1) 
	+ DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+2) + Sub_Month + 
	DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+5) +
	DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+6)
			+ DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+7) 
			+ DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+8);	
	
	


	return this.ERROR_STATUS;
}

int Set_Date(String Date) {
	this.Req_Date=Date;
	return this.ERROR_STATUS;
}

String get_Date() {
	return this.Req_Date; 
}


int set_branch(String Branch_Name) 
{
	this.Branch = Branch_Name;
	return this.ERROR_STATUS;
}

int set_branch_int(int Branch_Name) {
	this.BranchInt = Branch_Name;
	return this.ERROR_STATUS;	
}
String get_branch() 
{	
	return this.Branch;
}

int set_MinorReqType(int RequestType) 
{	
	this.MinorReqType = RequestType;
	return this.ERROR_STATUS;
}

int get_MinorReqType() {
	
	return this.MinorReqType;
}


int set_MajorReqType(int RequestType) 
{	
	this.MajorReqType = RequestType;
	return this.ERROR_STATUS;
}

int get_MajorReqType() {
	
	return this.MajorReqType;
}
int set_Request_Status(int Request_Status ) 
{
	this.Req_Status = Request_Status;
	return this.ERROR_STATUS;
}

int get_Request_status() {
	return Req_Status;
}

String get_Request_status_String() {
	return Req_Status_String;
}
int set_Request_Status_String(String Request_Status ) 
{
	this.Req_Status_String = Request_Status;
	return this.ERROR_STATUS;
}


int set_Request_email(String From , String CC) {
	this.Req_email.Subject = this.REQ_number;
	this.Req_email.TO_Field= this.Branch; /**/	
	this.Req_email.Body="Kindly Take Your Action , To approve this Request Respond with DONE "
			+ "To Reject Respond with REJECT:<REJECTION REASON>";
	/*this should be implemented */
	this.Req_email.Attachment_path = this.Req_email.get_attachment_path();
	this.Req_email.CC = CC;
	this.Req_email.From=From;
	/**for development*/
	System.out.println("Subject =  "+
	this.Req_email.Subject+"\n"+"TO: "+this.Req_email.TO_Field+"\n"+ "BODY: "+this.Req_email.Body+"\n"+"Attachment Path : "+this.Req_email.Attachment_path);
return this.ERROR_STATUS;
}

}
