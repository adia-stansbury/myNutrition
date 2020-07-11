package com.mynutrition.nutritionAPI;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class NutritionReportController {
	
	private final NutritionReportRepository repository;
	// TODO: https://spring.io/guides/tutorials/rest/
	
	@PostMapping("/nutritionReport")
	NutritionReport newNutritionReport(@RequestBody NutritionReport newNutritionReport) {
		return repository.save(newNutritionReport);
	}
	

}
