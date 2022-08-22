package com.Service;

import java.util.List;
import com.Model.CarList;
import com.Model.SalesList;


public interface CarSalesService {

	CarList saveCar(CarList car);
	
	List<CarList> getAllCars();
	
    CarList getCarById(int id); 
	
	void deleteCarById(int id); 
	
	CarList updateCarById(CarList car,int id);
	
	
	SalesList saveSale(SalesList sale);
	
    List<SalesList> getAllSales();
	
    SalesList getSaleById(int id); 
	
	void deleteSaleById(int id); 
	
	SalesList updateSaleById(SalesList sale,int id);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
