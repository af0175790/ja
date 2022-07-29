package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="carSales_details")
@Entity
public class SalesList {
@Id
private int salesId;
private String CustomerName;
private String CustomerCar;
private int Quantity;
private String TotalPrice;
public int getSalesId() {
	return salesId;
}
public void setSalesId(int salesId) {
	this.salesId = salesId;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public String getCustomerCar() {
	return CustomerCar;
}
public void setCustomerCar(String customerCar) {
	CustomerCar = customerCar;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
public String getTotalPrice() {
	return TotalPrice;
}
public void setTotalPrice(String totalPrice) {
	TotalPrice = totalPrice;
}
}
