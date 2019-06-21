package kz.devyellow.RestoApp.modules.menu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Getter
	@Setter
	private Integer id;

	@Getter
	@Setter
	private String nomination;

	@Getter
	@Setter
	private String definition;

	@Getter
	@Setter
	private Double price;

	//private boolean prepared;
	//private boolean served;

}
