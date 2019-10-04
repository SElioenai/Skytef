package skytef.fidelidade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity @Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int product_id;
	@Column (nullable=false, length=200)
	private String product_description;
	@Column (nullable=true, length=200)
	private double product_price;
}
