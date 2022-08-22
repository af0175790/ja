package com.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Model.CarList;
import com.Model.SalesList;
import com.Service.CarSalesService;

@RestController
@RequestMapping("/carsales")
public class CarSalesController {

	@Autowired
	CarSalesService csservice;
	
	
	@PostMapping("/addcar")
	public ResponseEntity<CarList> saveCar( @RequestBody CarList car){
		return new ResponseEntity<CarList>(csservice.saveCar(car),HttpStatus.CREATED);	
		
	}
	
	@GetMapping("/getallcars")
	public List<CarList> getAllCars(){
		return csservice.getAllCars();
		
	}
	
	@GetMapping("/getcarbyid/{id}")
	public ResponseEntity<CarList> getCarById(@PathVariable("id") int id) {
		return new ResponseEntity<CarList>(csservice.getCarById(id),HttpStatus.OK);
		
	}
	
	@PutMapping("/updatecarbyid/{id}")
	public ResponseEntity<CarList> updateCarById(@PathVariable("id") int id,@RequestBody CarList car){
		return new ResponseEntity<CarList>(csservice.updateCarById(car,id),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deletecarbyid/{id}")
	public ResponseEntity<String> deleteCarById(@PathVariable("id") int id) {
		csservice.deleteCarById(id);
		return new ResponseEntity<String>("Car details deleted successfully",HttpStatus.OK);
	}
	
	@PostMapping("/addsale")
	public ResponseEntity<SalesList> saveSale( @RequestBody SalesList sale){
		return new ResponseEntity<SalesList>(csservice.saveSale(sale),HttpStatus.CREATED);	
		
	}
	
	@GetMapping("/getallsales")
	public List<SalesList> getAllSales(){
		return csservice.getAllSales();
		
	}
	
	@GetMapping("/getsalebyid/{id}")
	public ResponseEntity<SalesList> getSalesById(@PathVariable("id") int id) {
		return new ResponseEntity<SalesList>(csservice.getSaleById(id),HttpStatus.OK);
		
	}
	
	@PutMapping("/updatesalebyid/{id}")
	public ResponseEntity<SalesList> updateSaleById(@PathVariable("id") int id,@RequestBody SalesList sale){
		return new ResponseEntity<SalesList>(csservice.updateSaleById(sale,id),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deletesalebyid/{id}")
	public ResponseEntity<String> deleteSaleById(@PathVariable("id") int id) {
		csservice.deleteSaleById(id);
		return new ResponseEntity<String>("CarSales details deleted successfully",HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
