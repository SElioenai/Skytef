package skytef.fidelidade.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "software_house")
public class SoftwareHouse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int softwarehouse_id;
	private String social_reason;
	private String cnpj;
	private String f_name;
	private String trade_representative;
	private String street;
	private String county;
	private String state;
	private String email;
	private String fone;
	private String register_date;
	
	public int getId_softwarehouse() {
		return softwarehouse_id;
	}
	public void setId_softwarehouse(int softwarehouse_id) {
		this.softwarehouse_id = softwarehouse_id;
	}
	public String getSocial_reason() {
		return social_reason;
	}
	public void setSocial_reason(String social_reason) {
		this.social_reason = social_reason;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getTrade_representative() {
		return trade_representative;
	}
	public void setTrade_representative(String trade_representative) {
		this.trade_representative = trade_representative;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCount() {
		return county;
	}
	public void setCount(String count) {
		this.county = count;
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
