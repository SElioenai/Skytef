package skytef.fidelidade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name = "benefit")
public class Benefit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_benefit;
	@Column (nullable=false, length=200)
	private String type;
	@Column (nullable=false, length=200)
	private String name;
	@Column (nullable=true, length=200)
	private String point;
//	@ManyToOne @JoinColumn(name = "partner_id")
	private String company;
}
