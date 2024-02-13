package cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n03.S04T02N03AmorLopezChristian.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n03.S04T02N03AmorLopezChristian.model.domain.FruitaEntity;
import cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n03.S04T02N03AmorLopezChristian.model.repository.FruitaEntityRepository;

@Service
public class FruitaEntityServiceImpl implements FruitaEntityService {
	
	@Autowired
	FruitaEntityRepository fruitaEntityRepository;

	@Override
	public FruitaEntity save(FruitaEntity fruitaEntity) {
		return fruitaEntityRepository.save(fruitaEntity);
	}

	@Override
	public FruitaEntity update(int id, FruitaEntity fruitaEntity) {
		FruitaEntity fruitaDb = fruitaEntityRepository.findById(id).get();
		
		fruitaDb.setName(fruitaEntity.getName());
		fruitaDb.setQuantitatKilos(fruitaEntity.getQuantitatKilos());
		
		
		return fruitaEntityRepository.save(fruitaDb);
	}

	@Override
	public String delete(int id) {
		fruitaEntityRepository.deleteById(id);
		return "Se ha eliminado el objeto correctamente";
	}

	@Override
	public List<FruitaEntity> findAll() {
		return fruitaEntityRepository.findAll();
	}

	@Override
	public Optional<FruitaEntity> findById(int id) {
		return fruitaEntityRepository.findById(id);
	}

}
