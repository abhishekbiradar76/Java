package com.xworkz.hospital.dto;

public class StreetDTO {
private String streetName;
private int streetId;
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public int getStreetId() {
	return streetId;
}
public void setStreetId(int streetId) {
	this.streetId = streetId;
}
@Override
public String toString() {
	return "StreetDTO [streetName=" + streetName + ", streetId=" + streetId + "]";
}

}
