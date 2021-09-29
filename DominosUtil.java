class DominosUtil{

public static void main (String a[]){

DominosDTO dto=new DominosDTO();
dto.setName("sang");
dto.setId(1242);
dto.setBranch("raajajinagara");
dto.setIsOpen(true);
dto.setDisscount(0.3);
System.out.println(dto.getName()+"\n"+dto.getId()+"\n"+dto.getBranch()+"\n"+dto.getIsOpen()+"\n"+dto.getDisscount());



}


}