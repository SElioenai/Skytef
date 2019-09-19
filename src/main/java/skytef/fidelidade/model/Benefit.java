package skytef.fidelidade.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name = "benefit")
public class Benefit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_benefit;
	private String type;
	private String name;
	private String point;
	@ManyToOne @JoinColumn(name = "partner_id")
	private String company;
	
	public int getId_benefit() {
		return id_benefit;
	}
	public void setId_benefit(int id_benefit) {
		this.id_benefit = id_benefit;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
}
