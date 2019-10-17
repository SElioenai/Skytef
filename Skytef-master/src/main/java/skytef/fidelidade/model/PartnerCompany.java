package skytef.fidelidade.model;

import java.awt.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "partner_company")
public class PartnerCompany {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int partner_id;
	@Column (nullable=false, length=200)
	private String social_reason;
	@Column (nullable=false, length=200)
	private String cnpj;
	@Column (nullable=true, length=200)
	private String f_name;
	@Column (nullable=false, length=200)
	private String street;
	@Column (nullable=false, length=200)
	private String county;
	@Column (nullable=false, length=200)
	private String state;
	@Column (nullable=true, length=200)
	private String email;
	@Column (nullable=true, length=200)
	private String fone;
	@Column (nullable=false, length=200)
	private String register_date;
//	@OneToMany(mappedBy = "company",
//			targetEntity = Benefit.class,
//			cascade = CascadeType.MERGE)
	private List benefits;

}
