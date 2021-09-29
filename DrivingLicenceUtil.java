class DrivingLicenceUtil{

public static void main(String a[]){

DrivingLicenceDTO dto = new  DrivingLicenceDTO();
dto.setName("HERLY");
dto.setIdNumber(1234);
dto.setAddress("LosAngel");
dto.setRenewDate(2028);
dto.setType("TwoWheeler");
System.out.println(dto.getName()+"\n"+dto.getIdNumber()+"\n"+dto.getAddress()+"\n"+dto.getRenewDate()+"\n"+dto.getType());


}

}