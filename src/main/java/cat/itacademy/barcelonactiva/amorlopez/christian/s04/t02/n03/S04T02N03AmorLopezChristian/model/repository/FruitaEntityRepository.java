package cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n03.S04T02N03AmorLopezChristian.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n03.S04T02N03AmorLopezChristian.model.domain.FruitaEntity;

public interface FruitaEntityRepository extends MongoRepository<FruitaEntity, Integer>{

}
