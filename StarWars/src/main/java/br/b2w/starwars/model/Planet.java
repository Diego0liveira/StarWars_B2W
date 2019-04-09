package br.b2w.starwars.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**Objeto que representa os dados de um planeta.
 * 
 * @author diego.oliveira
 */
@Document(collection = "starWars")
public class Planet implements Serializable {
	private static final long serialVersionUID = -6845223301416853862L;
	
	@Id
	private Long id;
	private String name;
	private String climate;
	private String terrain;
	@JsonIgnore
	private List<String>films;
	
	
	public Planet() {
		// TODO Auto-generated constructor stub
	}

	public Planet(Long id, String name, String climate, String terrain) {
		super();
		this.id = id;
		this.name = name;
		this.climate = climate;
		this.terrain = terrain;
	}

	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", climate=" + climate + ", terrain=" + terrain + "]";
	}
	
	@JsonProperty("count-films")
	public int getCountFilms() {
		return 5;
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

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getTerrain() {
		return terrain;
	}

	public void setGround(String terrain) {
		this.terrain = terrain;
	}
}