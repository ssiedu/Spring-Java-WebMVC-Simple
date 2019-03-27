package com.ssi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.models.InterestModel;
import com.ssi.services.InterestService;

@Controller
public class BankingController {

	@Autowired
	InterestService interestService;
	
	@RequestMapping("interest")
	public String showEntryForm(){
		return "dataentry.jsp";
	}
	
	@RequestMapping("calculate")
	public ModelAndView calculateInterest(@ModelAttribute("info") InterestModel model){
		interestService.calculate(model);
		ModelAndView mv=new ModelAndView("result.jsp");
		return mv;
		
	}
}
