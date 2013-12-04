package ch.bfh.www.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Utility {
	private static EntityManagerFactory emf = null;
	private static EntityManager em = null;
	
	public static EntityManager getEM() {
		if(emf == null){
			emf = Persistence.createEntityManagerFactory("ElectronicHealthRecordServices");
			em = emf.createEntityManager();
		}
		return em;
	}
	
}
