package com.ssi.services;

import org.springframework.stereotype.Component;

import com.ssi.models.InterestModel;

@Component
public class InterestService {
	public InterestModel calculate(InterestModel model){
		int interest=model.getAmount()*model.getTime()*10/100;
		model.setInterest(interest);
		return model;
	}
}
