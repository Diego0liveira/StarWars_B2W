/**
 * 
 */
package br.b2w.starwars.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.b2w.starwars.model.Planet;

/**Interface responsável por disponibilizar todos os metodos implemntados pelo framework Spring Data.
 * 
 * @author diego.oliveira
 */
public interface PlanetRepository  extends MongoRepository<Planet, String> {

	public Planet findByName(String name);
	public Planet findFirstByOrderByIdDesc();
}