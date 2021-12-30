package com.xworkz.temp;

public class FestivalDTO {
	private int id;
	private String name;
	private String date;
	private String place;
	public FestivalDTO() {
		
	}
	public FestivalDTO(int id, String name, String date, String place) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.place = place;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDate() {
		return date;
	}
	public String getPlace() {
		return place;
	}
	@Override
	public String toString() {
		return "FestivalDTO [id=" + id + ", name=" + name + ", date=" + date + ", place=" + place + "]";
	}
	

}
