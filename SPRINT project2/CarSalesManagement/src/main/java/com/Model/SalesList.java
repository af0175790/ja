package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="carSales_details")
@Entity
public class SalesList {
	@Id
	@Column(name="sales_id")
	private int id;
	@Column(name="sales_customername")
	private String name;
	@Column(name="sales_customercar")
	private String car;
	@Column(name="sales_quantity")
	private int quantity;
	@Column(name="sales_totalprice")
	private String price;
}
