package com.coreym.javaPokemon.controllers;

import java.io.UnsupportedEncodingException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.coreym.javaPokemon.models.Pokemon;
import com.coreym.javaPokemon.models.PokemonList;

@RestController
public class ApiController {

	private final String API = "https://pokeapi.co/api/v2/";
	private final WebClient client = WebClient.create();

	@GetMapping("/api/pokemon")
	public PokemonList getAllPokemon(@RequestParam(value="offset", defaultValue="0", required=false) Integer offset) {
		
		PokemonList response = client.get()
			.uri(API + "/pokemon?offset=" + offset)
			.retrieve()
			.bodyToMono(PokemonList.class)
			.block();
		
		return response;
	}

	@GetMapping("/api/pokemon/get")
	public Pokemon fetchData(String url) throws UnsupportedEncodingException {
		
		System.out.println(url);
		Pokemon response = client.get()
				.uri(url)
				.retrieve()
				.bodyToMono(Pokemon.class)
				.block();

		return response;
	}
	
	@GetMapping("/api/pokemon/search")
	public Pokemon fetchDataByName(String name) throws UnsupportedEncodingException {
		System.out.println(API + "/pokemon/rhyhorn");
		Pokemon response = client.get()
				.uri(API + "/pokemon/" + name)
				.retrieve()
				.bodyToMono(Pokemon.class)
				
				.block();

		return response;
	}

}
