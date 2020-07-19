package com.mynutrition.nutritionAPI;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.*;

import org.junit.jupiter.api.Test;

class NutritionReportControllerTest {

	@Test
	final void PostReport() throws URISyntaxException, IOException, InterruptedException {
//		uri = method:org.junit.NutritionAPIController#report;
		HttpClient client = HttpClient.newBuilder().build();
		URI uri = new URI("nutritionReport/report");
		// foodGramAmounts = { food_id: 100 }
		// 100g of cream of wheat
		// over period of time - forNumberOfDays
		String postBody = "forNumberOfDays: 1";
		HttpRequest.BodyPublisher bodyPublisher = BodyPublishers.ofString(postBody);
		HttpRequest request = HttpRequest.newBuilder(uri).POST(bodyPublisher).build();
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		
		assertEquals(200, response.statusCode());
	}

}