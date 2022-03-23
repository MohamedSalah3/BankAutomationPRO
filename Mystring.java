package aui;

public class Mystring {

	String Input_Power_shell;
	String Output_Power_shell;
	String ERROR_STATUS ;
	boolean ERROR_STATUSb;
	Mystring(){
		
	}

void set_Input_Power_shell(String Parameter){
	this.Input_Power_shell=Parameter;
}

String get_Input_Power_shell(){
	return this.Input_Power_shell;
}

void set_Output_Power_shell(String Parameter){
	this.Output_Power_shell=Parameter;
}

String get_Output_Power_shell(){
	return this.Output_Power_shell;
}
	
void set_ERROR(String ERROR_STATUS) {
	this.ERROR_STATUS = ERROR_STATUS;
}	
String get_ERROR() {
	return this.ERROR_STATUS ;
}

public  void set_ERROR(boolean b) {

this.ERROR_STATUSb = b;
}	

public  boolean set_ERROR1(String b) {
boolean ret  = false;	
this.ERROR_STATUS = b;
if(this.ERROR_STATUS != null) {
	ret = true;
	
}else {
	ret = false;
}
return ret;
}
	
}
