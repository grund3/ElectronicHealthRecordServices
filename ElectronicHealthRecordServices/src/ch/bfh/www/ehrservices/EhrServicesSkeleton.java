/**
 * EhrServicesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package ch.bfh.www.ehrservices;

import java.util.ArrayList;

import javax.persistence.Query;

import ch.bfh.www.ehrservices.entities.Role;
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
	 * Auto generated method signature
	 * 
	 * @param getDocumentById
	 * @return getDocumentByIdResponse
	 */

	public ch.bfh.www.ehrservices.GetDocumentByIdResponse getDocumentById(
			ch.bfh.www.ehrservices.GetDocumentById getDocumentById) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getDocumentById");
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
	 * Auto generated method signature
	 * 
	 * @param getLogin
	 * @return getLoginResponse
	 */

	public ch.bfh.www.ehrservices.GetLoginResponse getLogin(
			ch.bfh.www.ehrservices.GetLogin getLogin) {
		String username = getLogin.getUsername();
		Query query = Utility.getEM().createQuery("SELECT p FROM Patient p WHERE p.username ='"+username+"'");
		ch.bfh.www.ehrservices.entities.Patient user = (ch.bfh.www.ehrservices.entities.Patient) query.getSingleResult();
		ch.bfh.www.ehrservices.Patient patient = new ch.bfh.www.ehrservices.Patient();
		patient.setMPI(user.getMpi());
		patient.setPatientID(String.valueOf(user.getId()));
		patient.setUsername(user.getUsername());
		
		ch.bfh.www.ehrservices.Person person = new ch.bfh.www.ehrservices.Person();
		person.setAddress(patient.getPerson().getAddress());
		person.setBirthdate(patient.getPerson().getBirthdate());
		person.setEmail(patient.getPerson().getEmail());
		person.setFirstname(patient.getPerson().getFirstname());
		patient.setPerson(person);
		
		GetLoginResponse response = new GetLoginResponse();
		response.setOut(patient);
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
	 * Auto generated method signature
	 * 
	 * @return getRolesResponse
	 */

	public ch.bfh.www.ehrservices.GetRolesResponse getRoles() {
		Query query = Utility.getEM().createQuery("SELECT r From Role r");
		ArrayList<ch.bfh.www.ehrservices.entities.Role> dbRoles = (ArrayList<Role>) query.getResultList();
		
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
	 * Auto generated method signature
	 * 
	 * @return getConfidentialityLevelsResponse
	 */

	public ch.bfh.www.ehrservices.GetConfidentialityLevelsResponse getConfidentialityLevels(

	) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getConfidentialityLevels");
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
	 * Auto generated method signature
	 * 
	 * @param getAllDocumentsByPatientId
	 * @return getAllDocumentsByPatientIdResponse
	 */

	public ch.bfh.www.ehrservices.GetAllDocumentsByPatientIdResponse getAllDocumentsByPatientId(
			ch.bfh.www.ehrservices.GetAllDocumentsByPatientId getAllDocumentsByPatientId) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getAllDocumentsByPatientId");
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
