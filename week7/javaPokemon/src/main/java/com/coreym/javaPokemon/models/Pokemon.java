package com.coreym.javaPokemon.models;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemon {
	
	private static Pokemon[] results;
	
	private Long id;
	
	private String name;
	
	private Double height;
	
	private Double weight;
	
	private String url;
	
	@JsonProperty("stats")
	private PokemonStat[] stats;
	
	@JsonProperty("sprites")
	private PokemonImagesList sprites;
	
	public Pokemon() {}

	public Pokemon(Long id, String name, Double height, Double weight, String[] types, PokemonStat[] stats, String url) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.stats = stats;
		this.url = url;
	}
	
	public static Pokemon[] getResults() {
		return results;
	}

	public static void setResults(Pokemon[] results) {
		Pokemon.results = results;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

//	public HashMap<String, PokemonStat> getStats() {
//		HashMap<String,PokemonStat> pokeStats = new HashMap<>();
//		for (PokemonStat stat : this.stats) {
//			System.out.println(stat.getStatInfo().getName());
//			pokeStats.put(stat.getStatInfo().getName(), stat);
//		}
//		return pokeStats;
//	}

	public void setStats(PokemonStat[] stats) {
		this.stats = stats;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public PokemonImagesList getSprites() {
		return sprites;
	}

	public void setSprites(PokemonImagesList sprites) {
		this.sprites = sprites;
	}

	public PokemonStat[] getStats() {
		return stats;
	}
	
	
	
	
	
	
	
	
}



	

	