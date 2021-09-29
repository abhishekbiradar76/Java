public class DrivingLicenceDTO{

public DrivingLicenceDTO(){

}
private String name;
private int idNumber;
private String address;
private int renewDate;
private String type;



public String getName(){
return name;
} 
public void setName(String name){
this.name=name;
}

public int getIdNumber(){
return idNumber;
}
public void setIdNumber(int idNumber){
this.idNumber=idNumber;
}
public String getAddress(){
return address;
}
public void setAddress(String address){
this.address=address;
}
public int getRenewDate(){
return renewDate;
}
public void setRenewDate(int renewDate){
this.renewDate=renewDate;
}
public String getType(){
return type; 
}
public void setType(String type){
this.type=type;
}
}