package br.b2w.starwars.service;

import java.util.List;

import br.b2w.starwars.model.Planet;

/**Classe responsável por encapsular as regras de negócio dos serviços e acesso a camada de dados.
 * 
 * @author diego.oliveira
 *
 */
public interface PlanetService {

	
	/**Salva um novo planeta na BD.
	 * 
	 * @param planet: Objeto {@link Planet} a ser persistido.
	 * @return Planet: Objeto já persistido.
	 */
	public Planet saveNewPlanet(Planet planet);
	
	
	/**Retorna todos os planetas cadastrados na BD.
	 * 
	 * @return List<Planet>: Listagem de todos os planetas cadastrados na BD.
	 */
	public List<Planet> findAllPlanets();
	
	
	/**Retorna um objeto {@link Planet} a partir do seu nome.
	 * 
	 * @param name: nome do planeta a ser pesquisado.
	 * @return Planet: Objeto obtido da BD. 
	 */
	public Planet findByName(String name);
	
	/**Retorna para o endpoint um planeta a partir do seu id.
	 * 
	 * @param id: Chave primaria do objeto {@link Planet} a ser pesquisado da BD.
	 * @return {@link Planet}
	 */
	public Planet findById(Integer id);
	
	
	/**Remove um planeta da BD a partir do seu id.
	 * 
	 * @param id: Chave primaria do objeto {@link Planet} a ser deletado da BD.
	 */
	public void removePlanet(Integer id);
}
