package com.rs.country.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rs.country.bean.Countries;
import com.rs.util.HibernateUtil;

public class CountryImpl extends RuntimeException implements CountryDao {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	//Countries countries = new Countries();
	Session session = null;

	@Override
	public boolean SaveCountries(Countries countries) {

		boolean registrationFlag = false;

		try {

			session = HibernateUtil.getSession();

			Transaction tr = session.beginTransaction();
			session.save(countries);
			tr.commit();
			registrationFlag = true;
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			session.close();
		}
		return registrationFlag;

	}

}