package gov.mil.weatherapp.controller;


import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
//import org.springframework.http.server.ServerHttpRequest;
//import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.MapperFeature;

import reactor.core.publisher.Mono;


@RestController
public class WeatherController {


	@GetMapping(value = "/weather")
	public Mono<String> getData(ServerHttpRequest request, ServerHttpResponse response) {
		System.out.println("In App method");
		//HttpHeaders headers = request.getHeaders();
		
		
		Mono<String> data = Mono.just("Weather Data2" );
		return data;
		
	}
}