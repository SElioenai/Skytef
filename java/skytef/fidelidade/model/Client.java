package skytef.fidelidade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity @Table(name = "client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long client_id;
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

}
