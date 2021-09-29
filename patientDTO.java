public class PatientDTO{

public PatientDTO(){

}


private long patientId;
private String patientName;
private int age; 
private String bloodGroup;
private String address;


public long getPatientId(){
return patientId;
	
	
}

public void setPatientId(long patientId){
	this.patientId=patientId;
	
}

public String getPatientName(){
	return patientName;
	
}

 public void setPatientName(String patientName){
	 
	 this.patientName=patientName;
	 
	 
 }

public int getAge(){
	
	return age;
	
}

public void setAge(int age){
	this.age=age;
	
	
}



public String getBloodGroup(){
	return bloodGroup;
}

public void setBloodgroup(String bloodGroup){
	this.bloodGroup=bloodGroup;
	
}
public String getAddress(){
	return address;
}
public  void setAddress(String Address){
	this.address=address;																														
}
}