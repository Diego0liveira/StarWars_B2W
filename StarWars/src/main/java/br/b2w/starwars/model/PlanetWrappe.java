package br.b2w.starwars.model;

import java.util.List;

public class PlanetWrappe {

	private String next;
	private List<Planet> results;
	
	public PlanetWrappe() {
		// TODO Auto-generated constructor stub
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public List<Planet> getResults() {
		return results;
	}

	public void setResults(List<Planet> results) {
		this.results = results;
	}
}