package com.vm.training.java.oops;

public class Address {
String state;
String city;
String country;
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String toString() {
	return "Address [state=" + state + ", city=" + city + ", country=" + country + "]";
}

}
