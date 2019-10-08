package com.testSpring.Ex03_ModelAttr;

public class UserVO {
	private String userName;
	private String address;
	private String car;

	//[region] setter getter
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	//[end]

	@Override
	public String toString() {
		return "UserVO [userName=" + userName + ", address=" + address + ", car=" + car + "]";
	}
}
