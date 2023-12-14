package com.coreym.javaPokemon.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PokemonList {
	
	@JsonProperty("results")
	private List<Pokemon> results;
	
	public PokemonList() {}

	public List<Pokemon> getResults() {
		return results;
	}

	public void setResults(List<Pokemon> results) {
		this.results = results;
	}
	
	

}
