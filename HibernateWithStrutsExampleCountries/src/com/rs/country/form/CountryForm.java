package com.rs.country.form;

import org.apache.struts.action.ActionForm;

public class CountryForm extends ActionForm {

	private static final long serialVersionUID = 1L;

	private String CountryCode;
	private String Countries;
	private String States;
	private String Districts;

	public String getCountryCode() {
		return CountryCode;
	}

	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}

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

	public String getDistricts() {
		return Districts;
	}

	public void setDistricts(String districts) {
		Districts = districts;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}