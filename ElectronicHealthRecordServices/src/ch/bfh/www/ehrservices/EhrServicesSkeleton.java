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
import ch.bfh.www.util.Utility;

/**
 * EhrServicesSkeleton java skeleton for the axisService
 */
public class EhrServicesSkeleton {

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
		ch.bfh.www.ehrservices.Patient patient = new ch.bfh.www.ehrservices.Patient();
		patient.setMPI(user.getMpi());
		patient.setPatientID(user.getId());
		patient.setUsername(user.getUsername());
		patient.setPassword(user.getPassword());
		patient.setLanguage(user.getLanguage());
		
		// create address and person object
		patient.setPerson(Utility.createPersonWithAddressHelper(user.getPerson()));
		
		// Create Response
		GetLoginResponse response = new GetLoginResponse();
		response.setPatient(patient);
		
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getBlacklistByPatientId
	 * @return getBlacklistByPatientIdResponse
	 */

	public ch.bfh.www.ehrservices.GetBlacklistByPatientIdResponse getBlacklistByPatientId(
			ch.bfh.www.ehrservices.GetBlacklistByPatientId getBlacklistByPatientId) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getBlacklistByPatientId");
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
	 * Auto generated method signature
	 * 
	 * @param getHPByPatientAndRole
	 * @return getHPByPatientAndRoleResponse
	 */

	public ch.bfh.www.ehrservices.GetHPByPatientAndRoleResponse getHPByPatientAndRole(
			ch.bfh.www.ehrservices.GetHPByPatientAndRole getHPByPatientAndRole) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getHPByPatientAndRole");
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
	 * Auto generated method signature
	 * 
	 * @param getWhitelistByPatientId
	 * @return getWhitelistByPatientIdResponse
	 */

	public ch.bfh.www.ehrservices.GetWhitelistByPatientIdResponse getWhitelistByPatientId(
			ch.bfh.www.ehrservices.GetWhitelistByPatientId getWhitelistByPatientId) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getWhitelistByPatientId");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getCurrentPermissionMatrixByPatientId
	 * @return getCurrentPermissionMatrixByPatientIdResponse
	 */

	public ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientIdResponse getCurrentPermissionMatrixByPatientId(
			ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientId getCurrentPermissionMatrixByPatientId) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName()
				+ "#getCurrentPermissionMatrixByPatientId");
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

			// create healthcare professional object
			ch.bfh.www.ehrservices.HealthCareProfessional hp = new HealthCareProfessional();
			hp.setHcpID(doc.getOrganisationhp().getHealthcareprofessional().getId());
			hp.setFmh(doc.getOrganisationhp().getHealthcareprofessional().getFmh());
			hp.setGln(doc.getOrganisationhp().getHealthcareprofessional().getGln());
			hp.setHpc(doc.getOrganisationhp().getHealthcareprofessional().getHpc());
			hp.setPerson(Utility.createPersonWithAddressHelper(doc.getOrganisationhp().getHealthcareprofessional().getPerson()));
			hp.setQualitativeDignity(doc.getOrganisationhp().getHptype().getNameDe());
			// TODO hier verbindung direkt auf HP und Org aber eigentlich noch über OrganisationHP.. zsr fehlt..
			
			// create organisation object
			ch.bfh.www.ehrservices.Organisation org = new Organisation();
			org.setOrganisationID(doc.getOrganisationhp().getOrganisation().getId());
			org.setName(doc.getOrganisationhp().getOrganisation().getNameDe()); // TODO Mehrsprachigkeit
			org.setOrganisationType(doc.getOrganisationhp().getOrganisation().getOrganisationtype().getNameDe());
			org.setUrl(doc.getOrganisationhp().getOrganisation().getUrl());
			org.setAddress(Utility.createAddressHelper(doc.getOrganisationhp().getOrganisation().getAddress()));
			// TODO braucht es die Parents?
			
			// create document register object
			newDoc.setDocumentRegisterID(doc.getId());			
			newDoc.setConfindentialityLevel(doc.getConfidentialitylevel().getNameDe()); // TODO Mehrsprachigkeit
			newDoc.setCreationDate(Utility.convertDateToCalendar(doc.getCreationDate()));
			newDoc.setDocumentLog(null);//doc.getDocumentlogs()); TODO was muss da rein?!
			newDoc.setDocumentType(doc.getDocumenttype().getName());
			newDoc.setDocumentUploader(hp);
			newDoc.setOrganisation(org);
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
