package com.niit.Cargo.model;

import javax.persistence.Entity;

@Entity
public class Supplier {
int supplierid;
String suppliername;
public int getSupplierid() {
	return supplierid;
}
public void setSupplierid(int supplierid) {
	this.supplierid = supplierid;
}
public String getSuppliername() {
	return suppliername;
}
public void setSuppliername(String suppliername) {
	this.suppliername = suppliername;
}
}
