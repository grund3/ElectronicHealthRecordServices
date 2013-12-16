/**
 * EhrServicesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package ch.bfh.www.ehrservices;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;

import javax.activation.DataHandler;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import org.apache.axiom.attachments.ByteArrayDataSource;
import org.apache.tomcat.util.digester.SetRootRule;

import ch.bfh.www.ehrservices.entities.Blacklist;
import ch.bfh.www.ehrservices.entities.Documentrepository;
import ch.bfh.www.ehrservices.entities.Patientrole;
import ch.bfh.www.ehrservices.entities.Permissionmatrix;
import ch.bfh.www.ehrservices.entities.Whitelist;
import ch.bfh.www.util.Utility;

/**
 * EhrServicesSkeleton java skeleton for the axisService
 */
public class EhrServicesSkeleton {
	
	// Meine Behandelnden
	final private int roleCurrent = 1;
	
	// Behandelnder des Vertrauens
	final private int roleTrust = 2;
	
	// Potentieller Behandelnder
	final private int rolePotential = 3;	

	/**
	 * Returns a list of special permission for the given patient
	 * 
	 * @param int patient id
	 * @return list of special permissions
	 * 				- DocumentRegister
	 * 				- Healthcareprofessional
	 */

	public ch.bfh.www.ehrservices.GetSpecialPermissionByPatientResponse getSpecialPermissionByPatient(
			ch.bfh.www.ehrservices.GetSpecialPermissionByPatient getSpecialPermissionByPatient) {
		Query query = Utility.getEM().createQuery("SELECT pm From Permissionmatrix pm WHERE pm.patient.id = "+ getSpecialPermissionByPatient.getPatientID() +
				" AND pm.documentregister != null AND pm.healthcareprofessional != null");
		List<ch.bfh.www.ehrservices.entities.Permissionmatrix> dbPermissionmatrix = query.getResultList();
		
		GetSpecialPermissionByPatientResponse response = new GetSpecialPermissionByPatientResponse();
		
		for(ch.bfh.www.ehrservices.entities.Permissionmatrix dbEntry : dbPermissionmatrix) {			
			ch.bfh.www.ehrservices.SpecialPermissions specialPermission = new SpecialPermissions();
			specialPermission.setDocumentRegisterEntry(Utility.createDocumentRegisterHelper(dbEntry.getDocumentregister()));
			specialPermission.setHealthCareProfessional(Utility.createHPHelper(dbEntry.getHealthcareprofessional()));
						
			response.addSpecialPermissions(specialPermission);
		}
		
		return response;
	}

	/**
	 * Returns the meta data and related data from a document by the given document id and the given attributes
	 * Attributes:
	 * 	- int ConfidentialityLevelID
	 *  - calendar CreationDate (date without time)
	 *  - string DocumentTitle (Like)
	 *  - int DocumentTypeID
	 *  - int healthprofessionalID
	 *  - int organisationID
	 *  - calendar UploadDate (date without time)
	 *  
	 * @param int patient id, attributes see above
	 * @return documentRegister 
	 * 						- Organisation (1)
	 * 						- HealthcareProfessional (1)
	 * 							- Person => Address
	 * 						- DocumentLog (*)
	 */

