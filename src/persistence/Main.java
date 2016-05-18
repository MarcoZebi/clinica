package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("prova");
				EntityManager em = emf.createEntityManager();
				
					
				em.close();
				emf.close();

	}

}
