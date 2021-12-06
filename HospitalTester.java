package com.xworkz.hospital.hospital;


	

	import com.sun.media.sound.SoftMixingSourceDataLine;
import com.xworkz.hospital.dto.*;
	import java.util.*;

	public class HospitalTester{

	public static void main(String a[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of patients:");
	int size=sc.nextInt();

	Hospital hospital=new Hospital(size);

	for(int i=0;i<size;i++){

	PatientDTO dto=new PatientDTO();
	System.out.println("enter patient id:");
	int patientId=sc.nextInt();
	dto.setPatientId(patientId);

	System.out.println("enter patient name:");
	String patientName=sc.next();
	dto.setPatientName(patientName);

	System.out.println("enter patient age:");
	int age=sc.nextInt();
	dto.setAge(age);

	System.out.println("enter patient Gender:");
	String gender=sc.next();
	dto.setGender(gender);

	System.out.println("enter patient bloodGroup:");
	String bloodGroup=sc.next();
	dto.setBloodGroup(bloodGroup);

	System.out.println("enter patient Contact number:");
	long contactNo=sc.nextLong();
	dto.setContactNo(contactNo);

	AddressDTO address=new AddressDTO();
	System.out.println("enter addressId and Addressname:");

	address.setAddressName(sc.next());

	CountryDTO country=new CountryDTO();
	System.out.println("enter countryId and countryName");
	country.setCountryId(sc.nextInt());
	country.setCountryName(sc.next());

	StateDTO state=new StateDTO();
	System.out.println("enter stateId and StateName");
	state.setStateId(sc.nextInt());
	state.setStateName(sc.next());

	DistrictDTO district=new DistrictDTO();
	System.out.println("enter districtId and districtname");
	district.setDistrictId(sc.nextInt());
	district.setDistrictName(sc.next());

	AreaDTO area=new AreaDTO();
	System.out.println("enter areaId and areaName");
	area.setAreaId(sc.nextInt());
	area.setAreaName(sc.next());

	StreetDTO street=new StreetDTO();
	System.out.println("enter streetId and streetName");
	street.setStreetId(sc.nextInt());
	street.setStreetName(sc.next());


	dto.setAddress(address);
	address.setCountryDto(country);
	country.setStateDto(state);
	state.setDistrictDto(district);
	district.setAreaDto(area);
	area.setStreetDto(street);






	boolean isAdded=hospital. createPatientDetails(dto);
	System.out.println(isAdded);
	//boolean isAdded1=hospital.createPatients(dto1);
	//System.out.println(isAdded1);
	}
	hospital.getAllPatients();      //this is used to print all the patients details();

	System.out.println("enter the patient name to fetch details:");
	String name=sc.next();
	System.out.println(hospital.getPatientByName(name));

	System.out.println("enter the patient id to fetch details:");
	int id=sc.nextInt();
	System.out.println(hospital.getPatientById(id));

	System.out.println("enter the patient Contact Num to fetch details:");
	long phno=sc.nextLong();
	System.out.println(hospital.getPatientByContactNo(phno));

	System.out.println("enter the patient BloodGroup to fetch details:");
	String bg=sc.next();
	System.out.println(hospital.getPatientByBloodGroup(bg));

	System.out.println("enter the patient Age to fetch details:");
	int ag=sc.nextInt();
	System.out.println(hospital.getPatientByAge(ag));

	System.out.println("enter the patient Gender to fetch details:");
	String gen=sc.next();
	System.out.println(hospital.getPatientByGender(gen));

	}

	

	}
	