	public ch.bfh.www.ehrservices.GetDocumentsByAttributesResponse getDocumentsByAttributes(
			ch.bfh.www.ehrservices.GetDocumentsByAttributes getDocumentsByAttributes) {
		
		ch.bfh.www.ehrservices.Attributes attributes = getDocumentsByAttributes.getAttributes();
		String statement = "SELECT dr From Documentregister dr WHERE dr.patient.id = "+ getDocumentsByAttributes.getPatientID();
		if(attributes.isConfindentialityLevelSpecified()) {
			statement += " AND dr.confidentialitylevel.nameDe = '" + attributes.getConfindentialityLevel() + "'"; // TODO how about ID?!!
		}
		if(attributes.isCreationDateSpecified()) {
			statement += " AND cast(dr.creationDate as date) = :creationDate";  
		}
		if(attributes.isDocumentTitleSpecified()) {
			statement += " AND dr.title LIKE '" + attributes.getDocumentTitle() + "'";
		}
		if(attributes.isDocumentTypeSpecified()) {
			statement += " AND dr.documenttype.name = '" + attributes.getDocumentType() + "'"; // TODO how about ID?!!
		}
		if(attributes.isHpcIDSpecified()) {
			statement += " AND dr.organisationhp.healthcareprofessional.id = " + attributes.getHpcID(); // TODO Werum HPC?!
		}
		if(attributes.isOrganisationIDSpecified()) {
			statement += " AND dr.organisationhp.organisation.id = " + attributes.getOrganisationID();
		}
		if(attributes.isUploadDateSpecified()) {
			statement += " AND cast(dr.uploadDate as date) = :uploadDate";  //:uploadDate"; 
		}
		
		
		Query query = Utility.getEM().createQuery(statement);
		if(attributes.isCreationDateSpecified()) {
			query.setParameter("creationDate", attributes.getCreationDate().getTime(), TemporalType.DATE);
		}
		if(attributes.isUploadDateSpecified()) {
			query.setParameter("uploadDate", attributes.getUploadDate().getTime(), TemporalType.DATE);
		}
		
		List<ch.bfh.www.ehrservices.entities.Documentregister> dbDocs = query.getResultList();
		
		// Create document register objects and add them to the array in the response object
		GetDocumentsByAttributesResponse response = new GetDocumentsByAttributesResponse();
		for(ch.bfh.www.ehrservices.entities.Documentregister doc : dbDocs) {			
			// create documentregister object
			response.addDocuments(Utility.createDocumentRegisterHelper(doc));
		}
		
		return response;
	}

	/**
	 * Returns a document by the given id
	 * 
	 * @param int id of the document
	 * @return blob file
	 */

