package br.com.skytef.fidelidade.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "benefit")
public class Benefit {
	@Id
	@JsonProperty
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_benefit;
	@JsonProperty
	private String type;
	@JsonProperty
	private String name;
	@JsonProperty
	private String point;
	@JsonProperty
	private String company;
}
