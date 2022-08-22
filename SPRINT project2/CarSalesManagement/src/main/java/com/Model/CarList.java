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
@Table(name="carlist_details")
@Entity
public class CarList {
	@Id
	@Column(name="car_id")
	private int id;
	@Column(name="car_name")
	private String name;
	@Column(name="car_year")
	private String year;
	@Column(name="car_color")
	private String colors;
	@Column(name="car_price")
	private String price;
}
