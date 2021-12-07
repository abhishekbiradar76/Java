package com.xworkz.cloneapp;

public class Laptop implements Cloneable {

	
		private String name;
		private String modelNo;
		private int price;
		private String specifictions;
		private boolean isAvailable;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getModelNo() {
			return modelNo;
		}
		public void setModelNo(String modelNo) {
			this.modelNo = modelNo;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getSpecifictions() {
			return specifictions;
		}
		public void setSpecifictions(String specifictions) {
			this.specifictions = specifictions;
		}
		public boolean isAvailable() {
			return isAvailable;
		}
		public void setAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
		@Override
		public String toString() {
			return "Laptop [name=" + name + ", modelNo=" + modelNo + ", price=" + price + ", specifictions="
					+ specifictions + ", isAvailable=" + isAvailable + "]";
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		}
	}
