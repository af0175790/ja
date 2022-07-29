package com.DaoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HibernateUtil;
import com.Dao.CarListDao;
import com.Entity.CarList;

public class CarListImpl implements CarListDao {

	public void AddCar() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Create CarId :");
		int id = s.nextInt();
		System.out.println("Enter Car Name :");
		String cname = s.next();
		System.out.println("Enter Car Year :");
		String cyear = s.next();
		System.out.println("Enter Car Colors :");
		String ccolor = s.next();
		System.out.println("Enter Car Price :");
		String cprice = s.next();
		CarList c = new CarList();
		c.setCarId(id);
		c.setCarName(cname);
		c.setCarYear(cyear);
		c.setCarColors(ccolor);
		c.setCarPrice(cprice);
		session.save(c);
		t.commit();
		System.out.println("Car record inserted successfully");
		session.close();
	}

	public void UpdateCar() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter CarId :");
		int id = s.nextInt();
		CarList d = session.get(CarList.class,id);
		System.out.println("Enter Car Name :");
		String cname = s.next();
		System.out.println("Enter Car Year :");
		String cyear = s.next();
		System.out.println("Enter Car Colors :");
		String ccolor = s.next();
		System.out.println("Enter Car Price :");
		String cprice = s.next();
		d.setCarName(cname);
		d.setCarYear(cyear);
		d.setCarColors(ccolor);
		d.setCarPrice(cprice);
		session.update(d);
		t.commit();
		System.out.println("Car Record Updated Successfully");
		session.close();
	}

	public void DeleteCar() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter CarId :");
		int id = s.nextInt();
		CarList e = session.get(CarList.class,id);
		session.delete(e);
		t.commit();
		System.out.println("Car Record Deleted Successfully");
		session.close();
	}

	public void ShowCar() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter CarId :");
		int id = s.nextInt();
		CarList f = session.get(CarList.class,id);
		System.out.println(" CarId :"+f.getCarId()+" CarName :"+f.getCarName()+" CarYear :"+f.getCarYear()
		+" Car Colors :"+f.getCarColors()+" Car Price :"+f.getCarPrice());
	}

}
