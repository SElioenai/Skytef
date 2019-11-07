package br.com.skytef.fidelidade.model;

import java.awt.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "partner_company")
public class PartnerCompany {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int partner_id;
	private String social_reason;
	private String cnpj;
	private String f_name;
	private String street;
	private String county;
	private String state;
	private String email;
	private String fone;
	private String register_date;
	private List benefits;

}
