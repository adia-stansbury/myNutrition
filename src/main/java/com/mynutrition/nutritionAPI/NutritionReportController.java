package com.mynutrition.nutritionAPI;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class NutritionReportController {
	
//	private final NutritionReportRepository repository;
	// TODO: https://spring.io/guides/tutorials/rest/
	
//	NutritionReportController() {
//		
//	}
	
	// example request body
	// foodGramAmounts = { food_id: 100 }
	// 100g of cream of wheat
	// over period of time - forNumberOfDays
	
	@PostMapping("/nutritionReport")
	// TODO: fix method
	boolean newNutritionReport(@RequestBody NutritionReport newNutritionReport) {
		return newNutritionReport.isNutritionComplete();
	}
}