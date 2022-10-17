package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter@Setter
public class Product {
	
	@Id
	@Column(columnDefinition = "varchar(9)")
	private String id;
	private String name;
	private double price;
}
