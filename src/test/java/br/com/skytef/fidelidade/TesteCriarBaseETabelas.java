package br.com.skytef.fidelidade;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("skytef");
	}
}
