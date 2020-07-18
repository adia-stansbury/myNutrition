package com.mynutrition.nutritionAPI;

import java.util.HashMap;

public class NutritionReport {
	private HashMap<Integer, Double> foodGramWeights;
	private Integer forNumberOfDays;

	NutritionReport(HashMap<Integer, Double>foodGramWeights, Integer forNumberOfDays){
		this.foodGramWeights = foodGramWeights;
		this.forNumberOfDays = forNumberOfDays;
	}
	
	public boolean isNutritionComplete() {
		// TODO: implement logic
		return true;
	}
}
