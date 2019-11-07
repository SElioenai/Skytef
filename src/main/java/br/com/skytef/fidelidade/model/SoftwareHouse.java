package br.com.skytef.fidelidade.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity 
@Table(name = "software_house")
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
	
}
