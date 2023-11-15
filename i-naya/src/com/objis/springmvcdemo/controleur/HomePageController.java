package com.objis.springmvcdemo.controleur;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.objis.springmvcdemo.domaine.Employe;
import com.objis.springmvcdemo.service.IEmployeManager;

@Controller
public class HomePageController {
	/*
	 * INJECTION Spring d'un bean Service dans le controleur. 
	 * Le bean Service est configur� dans objisapp-service.xml
	 */
	private IEmployeManager employeManager;

	@Autowired
	public void setEmployeManager(IEmployeManager employeManager) {
		this.employeManager = employeManager;
	}
	

}
