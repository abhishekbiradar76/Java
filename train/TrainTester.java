package com.train;

public class TrainTester {
public static void main(String[] args) {
	TrainDTO dto= new TrainDTO(5,"fgh","gfhgghh","dfg","u","r,",98,"aqw");
	TrainDAO dao= new TrainDAO();
	System.out.println(dao.save(dto));
	TrainDTO dto1= new TrainDTO(2);
	TrainDAO dao1= new TrainDAO();
	System.out.println(dao.deleteByNoAndId(dto1));
}
}
