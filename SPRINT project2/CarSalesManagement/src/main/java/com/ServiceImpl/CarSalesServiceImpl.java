package com.ServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Exception.CarNotFoundException;
import com.Model.CarList;
import com.Model.SalesList;
import com.Repository.CarListRepository;
import com.Repository.SalesListRepository;
import com.Service.CarSalesService;

@Service
public class CarSalesServiceImpl implements CarSalesService {
	
	@Autowired
	CarListRepository crepo;
	
	@Autowired
	SalesListRepository srepo;

	@Override
	public CarList saveCar(CarList car) {
		
		return crepo.save(car);
	}

	@Override
	public List<CarList> getAllCars() {
		
		return crepo.findAll();
	}

	@Override
	public CarList getCarById(int id) {
		
		return crepo.findById(id).orElseThrow(()-> new CarNotFoundException("Car not found"));
	}

	@Override
	public void deleteCarById(int id) {
		crepo.findById(id).orElseThrow(()-> new CarNotFoundException("Car not found"));
		crepo.deleteById(id);
		
	}

	@Override
	public CarList updateCarById(CarList car, int id) {
		
		CarList c = crepo.findById(id).orElseThrow(()-> new CarNotFoundException("Car not found"));
		
		c.setName(car.getName());
		c.setColors(car.getColors());
		c.setPrice(car.getPrice());
		c.setYear(car.getYear());
		crepo.save(c);
		
		return c;
	}

	@Override
	public SalesList saveSale(SalesList sale) {
		
		return srepo.save(sale);
	}

	@Override
	public List<SalesList> getAllSales() {
		
		return srepo.findAll();
	}

	@Override
	public SalesList getSaleById(int id) {
		
		return srepo.findById(id).orElseThrow(()-> new CarNotFoundException("Sale id not found"));
	}

	@Override
	public void deleteSaleById(int id) {
		srepo.findById(id).orElseThrow(()-> new CarNotFoundException("Sale id not found"));
		srepo.deleteById(id);
		
	}

	@Override
	public SalesList updateSaleById(SalesList sale, int id) {
		
		SalesList s = srepo.findById(id).orElseThrow(()-> new CarNotFoundException("Sale id not found"));
		
		s.setCar(sale.getCar());
		s.setName(sale.getName());
		s.setPrice(sale.getPrice());
		s.setQuantity(sale.getQuantity());
		srepo.save(s);
		
		return s;
	}

}
