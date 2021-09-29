public class DominosDTO{

public DominosDTO(){

}

private String name;
private long id;
private String branch;
private boolean isOpen;
private double disscount;

public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}
 
 public long getId(){
 return id;
 
 }

 public void setId(long id){
 this.id=id;
 }
 public String getBranch(){
 return branch;
 }
 public void setBranch(String branch){
 this.branch=branch;
 }
 public boolean getIsOpen(){
 return isOpen;
 }
 public void setIsOpen(boolean isOpen){
 this.isOpen=isOpen;
 }

public double getDisscount(){
return disscount=disscount;
} 
 public void setDisscount(double disscount){
 this.disscount=disscount;
 }
}