package com.DaoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HibernateUtil;
import com.Dao.SalesListDao;
import com.Entity.SalesList;

public class SalesListImpl implements SalesListDao {

	public void AddSales() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Create SalesId :");
		int id = s.nextInt();
		System.out.println("Create CustomerName :");
		String cname = s.next();
		System.out.println("Enter CustomerCar :");
		String ccar = s.next();
		System.out.println("Enter Quantity :");
		int quan = s.nextInt();
		System.out.println("Enter Total Price :");
		String tprice = s.next();
		SalesList r = new SalesList();
		r.setSalesId(id);
		r.setCustomerName(cname);
		r.setCustomerCar(ccar);
		r.setQuantity(quan);
		r.setTotalPrice(tprice);
		session.save(r);
		t.commit();
		System.out.println("Sales record inserted successfully");
		session.close();
		
	}

	public void UpdateSales() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter SalesId :");
		int id = s.nextInt();
		SalesList d = session.get(SalesList.class,id);
		System.out.println("Enter Updated CustomerName :");
		String cname = s.next();
		System.out.println("Enter Updated CustomerCar :");
		String ccar = s.next();
		System.out.println("Enter Updated Quantity :");
		int quan = s.nextInt();
		System.out.println("Enter Updated Total Price :");
		String tprice = s.next();
		d.setCustomerName(cname);
		d.setCustomerCar(ccar);
		d.setQuantity(quan);
		d.setTotalPrice(tprice);
		session.update(d);
		t.commit();
		System.out.println("Sales Record Updated Successfully");
		session.close();
	}

	public void DeleteSales() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter SalesId :");
		int id = s.nextInt();
		SalesList k = session.get(SalesList.class,id);
		session.delete(k);
		t.commit();
		System.out.println("Sales Record Deleted Successfully");
		session.close();
		
	}

	public void ShowSales() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter SalesId :");
		int id = s.nextInt();
		SalesList k = session.get(SalesList.class,id);
		System.out.println(" SalesId :"+k.getSalesId()+" CustomerName :"+k.getCustomerName()
		+" CustomerCar :"+k.getCustomerCar()
		+" Quantity :"+k.getQuantity()+" TotalPrice :"+k.getTotalPrice());
	}

}
