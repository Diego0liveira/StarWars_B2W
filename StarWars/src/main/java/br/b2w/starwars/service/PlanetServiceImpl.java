package br.b2w.starwars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.b2w.starwars.exception.IdNotValidationException;
import br.b2w.starwars.model.Planet;
import br.b2w.starwars.repository.PlanetRepository;

@Service
@Transactional
public class PlanetServiceImpl implements PlanetService {
	
	@Autowired
	private PlanetRepository planetRepository;
	
	
	private Long getFirstId() {

		try {
			return planetRepository.findFirstByOrderByIdDesc().getId() + 1;
		} catch (NullPointerException e) {
			return 1L;
		}
	}

	
	@Override
	public Planet saveNewPlanet(Planet planet) {
		planet.setId(getFirstId());
		return planetRepository.save(planet);
	}

	
	@Override
	public List<Planet> findAllPlanets() {
		return planetRepository.findAll();
	}

	
	@Override
	public Planet findByName(String name) {
		return planetRepository.findByName(name);
	}

	
	@Override
	public Planet findById(Integer id) {
		
		if (id <= 0) {
            throw new IdNotValidationException("Valor do campo id está invalido. Deve ser uma valor inteiro maior que zero.");
        }
		
		return planetRepository.findOne(String.valueOf(id));
	}

	
	@Override
	public void removePlanet(Integer id) {
		planetRepository.delete(String.valueOf(id));
	}
}