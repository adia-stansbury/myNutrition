package com.mynutrition.nutritionAPI;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.*;

import org.junit.jupiter.api.Test;

class NutritionAPIControllerTest {

	@Test
	final void PostReport() throws URISyntaxException, IOException, InterruptedException {
//		uri = method:org.junit.NutritionAPIController#report;
		HttpClient client = HttpClient.newBuilder().build();
		URI uri = new URI("method", "NutritionAPIController", "report");
		HttpRequest.BodyPublisher bodyPublisher = ???:
		HttpRequest request = HttpRequest.newBuilder(uri).POST(bodyPublisher).build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		
		assertEquals(200, response.statusCode());
	}

}