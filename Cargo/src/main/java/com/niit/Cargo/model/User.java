package com.niit.Cargo.model;

import javax.persistence.Entity;

@Entity
public class User {
	String mailid;
String phonenumber;
String password;
String name;

String address;

public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
