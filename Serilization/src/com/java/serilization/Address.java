package com.java.serilization;

public class Address extends Employee {

	private String homeNo;

	private String streetName;

	private String cityName;

	public Address(String homeNo, String streetName, String cityName) {
		super();
		this.homeNo = homeNo;
		this.streetName = streetName;
		this.cityName = cityName;
	}

	public String getHomeNo() {
		return homeNo;
	}

	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [homeNo=" + homeNo + ", streetName=" + streetName + ", cityName=" + cityName + "]";
	}

}
