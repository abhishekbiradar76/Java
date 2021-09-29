class PatientUtil{
	
	public static void main (String a[]){
		
		PatientDTO dto = new PatientDTO();
		dto.setPatientId(12345);
		dto.setPatientName("dingaani");
		dto.setAge(55);
		dto.setBloodgroup("o+");
		dto.setAddress("bittBandHalli");
		System.out.println(dto.getPatientId()+"\n"+dto.getPatientName()+"\n"+dto.getAge()+"\n"+dto.getBloodGroup()+"\n"+dto.getAddress());
		
		
		
	}
	
	
	
	
}