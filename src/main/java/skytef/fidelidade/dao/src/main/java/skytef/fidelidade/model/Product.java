package skytef.fidelidade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
////import lombok.Getter;
////import lombok.Setter;
//
//@Getter
//@Setter

@Entity @Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int product_id;
	@Column (nullable=false, length=200)
	private String product_description;
	@Column (nullable=true, length=200)
	private double product_price;
	
	public int getId_product() {
		return product_id;
	}
	public void setId_product(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	

	
}
