package cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n03.S04T02N03AmorLopezChristian.model.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "fruites")
public class FruitaEntity {
	
	@Id
	private int id;
	
	@Field("name")
	private String name;
	
	@Field ("QuantitatKilos")
	private int quantitatKilos;
	
	public FruitaEntity() {}
	
	public FruitaEntity(String name, int quantitatKilos) {
		this.name = name;
		this.quantitatKilos = quantitatKilos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantitatKilos() {
		return quantitatKilos;
	}

	public void setQuantitatKilos(int quantitatKilos) {
		this.quantitatKilos = quantitatKilos;
	}
	

	
}
