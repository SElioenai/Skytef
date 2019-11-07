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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
	@Id
	@JsonProperty
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	@JsonProperty
	private String name;
	@JsonProperty
	private String password;
	
	public User(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	}
