package com.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="carlist_details")
@Entity
public class CarList {
@Id
private int carId;
private String CarName;
private String CarYear;
private String CarColors;
private String CarPrice;
public int getCarId() {
	return carId;
}
public void setCarId(int carId) {
	this.carId = carId;
}
public String getCarName() {
	return CarName;
}
public void setCarName(String carName) {
	CarName = carName;
}
public String getCarYear() {
	return CarYear;
}
public void setCarYear(String carYear) {
	CarYear = carYear;
}
public String getCarColors() {
	return CarColors;
}
public void setCarColors(String carColors) {
	CarColors = carColors;
}
public String getCarPrice() {
	return CarPrice;
}
public void setCarPrice(String carPrice) {
	CarPrice = carPrice;
}
}
