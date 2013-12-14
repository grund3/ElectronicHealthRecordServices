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

import org.apache.axiom.attachments.ByteArrayDataSource;

import ch.bfh.www.ehrservices.entities.Documentrepository;
import ch.bfh.www.ehrservices.entities.Permissionmatrix;
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
	 * Auto generated method signature
	 * 
	 * @param getSpecialPermissionByPatient
	 * @return getSpecialPermissionByPatientResponse
	 */

	public ch.bfh.www.ehrservices.GetSpecialPermissionByPatientResponse getSpecialPermissionByPatient(
			ch.bfh.www.ehrservices.GetSpecialPermissionByPatient getSpecialPermissionByPatient) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getSpecialPermissionByPatient");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getDocumentsByAttributes
	 * @return getDocumentsByAttributesResponse
	 */

	public ch.bfh.www.ehrservices.GetDocumentsByAttributesResponse getDocumentsByAttributes(
			ch.bfh.www.ehrservices.GetDocumentsByAttributes getDocumentsByAttributes) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getDocumentsByAttributes");
	}

	/**
	 * Returns a document with the given id
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
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#setEmergencyContact");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getEmergencyContactByPatientId
	 * @return getEmergencyContactByPatientIdResponse
	 */

	public ch.bfh.www.ehrservices.GetEmergencyContactByPatientIdResponse getEmergencyContactByPatientId(
			ch.bfh.www.ehrservices.GetEmergencyContactByPatientId getEmergencyContactByPatientId) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getEmergencyContactByPatientId");
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
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#setSpecialPermission");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param setHpOnBlacklist
	 * @return setHpOnBlacklistResponse
	 */

	public ch.bfh.www.ehrservices.SetHpOnBlacklistResponse setHpOnBlacklist(
			ch.bfh.www.ehrservices.SetHpOnBlacklist setHpOnBlacklist) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#setHpOnBlacklist");
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
	 * Auto generated method signature
	 * 
	 * @param setPermissionMatrixForPatient
	 * @return setPermissionMatrixForPatientResponse
	 */

	public ch.bfh.www.ehrservices.SetPermissionMatrixForPatientResponse setPermissionMatrixForPatient(
			ch.bfh.www.ehrservices.SetPermissionMatrixForPatient setPermissionMatrixForPatient) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#setPermissionMatrixForPatient");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param setWhitelist
	 * @return setWhitelistResponse
	 */

	public ch.bfh.www.ehrservices.SetWhitelistResponse setWhitelist(
			ch.bfh.www.ehrservices.SetWhitelist setWhitelist) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#setWhitelist");
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
		Query query = Utility.getEM().createQuery("SELECT pm From Permissionmatrix pm WHERE pm.patient.id = "+ getCurrentPermissionMatrixByPatientId.getPatientID());
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
	 * Auto generated method signature
	 * 
	 * @param setHPRole
	 * @return setHPRoleResponse
	 */

	public ch.bfh.www.ehrservices.SetHPRoleResponse setHPRole(
			ch.bfh.www.ehrservices.SetHPRole setHPRole) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#setHPRole");
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
			newDoc.setDocumentRegisterID(doc.getId());			
			newDoc.setConfindentialityLevel(doc.getConfidentialitylevel().getNameDe()); // TODO Mehrsprachigkeit
			newDoc.setCreationDate(Utility.convertDateToCalendar(doc.getCreationDate()));
			
			// add document log 
			for(ch.bfh.www.ehrservices.entities.Documentlog dbLog : doc.getDocumentlogs()) {
				ch.bfh.www.ehrservices.DocumentLog log = new DocumentLog();
				log.setAccessType(dbLog.getAccesstype().getNameDe()); // TODO Mehrsprachigkeit
				log.setOrganisationHp(Utility.createOrganisationHPHelper(dbLog.getOrganisationhp()));
				log.setTime(Utility.convertDateToCalendar(dbLog.getTime()));
				newDoc.addDocumentLog(log);
			}			
			newDoc.setDocumentType(doc.getDocumenttype().getName());
			newDoc.setDocumentUploader(Utility.createOrganisationHPHelper(doc.getOrganisationhp()));
			newDoc.setTitle(doc.getTitle());
			newDoc.setUploadDate(Utility.convertDateToCalendar(doc.getUploadDate()));
			
			response.addDocumentRegisterEntries(newDoc);
		}
		
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param setConfidentiality
	 * @return setConfidentialityResponse
	 */

	public ch.bfh.www.ehrservices.SetConfidentialityResponse setConfidentiality(
			ch.bfh.www.ehrservices.SetConfidentiality setConfidentiality) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#setConfidentiality");
	}

}
