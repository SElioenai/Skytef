package skytef.fidelidade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int client_id;
	@Column (nullable=false, length=200)
	private String name;
	@Column (nullable=false, length=200)
	private String cpf;
	@Column (nullable=false, length=200)
	private String rg;
	@Column (nullable=false, length=200)
	private String bith_date;
	@Column (nullable=true, length=200)
	private String street;
	@Column (nullable=true, length=200)
	private String county;
	@Column (nullable=true, length=200)
	private String state;
	@Column (nullable=true, length=200)
	private String email;
	@Column (nullable=true, length=200)
	private String fone;
	@Column (nullable=false, length=200)
	private String register_date;
	
	public int getId_client() {
		return client_id;
	}
	public void setId_client(int client_id) {
		this.client_id = client_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getBith_date() {
		return bith_date;
	}
	public void setBith_date(String bith_date) {
		this.bith_date = bith_date;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getRegister_date() {
		return register_date;
	}
	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}


	

}
