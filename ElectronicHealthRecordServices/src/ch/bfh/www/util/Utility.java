package ch.bfh.www.util;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ch.bfh.www.ehrservices.AddressType;
import ch.bfh.www.ehrservices.DocumentLogType;
import ch.bfh.www.ehrservices.DocumentRegisterEntryType;
import ch.bfh.www.ehrservices.HealthCareProfessionalType;
import ch.bfh.www.ehrservices.OrganisationType;
import ch.bfh.www.ehrservices.OrganisationHPType;
import ch.bfh.www.ehrservices.PatientType;
import ch.bfh.www.ehrservices.PersonType;
import ch.bfh.www.ehrservices.entities.Address;
import ch.bfh.www.ehrservices.entities.Documentlog;
import ch.bfh.www.ehrservices.entities.Documentregister;
import ch.bfh.www.ehrservices.entities.Healthcareprofessional;
import ch.bfh.www.ehrservices.entities.Organisation;
import ch.bfh.www.ehrservices.entities.Organisationhp;
import ch.bfh.www.ehrservices.entities.Patient;
import ch.bfh.www.ehrservices.entities.Person;

/**
 * Utility methods
 * 
 * @author Dominik Gr�nert
 *
 */
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
	 * Returns a Patient object created from the patient object from the db
	 * Person and Address are not included!
	 * @param dbPatient
	 * @return patient object
	 */
	public static PatientType createPatientHelper(Patient dbPatient) {
		
		PatientType patient = new PatientType();
		patient.setMPI(dbPatient.getMpi());
		patient.setPatientID(dbPatient.getId());
		patient.setUsername(dbPatient.getUsername());
		patient.setPassword(dbPatient.getPassword());
		patient.setLanguage(dbPatient.getLanguage());
		
		return patient;
	}
	
	/**
	 * Returns a Person object created from the person and address objects from the db
	 * @param dbPerson
	 * @return Person object
	 */
	public static PersonType createPersonWithAddressHelper(Person dbPerson) {
		
		PersonType person = new PersonType();
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
	public static AddressType createAddressHelper(Address dbAddress) {
		
		AddressType address = new AddressType();
		
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
		GregorianCalendar cal = null;
		if(date != null) {
			cal = new GregorianCalendar();
			cal.setTime(date);
		}
		return cal;
	}
	
	/**
	 * Returns an organisation hp object from the organisation hp object from the db
	 * @param dbOrganisationHP
	 * @return organisation hp object
	 */
	public static OrganisationHPType createOrganisationHPHelper(Organisationhp dbOrganisationHP) {
		
		OrganisationHPType orgHp = new OrganisationHPType();
		OrganisationType org = createOrganisationHelper(dbOrganisationHP.getOrganisation());
		HealthCareProfessionalType hp = createHPHelper(dbOrganisationHP.getHealthcareprofessional());
		
		orgHp.setHealthcareProfessional(hp);
		orgHp.setHpType(dbOrganisationHP.getHptype().getNameDe()); // TODO Mehrsprachigkeit
		orgHp.setOrganisation(org);
		orgHp.setZsr(dbOrganisationHP.getZsr());
		orgHp.setOrganisationHPID(dbOrganisationHP.getId());
		
		return orgHp;
	}
	
	/**
	 * Retruns an organisation object created from the organisatin object from the db
	 * @param dbOrganisation
	 * @return organisation object
	 */
	public static OrganisationType createOrganisationHelper(Organisation dbOrganisation) {
		
		OrganisationType org = new OrganisationType();
		org.setOrganisationID(dbOrganisation.getId());
		org.setName(dbOrganisation.getNameDe()); // TODO Mehrsprachigkeit
		org.setOrganisationType(dbOrganisation.getOrganisationtype().getNameDe());
		org.setUrl(dbOrganisation.getUrl());
		org.setAddress(Utility.createAddressHelper(dbOrganisation.getAddress()));
		// TODO braucht es die Parents?
		
		return org;
	}
	
	/**
	 * Returns a healthcare professional object created from the hp object from the db
	 * @param dbHP
	 * @return HP object
	 */
	public static HealthCareProfessionalType createHPHelper(Healthcareprofessional dbHP) {
		
		HealthCareProfessionalType hp = new HealthCareProfessionalType();
		hp.setHcpID(dbHP.getId());
		hp.setFmh(dbHP.getFmh());
		hp.setGln(dbHP.getGln());
		hp.setHpc(dbHP.getHpc());
		hp.setPerson(Utility.createPersonWithAddressHelper(dbHP.getPerson()));
		hp.setQualitativeDignity(dbHP.getHptype().getNameDe()); // TODO Mehrsprachigkeit
		hp.setEmail(dbHP.getEmail());
		hp.setPhone(dbHP.getPhone());
		
		return hp;
	}
	
	
	/**
	 * Returns a documentregister object created from the documentregister object from the db
	 * @param dbDocRegister
	 * @return documentregister object
	 */
	public static DocumentRegisterEntryType createDocumentRegisterHelper(Documentregister dbDocRegister) {
		DocumentRegisterEntryType newDoc = new DocumentRegisterEntryType();			
		
		newDoc.setDocumentRegisterID(dbDocRegister.getId());			
		newDoc.setConfindentialityLevel(dbDocRegister.getConfidentialitylevel() != null ? dbDocRegister.getConfidentialitylevel().getNameDe() : null); // TODO Mehrsprachigkeit
		newDoc.setCreationDate(Utility.convertDateToCalendar(dbDocRegister.getCreationDate()));
		
		// add document log 
		for(Documentlog dbLog : dbDocRegister.getDocumentlogs()) {
			DocumentLogType log = new DocumentLogType();
			log.setAccessType(dbLog.getAccesstype().getNameDe()); // TODO Mehrsprachigkeit
			log.setOrganisationHp(Utility.createOrganisationHPHelper(dbLog.getOrganisationhp()));
			log.setTime(Utility.convertDateToCalendar(dbLog.getTime()));
			newDoc.addDocumentLog(log);
		}			
		newDoc.setDocumentType(dbDocRegister.getDocumenttype().getName());
		newDoc.setDocumentUploader(Utility.createOrganisationHPHelper(dbDocRegister.getOrganisationhp()));
		newDoc.setTitle(dbDocRegister.getTitle());
		newDoc.setUploadDate(Utility.convertDateToCalendar(dbDocRegister.getUploadDate()));
		newDoc.setDocumentRepositoryID(dbDocRegister.getDocumentrepository().getId());
		
		return newDoc;
	}
	
}
