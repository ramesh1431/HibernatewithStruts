package com.rs.country.countroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.rs.country.bean.Countries;
import com.rs.country.dao.CountryDao;
import com.rs.country.dao.CountryImpl;
import com.rs.country.form.CountryForm;
import com.rs.country.service.CountryService;
import com.rs.country.service.CountryServiceImpl;


public class CountryCountroller extends Action {
	
	
	//final static Logger logger = Logger.getLogger(FERServiceImpl.class);
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		CountryDao cd=new CountryImpl();
	//	CountryService cs=new CountryServiceImpl();
	//CountryForm cf=(CountryForm)form;
			Countries cf = new Countries();	

		cf.setCountryCode(request.getParameter("countryCode"));
		cf.setCountries(request.getParameter("Countries"));
		cf.setStates(request.getParameter("States"));
		cf.setDistricts(request.getParameter("Districts"));
		
		boolean registration = cd.SaveCountries(cf);
		if (registration) {
			return mapping.findForward("success"); 
			
		}else{

		return mapping.findForward("falied");
	}
	}

	
}
