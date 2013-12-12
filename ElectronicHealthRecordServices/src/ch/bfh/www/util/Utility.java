package ch.bfh.www.util;

import java.util.Date;
import java.util.GregorianCalendar;

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
	
	/**
	 * Returns a Person object created from the person and address objects from the db
	 * @param dbPerson
	 * @return Person object
	 */
	public static ch.bfh.www.ehrservices.Person createPersonWithAddressHelper(ch.bfh.www.ehrservices.entities.Person dbPerson) {
		
		// Create Person object 
		ch.bfh.www.ehrservices.Person person = new ch.bfh.www.ehrservices.Person();
		person.setAddress(createAddressHelper(dbPerson.getAddress()));
		
		person.setTitle(dbPerson.getTitle());
		person.setName(dbPerson.getName());
		person.setGender(dbPerson.getGender());
		person.setMobile(dbPerson.getMobile());
		person.setPhone(dbPerson.getPhone());
		
		person.setBirthdate(convertDateToCalendar(dbPerson.getBirthdate()));
		person.setEmail(dbPerson.getEmail());
		person.setFirstname(dbPerson.getFirstname());
		
		return person;
	}
	
	/**
	 * Returns a Address object created from the address object from the db
	 * @param dbAddress
	 * @return Address object
	 */
	public static ch.bfh.www.ehrservices.Address createAddressHelper(ch.bfh.www.ehrservices.entities.Address dbAddress) {
		// Create Address object
		ch.bfh.www.ehrservices.Address address = new ch.bfh.www.ehrservices.Address();
		address.setAddress(dbAddress.getAddress());
		address.setCanton(dbAddress.getCanton());
		address.setCountry(dbAddress.getCountry());
		address.setMunicipality(dbAddress.getMunicipality());
		address.setPostalcode(dbAddress.getPostalcode());
		
		return address;
	}
	
	/**
	 * Returns a Gregorian Calendar object which is converted from a date
	 * @param date
	 * @return calendar
	 */
	public static GregorianCalendar convertDateToCalendar(Date date) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		return cal;
	}
	
}
