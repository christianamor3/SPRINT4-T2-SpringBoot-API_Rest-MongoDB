package cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n03.S04T02N03AmorLopezChristian.model.services;

import java.util.List;
import java.util.Optional;

import cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n03.S04T02N03AmorLopezChristian.model.domain.FruitaEntity;

public interface FruitaEntityService {

	FruitaEntity save(FruitaEntity fruitaEntity);
	
	FruitaEntity update(int id, FruitaEntity fruitaEntity);
	
	String delete (int id);
	
	List<FruitaEntity> findAll();
	
	Optional<FruitaEntity> findById(int id);
	
}
