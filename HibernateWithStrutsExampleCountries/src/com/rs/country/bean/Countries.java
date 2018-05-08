package com.rs.country.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "Countries")
public class Countries {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String countryCode;
	@Column
	private String Countries;
	@Column
	private String States;
	@Column
	private String Districts;

	public String getCountries() {
		return Countries;
	}

	public void setCountries(String countries) {
		Countries = countries;
	}

	public String getStates() {
		return States;
	}

	public void setStates(String states) {
		States = states;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistricts() {
		return Districts;
	}

	public void setDistricts(String districts) {
		Districts = districts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}