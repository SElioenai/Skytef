package skytef.fidelidade;


import javax.persistence.Persistence;

public class CreateTableTest {

		public static void main(String[] args) {
			Persistence.createEntityManagerFactory("Sky");
		}
	}
