package br.b2w.starwars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.b2w.starwars.model.Planet;
import br.b2w.starwars.service.PlanetService;

/**Controller implementador dos endpoints de planetas.
 * 
 * @author diego.oliveira
 */
@RestController
@RequestMapping(
		value="/planet",
		produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
		consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PlanetController {
	
	@Autowired
	private PlanetService planetService;

	/**Esse endpoint deverá adicionar um planeta com as seguintes propriedades: 
	 * (nome, clima e terreno).
	 * 
	 *  •Endpoint: http://localhost:8080/planet
	 *  •HTTP Method: POST
	 *  •HTTP Success Response Code: CREATED (201) 
	 *  
	 * @param planetWrappe : Objeto {@link Planet} enviado ao endpoint.
	 * @return ResponseEntity : Objeto {@link Planet} já persistido na BD.
	 */
	@PostMapping
	@ResponseBody
	public ResponseEntity<Planet> addPlanet(@RequestBody Planet planet) {
		return new ResponseEntity<Planet>(planetService.saveNewPlanet(planet), HttpStatus.CREATED);
	}
	
	
	/**Endpoint responsável por listar todos os planetas existentes na aplicação.
	 * 
	 *  •Endpoint: http://localhost:8080/planet/list
	 *  •HTTP Method: GET
	 *  •HTTP Success Response Code: OK (200)    
	 * 
	 * @return
	 */
	@GetMapping(value="/list")
	public ResponseEntity<List<Planet>> listPlanet() {
		return new ResponseEntity<List<Planet>>(planetService.findAllPlanets(), HttpStatus.OK);
	}
	
	
	/**Endpoint responsável por obter um Planeta través do seu nome.
	 * 
	 *  •Endpoint: http://localhost:8080/planet/
	 *  •HTTP Method: GET
	 *  •HTTP Success Response Code: OK (200)   
	 *  
	 * @param name
	 * @return
	 */
	@GetMapping(value="/")
	public ResponseEntity<Planet> getPlanetByName(@RequestBody Planet planet) {
		return new ResponseEntity<Planet>(planetService.findByName(planet.getName()), HttpStatus.OK);
	}
	
	
	/**Endpoint responsável por obter um Planeta través do seu id.
	 * 
	 *  •Endpoint: http://localhost:8080/planet/{planetId}
	 *  •HTTP Method: GET
	 *  •HTTP Success Response Code: OK (200)   
	 * 
	 * @param planetId
	 * @return
	 */
	@GetMapping(value="/{planetId}")
	public ResponseEntity<Planet> getPlanetById(@PathVariable("planetId") Integer planetId) {
		return new ResponseEntity<Planet>(planetService.findById(planetId), HttpStatus.OK);
	}
	
	
	/**Endpoint responsável por deletar um Planeta través do seu id.
	 * 
	 *  •Endpoint: http://localhost:8080/planet/{planetId}
	 *  •HTTP Method: DELETE
	 *  •HTTP Success Response Code: OK (200)   
	 * 
	 * @param planetId
	 * @return
	 */
	@DeleteMapping(value="/{planetId}")
	@ResponseStatus(HttpStatus.OK)
	public void removePlanet(@PathVariable("planetId") Integer planetId) {
		planetService.findById(planetId);
	}
}