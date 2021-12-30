package com.xworkz.temp;

public class FestTest {
public static void main(String[] args) {
	FestivalDTO dto[] = new FestivalDTO[5];
	dto[0] =new FestivalDTO(2,"sankranti","nov","india");
	dto[1]= new FestivalDTO(3,"holi","march","whole world");
	dto[2]=new FestivalDTO(4,"ramjan","august","pak");
	dto[3]= new FestivalDTO(5,"cristmas","december","london");
	dto[4]=new FestivalDTO(6,"good friday","dontknow","world");
	
	FestivalDAO dao= new FestivalDAO();
	for(int i=0;i<dto.length;i++) {
		//System.out.println(dao.save(dto[i]));
		
	}
	
	FestivalDAO dao1 = new FestivalDAO();
	for(int i=0;i<dto.length;i++) {
		System.out.println(dao1.delete(dto[i].getId()));
	}
	

}
}
