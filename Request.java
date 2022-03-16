package aui;
/*This is My progress bar 
 * Get date and set date needs to call scripts (Not implemented)
 * Get Req_number Needs selenium Functionality or SQL (Not implemented)
 * 
 * 
 * **/
public class Request {
int ERROR_STATUS;
static long  rim_number ;
/*a number of 6 digits represents the customer account*/
static String REQ_number ;
/*REQ+number represents the customer request*/
/*
 * this will be used as a search filter
 * **/
static String TO_Date ;
static String From_Date ;
String Month ;
String Sub_Month ;

/*a string we will use to search for new requests*/
static String Branch;
/*a number from 2 to 41*/
static int  MinorReqType;
/*	offline transfer inside egypt 	1111
 * 	offline transfer outside egypt 	2222
 *  funds                           3333 
 *  
 * */
static int  MajorReqType;
/*offline transfer
 * retail
 * SO
 * */
static int Req_Status ;
/*
 * 	submitted 		101
 *  in progress 	202
 *  approved 		303
 *  rejected 		404
 */
Emails Req_email=new Emails();

Request(){
	
	
} 
int set_Req_number(String REQuest_number)
{
	Request.REQ_number = REQuest_number;
return this.ERROR_STATUS;	
}
String get_Req_number()
{
	return Request.REQ_number;
}

int set_rim_number(long Rim_Number) 
{
Request.rim_number=Rim_Number;	
return this.ERROR_STATUS;
}

long get_rim_number() {
	return Request.rim_number;
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
	Request.TO_Date ="" +DateByScript.charAt( DateByScript.indexOf(Month)+Month.length()+1) 
	+ DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+2) + Sub_Month + 
	DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+5) +
	DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+6)
			+ DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+7) 
			+ DateByScript.charAt(DateByScript.indexOf(Month)+Month.length()+8);	
	
	
	
	return this.ERROR_STATUS;
}

String get_TO_Date() {
	return Request.TO_Date;
}
String get_From_Date() {
	return Request.From_Date;
}

int setFrom_Date(String DateByScript ) 
{
	
	Request.From_Date = DateByScript;

	return this.ERROR_STATUS;
}


int set_branch(String Branch_Name) 
{
	Request.Branch = Branch_Name;
	return this.ERROR_STATUS;
}
String get_branch() 
{	
	return Request.Branch;
}

int set_MinorReqType(int RequestType) 
{	
	Request.MinorReqType = RequestType;
	return this.ERROR_STATUS;
}

int get_MinorReqType() {
	
	return Request.MinorReqType;
}


int set_MajorReqType(int RequestType) 
{	
	Request.MajorReqType = RequestType;
	return this.ERROR_STATUS;
}

int get_MajorReqType() {
	
	return Request.MajorReqType;
}
int set_Request_Status(int Request_Status ) 
{
	Request.Req_Status = Request_Status;
	return this.ERROR_STATUS;
}

int get_Request_status() {
	return Req_Status;
}

int set_Request_email() {
	this.Req_email.Subject = Request.REQ_number;
	this.Req_email.TO_Field= Request.Branch; /**/	
	this.Req_email.Body="Kindly Take Your Action , To approve this Request Respond with DONE "
			+ "To Reject Respond with REJECT:<REJECTION REASON>";
	/*this should be implemented */
	this.Req_email.Attachment_path = this.Req_email.get_attachment_path();
	/**for development*/
	System.out.println("Subject =  "+
	this.Req_email.Subject+"\n"+"TO: "+this.Req_email.TO_Field+"\n"+ "BODY: "+this.Req_email.Body+"\n"+"Attachment Path : "+this.Req_email.Attachment_path);
return this.ERROR_STATUS;
}

}
