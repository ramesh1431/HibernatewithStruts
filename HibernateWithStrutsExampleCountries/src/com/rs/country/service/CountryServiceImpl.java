package com.rs.country.service;

import com.rs.country.bean.Countries;
import com.rs.country.dao.CountryDao;

public class CountryServiceImpl implements CountryService {

CountryDao countryDao;
	public void setCountryDao(CountryDao countryDao) {
		this.countryDao = countryDao;
	}



	@Override
	public boolean SaveCountries(Countries countries) {
	
		return countryDao.SaveCountries(countries);
	}

}