	public ch.bfh.www.ehrservices.GetDocumentByIdResponse getDocumentById(
			ch.bfh.www.ehrservices.GetDocumentById getDocumentById) {
		Query query = Utility.getEM().createQuery("SELECT d From Documentrepository d WHERE d.id = "+ getDocumentById.getDocumentID());
		ch.bfh.www.ehrservices.entities.Documentrepository dbDocument = (Documentrepository) query.getSingleResult();
		
		// Create DocumentRepository object and add it to the response object
		GetDocumentByIdResponse response = new GetDocumentByIdResponse();
		// The file from the db is a byte array. The response needs a data handler object.
		// So we have to add the byte array over a file object into a data handler object.
		DataHandler dh = null;
		try {
			File outFile = new File("");              
			ByteArrayDataSource dataSource = new ByteArrayDataSource(dbDocument.getDocument()); 
			dh = new DataHandler(dataSource);              
			FileOutputStream fileOutputStream = new FileOutputStream(outFile);               
			dh.writeTo(fileOutputStream);             
			fileOutputStream.flush();              
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		response.setDocument(dh);
		
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param setEmergencyContact
	 * @return setEmergencyContactResponse
	 */

	public ch.bfh.www.ehrservices.SetEmergencyContactResponse setEmergencyContact(
			ch.bfh.www.ehrservices.SetEmergencyContact setEmergencyContact) {
		Utility.getEM().getTransaction().begin();
		
		// TODO patient id fehlt in wsdl....
		
		//ch.bfh.www.ehrservices.entities.Documentregister documentRegister = Utility.getEM().find(ch.bfh.www.ehrservices.entities.Documentregister.class, setConfidentiality.getDocumentRegisterID());
		//documentRegister.setConfidentialitylevel(Utility.getEM().find(ch.bfh.www.ehrservices.entities.Confidentialitylevel.class, setConfidentiality.getConfidentialityID()));
		
		//setEmergencyContact.get
		
		//Utility.getEM().persist(documentRegister);
		Utility.getEM().getTransaction().commit();
		
		SetEmergencyContactResponse response = new SetEmergencyContactResponse();
		response.setSuccess(true);
		
		return response;
	}

	/**
	 * Returns all emergency contact objects by the given patient id
	 * 
	 * @param int patient id
	 * @return list of emergencycontact objects
	 */

	public ch.bfh.www.ehrservices.GetEmergencyContactByPatientIdResponse getEmergencyContactByPatientId(
			ch.bfh.www.ehrservices.GetEmergencyContactByPatientId getEmergencyContactByPatientId) {
		Query query = Utility.getEM().createQuery("SELECT ec From Emergencycontact ec WHERE ec.patient.id = "+ getEmergencyContactByPatientId.getPatientID());
		List<ch.bfh.www.ehrservices.entities.Emergencycontact> dbEmergencyContact = query.getResultList();
		
		GetEmergencyContactByPatientIdResponse response = new GetEmergencyContactByPatientIdResponse();
		
		for(ch.bfh.www.ehrservices.entities.Emergencycontact dbEntry : dbEmergencyContact) {			
			
			// create person object
			ch.bfh.www.ehrservices.Person contact = Utility.createPersonWithAddressHelper(dbEntry.getPerson());
						
			response.addEmergencyContact(contact);
		}
		
		return response;
	}

	/**
	 * Login method. Gets Patient by given username and related Person and Address.
	 * 
	 * @param String Username
	 * @return Patient => Person => Address objects
	 */

	public ch.bfh.www.ehrservices.GetLoginResponse getLogin(
			ch.bfh.www.ehrservices.GetLogin getLogin) {
		String username = getLogin.getUsername();
		Query query = Utility.getEM().createQuery("SELECT p FROM Patient p WHERE p.username ='"+username+"'");
		ch.bfh.www.ehrservices.entities.Patient user = (ch.bfh.www.ehrservices.entities.Patient) query.getSingleResult();
		
		// Create Patient object
		ch.bfh.www.ehrservices.Patient patient = Utility.createPatientHelper(user);
		
		// create address and person object
		patient.setPerson(Utility.createPersonWithAddressHelper(user.getPerson()));
		
		// Create Response
		GetLoginResponse response = new GetLoginResponse();
		response.setPatient(patient);
		
		return response;
	}

	/**
	 * Returns a list of HPs which the patient has set on blacklist
	 * 
	 * @param int patient id
	 * @return list of HPs
	 */

	public ch.bfh.www.ehrservices.GetBlacklistByPatientIdResponse getBlacklistByPatientId(
			ch.bfh.www.ehrservices.GetBlacklistByPatientId getBlacklistByPatientId) {
		Query query = Utility.getEM().createQuery("SELECT bl From Blacklist bl WHERE bl.patient.id = "+ getBlacklistByPatientId.getPatientID());
		List<ch.bfh.www.ehrservices.entities.Blacklist> dbBlacklist = query.getResultList();
		
		GetBlacklistByPatientIdResponse response = new GetBlacklistByPatientIdResponse();
		
		for(ch.bfh.www.ehrservices.entities.Blacklist dbEntry : dbBlacklist) {			
			
			// create hp object
			ch.bfh.www.ehrservices.HealthCareProfessional hp = Utility.createHPHelper(dbEntry.getHealthcareprofessional());
						
			response.addHealthProfessionals(hp);
		}
		
		return response;
	}

	/**
	 * Returns all Roles 
	 * 
	 * @param boolean (doesn't' matter)
	 * @return Array with Roles
	 */

	public ch.bfh.www.ehrservices.GetRolesResponse getRoles(
			ch.bfh.www.ehrservices.GetRoles getRoles) {
		Query query = Utility.getEM().createQuery("SELECT r From Role r");
		List<ch.bfh.www.ehrservices.entities.Role> dbRoles = query.getResultList();
		
		// Create Role objects and add them to the array in the response object
		GetRolesResponse response = new GetRolesResponse();
		for(ch.bfh.www.ehrservices.entities.Role role : dbRoles) {
			ch.bfh.www.ehrservices.Role newRole = new ch.bfh.www.ehrservices.Role();
			newRole.setId(role.getId());
			newRole.setName(role.getNameDe()); //TODO Mehrsprachig
			response.addRoles(newRole);
		}
		
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param setSpecialPermission
	 * @return setSpecialPermissionResponse
	 */

	public ch.bfh.www.ehrservices.SetSpecialPermissionResponse setSpecialPermission(
			ch.bfh.www.ehrservices.SetSpecialPermission setSpecialPermission) {
		// TODO : Hier fehlt auch die personID im wsdl
		
		
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#setSpecialPermission");
	}

	/**
	 * Inserts a new blacklist object by the given patient and hp id
	 * 
	 * @param patient id, hp id
	 * @return true if successfully saved
	 */

	public ch.bfh.www.ehrservices.SetHpOnBlacklistResponse setHpOnBlacklist(
			ch.bfh.www.ehrservices.SetHpOnBlacklist setHpOnBlacklist) {
		Utility.getEM().getTransaction().begin();
		
		ch.bfh.www.ehrservices.entities.Blacklist blacklist = new Blacklist();
		blacklist.setPatient(Utility.getEM().find(ch.bfh.www.ehrservices.entities.Patient.class, setHpOnBlacklist.getPatientID()));
		blacklist.setHealthcareprofessional(Utility.getEM().find(ch.bfh.www.ehrservices.entities.Healthcareprofessional.class, setHpOnBlacklist.getHealthProfessionalID()));
		
		Utility.getEM().persist(blacklist);
		Utility.getEM().getTransaction().commit();
		
		SetHpOnBlacklistResponse response = new SetHpOnBlacklistResponse();
		response.setSuccess(true);
		
		return response;
	}

	/**
	 * Returns a list of organisation hp objects filtered by the given attributes
	 * Attributes: Roles => Trust, Current and Potential
	 * 
	 * It is not possible to set more than one role to filter!
	 * 
	 * @param int patient id, boolean which role
	 * @return list of organisation hp objects
	 */

	public ch.bfh.www.ehrservices.GetHPByPatientAndRoleResponse getHPByPatientAndRole(
			ch.bfh.www.ehrservices.GetHPByPatientAndRole getHPByPatientAndRole) {
		String statement = "SELECT pr From Patientrole pr WHERE pr.patient.id = " + getHPByPatientAndRole.getPatientID();
		if(getHPByPatientAndRole.getTrust()) {
			statement += " AND pr.role.id = " + roleTrust; 
		}
		else if(getHPByPatientAndRole.getCurrent()) {
			statement += " AND pr.role.id = " + roleCurrent;
		}
		else if(getHPByPatientAndRole.getPotential()) {
			statement += " AND pr.role.id = " + rolePotential;
		}
		else {
			// If there are no conditions set, it returns all HPs for the patient
		}
					
		Query query = Utility.getEM().createQuery(statement);	
		List<ch.bfh.www.ehrservices.entities.Patientrole> dbPatientRoleList = query.getResultList();
		
		GetHPByPatientAndRoleResponse response = new GetHPByPatientAndRoleResponse();
		
		for(ch.bfh.www.ehrservices.entities.Patientrole dbPatientRole : dbPatientRoleList) {			 
			
			// create organisation hp object
			ch.bfh.www.ehrservices.OrganisationHP orgHP = Utility.createOrganisationHPHelper(dbPatientRole.getOrganisationhp());
			
			response.addHealthcareProfessional(orgHP);
		}
		
		return response;
	}

	/**
	 * Update current patient permission matrix by given booleans
	 * 
	 * @param int patient id, permission booleans
	 * @return true if successfully saved
	 */

	public ch.bfh.www.ehrservices.SetPermissionMatrixForPatientResponse setPermissionMatrixForPatient(
			ch.bfh.www.ehrservices.SetPermissionMatrixForPatient setPermissionMatrixForPatient) {
		Utility.getEM().getTransaction().begin();
		
		Query query = Utility.getEM().createQuery("SELECT pm From Permissionmatrix pm WHERE pm.patient.id = "+ setPermissionMatrixForPatient.getPatientID() +
				" AND pm.documentregister = null AND pm.healthcareprofessional = null");
		ch.bfh.www.ehrservices.entities.Permissionmatrix dbMatrix = (Permissionmatrix) query.getSingleResult();
		
		List<ch.bfh.www.ehrservices.entities.Permissionschema> dbSchemas = dbMatrix.getPermissionschemas();
		ch.bfh.www.ehrservices.PermissionSchema schema = setPermissionMatrixForPatient.getPermissionSchema();
		
		// Mein Behandelnder - Administrative Daten
		dbSchemas.get(0).setValue(schema.getCareGiver_adminData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(0));
		
		// Mein Behandelnder - Nützliche Daten
		dbSchemas.get(1).setValue(schema.getCareGiver_usefulData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(1));
		
		// Mein Behandelnder - Medizinische Daten
		dbSchemas.get(2).setValue(schema.getCareGiver_medicalData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(2));
		
		// Mein Behandelnder - Stigmatisierende Daten
		dbSchemas.get(3).setValue(schema.getCareGiver_stigmatizingData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(3));
		
		// Mein Behandelnder des Vertrauens - Administrative Daten
		dbSchemas.get(4).setValue(schema.getCareGiverOfTrust_adminData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(4));
		
		// Mein Behandelnder des Vertrauens - Nützliche Daten
		dbSchemas.get(5).setValue(schema.getCareGiverOfTrust_usefulData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(5));
		
		// Mein Behandelnder des Vertrauens - Medizinische Daten
		dbSchemas.get(6).setValue(schema.getCareGiverOfTrust_medicalData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(6));
		
		// Mein Behandelnder des Vertrauens - Stigmatisierende Daten
		dbSchemas.get(7).setValue(schema.getCareGiverOfTrust_stigmatizingData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(7));
				
		// Potenzieller Behandelnder - Administrative Daten
		dbSchemas.get(8).setValue(schema.getPotentialCareGiver_adminData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(8));
		
		// Potenzieller Behandelnder - Nützliche Daten
		dbSchemas.get(9).setValue(schema.getPotentialCareGiver_usefulData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(9));
		
		// Notfall Behandelnder - Administrative Daten
		dbSchemas.get(10).setValue(schema.getEmergencyCareGiver_adminData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(10));
		
		// Notfall Behandelnder - Nützliche Daten
		dbSchemas.get(11).setValue(schema.getEmergencyCareGiver_usefulData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(11));
		
		// Notfall Behandelnder - Medizinische Daten
		dbSchemas.get(12).setValue(schema.getEmergencyCareGiver_medicalData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(12));
				
		// Notfall Behandelnder - Stigmatisierende Daten
		dbSchemas.get(13).setValue(schema.getEmergencyCareGiver_stigmatizingData() ? (byte)1 : (byte)0);
		Utility.getEM().persist(dbSchemas.get(13));
				
		Utility.getEM().getTransaction().commit();
		
		SetPermissionMatrixForPatientResponse response = new SetPermissionMatrixForPatientResponse();
		response.setSuccess(true);
		
		return response;
	}

	/**
	 * Insert a new whitelist object by the giver patient and receiver patient
	 * 
	 * @param giver patient id, receiver patient id
	 * @return true if successfully saved
	 */

	public ch.bfh.www.ehrservices.SetWhitelistResponse setWhitelist(
			ch.bfh.www.ehrservices.SetWhitelist setWhitelist) {
		Utility.getEM().getTransaction().begin();
		
		ch.bfh.www.ehrservices.entities.Whitelist whitelist = new Whitelist();
		whitelist.setPatient1(Utility.getEM().find(ch.bfh.www.ehrservices.entities.Patient.class, setWhitelist.getGiverPatientID()));
		whitelist.setPatient2(Utility.getEM().find(ch.bfh.www.ehrservices.entities.Patient.class, setWhitelist.getReceiverPatientID()));
		
		Utility.getEM().persist(whitelist);
		Utility.getEM().getTransaction().commit();
		
		SetWhitelistResponse response = new SetWhitelistResponse();
		response.setSuccess(true);
		
		return response;
	}

	/**
	 * Returns all confidentiality levels 
	 * 
	 * @param boolean (doesn't matter)
	 * @return array with confidentiality levels
	 */

	public ch.bfh.www.ehrservices.GetConfidentialityLevelsResponse getConfidentialityLevels(
			ch.bfh.www.ehrservices.GetConfidentialityLevels getConfidentialityLevels) {
		Query query = Utility.getEM().createQuery("SELECT c From Confidentialitylevel c");
		List<ch.bfh.www.ehrservices.entities.Confidentialitylevel> dbConfLevels = query.getResultList();
		
		// Create confidentiality level objects and add them to the array in the response object
		GetConfidentialityLevelsResponse response = new GetConfidentialityLevelsResponse();
		for(ch.bfh.www.ehrservices.entities.Confidentialitylevel confLevel : dbConfLevels) {
			ch.bfh.www.ehrservices.ConfidentialyLevel newConfLevel = new ch.bfh.www.ehrservices.ConfidentialyLevel();
			newConfLevel.setConfidentialyLevelID(confLevel.getId());
			newConfLevel.setName(confLevel.getNameDe()); //TODO Mehrsprachig
			response.addConfidentialyLevels(newConfLevel);
		}
		
		return response;
	}

	/**
	 * Returns all whitelist entries for patient by given id
	 * 
	 * @param int patient id
	 * @return Array of whitelist entries
	 */

	public ch.bfh.www.ehrservices.GetWhitelistByPatientIdResponse getWhitelistByPatientId(
			ch.bfh.www.ehrservices.GetWhitelistByPatientId getWhitelistByPatientId) {
		Query query = Utility.getEM().createQuery("SELECT wl From Whitelist wl WHERE wl.patient1.id = "+ getWhitelistByPatientId.getPatientID());
		List<ch.bfh.www.ehrservices.entities.Whitelist> dbWhitelist = query.getResultList();
		
		GetWhitelistByPatientIdResponse response = new GetWhitelistByPatientIdResponse();
		
		for(ch.bfh.www.ehrservices.entities.Whitelist dbEntry : dbWhitelist) {
			ch.bfh.www.ehrservices.Patient patient = Utility.createPatientHelper(dbEntry.getPatient2());
			patient.setPerson(Utility.createPersonWithAddressHelper(dbEntry.getPatient2().getPerson()));
			
			response.addPatients(patient);
		}
		
		
		return response;
	}

	/**
	 * Returns a collection of booleans for each editable permission schema entry in the currently set permission matrix for the patient. 
	 * True = 1 ; False = 0 in db
	 * 
	 * @param int patient id
	 * @return collection of booleans
	 */

	public ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientIdResponse getCurrentPermissionMatrixByPatientId(
			ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientId getCurrentPermissionMatrixByPatientId) {
		Query query = Utility.getEM().createQuery("SELECT pm From Permissionmatrix pm WHERE pm.patient.id = "+ getCurrentPermissionMatrixByPatientId.getPatientID() +
				" AND pm.documentregister = null AND pm.healthcareprofessional = null");
		ch.bfh.www.ehrservices.entities.Permissionmatrix dbMatrix = (Permissionmatrix) query.getSingleResult();
		
		GetCurrentPermissionMatrixByPatientIdResponse response = new GetCurrentPermissionMatrixByPatientIdResponse();
		
		// create permission schema object
		ch.bfh.www.ehrservices.PermissionSchema schema = new PermissionSchema();
		
		List<ch.bfh.www.ehrservices.entities.Permissionschema> dbSchemas = dbMatrix.getPermissionschemas();
		
		// Mein Behandelnder - Administrative Daten
		schema.setCareGiver_adminData(dbSchemas.get(0).getValue() != 0);
		
		// Mein Behandelnder - Nützliche Daten
		schema.setCareGiver_usefulData(dbSchemas.get(1).getValue() != 0);
		
		// Mein Behandelnder - Medizinische Daten
		schema.setCareGiver_medicalData(dbSchemas.get(2).getValue() != 0);
		
		// Mein Behandelnder - Stigmatisierende Daten
		schema.setCareGiver_stigmatizingData(dbSchemas.get(3).getValue() != 0);
		
		// Mein Behandelnder des Vertrauens - Administrative Daten
		schema.setCareGiverOfTrust_adminData(dbSchemas.get(4).getValue() != 0);
		
		// Mein Behandelnder des Vertrauens - Nützliche Daten
		schema.setCareGiverOfTrust_usefulData(dbSchemas.get(5).getValue() != 0);
		
		// Mein Behandelnder des Vertrauens - Medizinische Daten
		schema.setCareGiverOfTrust_medicalData(dbSchemas.get(6).getValue() != 0);
		
		// Mein Behandelnder des Vertrauens - Stigmatisierende Daten
		schema.setCareGiverOfTrust_stigmatizingData(dbSchemas.get(7).getValue() != 0);
		
		// Potenzieller Behandelnder - Administrative Daten
		schema.setPotentialCareGiver_adminData(dbSchemas.get(8).getValue() != 0);
		
		// Potenzieller Behandelnder - Nützliche Daten
		schema.setPotentialCareGiver_usefulData(dbSchemas.get(9).getValue() != 0);
		
		// Notfall Behandelnder - Administrative Daten
		schema.setEmergencyCareGiver_adminData(dbSchemas.get(10).getValue() != 0);
		
		// Notfall Behandelnder - Nützliche Daten
		schema.setEmergencyCareGiver_usefulData(dbSchemas.get(11).getValue() != 0);
		
		// Notfall Behandelnder - Medizinische Daten
		schema.setEmergencyCareGiver_medicalData(dbSchemas.get(12).getValue() != 0);
		
		// Notfall Behandelnder - Stigmatisierende Daten
		schema.setEmergencyCareGiver_stigmatizingData(dbSchemas.get(13).getValue() != 0);
				
		
		response.setPermissionSchema(schema);
		
		
		return response;
	}

	/**
	 * Inserts a new PatientRole object by the given attributes in the db
	 * 
	 * @param patient id, role id, organisationhp id
	 * @return true if successfully saved
	 */

	public ch.bfh.www.ehrservices.SetHPRoleResponse setHPRole(
			ch.bfh.www.ehrservices.SetHPRole setHPRole) {
		Utility.getEM().getTransaction().begin();
		ch.bfh.www.ehrservices.entities.Patientrole hpRole = new Patientrole();
		hpRole.setPatient(Utility.getEM().find(ch.bfh.www.ehrservices.entities.Patient.class, setHPRole.getPatientID()));
		hpRole.setRole(Utility.getEM().find(ch.bfh.www.ehrservices.entities.Role.class, setHPRole.getRoleID()));
		hpRole.setOrganisationhp(Utility.getEM().find(ch.bfh.www.ehrservices.entities.Organisationhp.class, setHPRole.getHealthCareProfessionalID())); // TODO wäre organisaitonhp nicht hp
		hpRole.setAccessTill(setHPRole.getAccessTill().getTime());
		
		Utility.getEM().persist(hpRole);
		Utility.getEM().getTransaction().commit();
		
		SetHPRoleResponse response = new SetHPRoleResponse();
		response.setSuccess(true);
		
		return response;
	}

	/**
	 * Returns the meta data and related data from a document by the given document id
	 * 
	 * @param int id
	 * @return documentRegister 
	 * 						- Organisation (1)
	 * 						- HealthcareProfessional (1)
	 * 							- Person => Address
	 * 						- DocumentLog (*)
	 */

	public ch.bfh.www.ehrservices.GetAllDocumentsByPatientIdResponse getAllDocumentsByPatientId(
			ch.bfh.www.ehrservices.GetAllDocumentsByPatientId getAllDocumentsByPatientId) {
		Query query = Utility.getEM().createQuery("SELECT dr From Documentregister dr WHERE dr.patient.id = "+ getAllDocumentsByPatientId.getPatientID());
		List<ch.bfh.www.ehrservices.entities.Documentregister> dbDocs = query.getResultList();
		
		// Create document register objects and add them to the array in the response object
		GetAllDocumentsByPatientIdResponse response = new GetAllDocumentsByPatientIdResponse();
		for(ch.bfh.www.ehrservices.entities.Documentregister doc : dbDocs) {
			ch.bfh.www.ehrservices.DocumentRegisterEntry newDoc = new ch.bfh.www.ehrservices.DocumentRegisterEntry();			
			
			// create document register object			
			response.addDocumentRegisterEntries(Utility.createDocumentRegisterHelper(doc));
		}
		
		return response;
	}

	/**
	 * Sets the confidentiality level of the given documentregister object
	 * 
	 * @param documentregister id, confidentialitylevel id
	 * @return true if successfully saved
	 */

	public ch.bfh.www.ehrservices.SetConfidentialityResponse setConfidentiality(
			ch.bfh.www.ehrservices.SetConfidentiality setConfidentiality) {
		Utility.getEM().getTransaction().begin();
		
		ch.bfh.www.ehrservices.entities.Documentregister documentRegister = Utility.getEM().find(ch.bfh.www.ehrservices.entities.Documentregister.class, setConfidentiality.getDocumentRegisterID());
		documentRegister.setConfidentialitylevel(Utility.getEM().find(ch.bfh.www.ehrservices.entities.Confidentialitylevel.class, setConfidentiality.getConfidentialityID()));
		
				
		Utility.getEM().persist(documentRegister);
		Utility.getEM().getTransaction().commit();
		
		SetConfidentialityResponse response = new SetConfidentialityResponse();
		response.setSuccess(true);
		
		return response;
	}

}
