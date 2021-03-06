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
import java.util.List;

import javax.activation.DataHandler;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import org.apache.axiom.attachments.ByteArrayDataSource;

import ch.bfh.www.ehrservices.entities.*;
import ch.bfh.www.util.Utility;

/**
 * Diese Klasse enth�lt alle Funktionen des ElectronicHealthRecords
 * 
 * @author Dominik Gr�nert, Pascal Schrei
 * 
 */
public class EhrServicesSkeleton {

	// Meine Behandelnden
	final private int roleCurrent = 1;

	// Behandelnder des Vertrauens
	final private int roleTrust = 2;

	// Potentieller Behandelnder
	final private int rolePotential = 3;

	/**
	 * <pre>
	 * Diese Methode liefert die speziell definierten Zugriffsberechtigungen f�r 
	 * einen Behandelnden auf ein bestimmtes Dokument zur�ck. 
	 * Die Berechtigungen geh�ren zu einem bestimmten Patienten.
	 * </pre>
	 * 
	 * @param int Patienten ID
	 * @return Array mit allen Spezialberechtigungen Angeh�ngt sind: -
	 *         DocumentRegister (1) - Healthcareprofessional (1)
	 */

	public ch.bfh.www.ehrservices.GetSpecialPermissionByPatientResponse getSpecialPermissionByPatient(
			ch.bfh.www.ehrservices.GetSpecialPermissionByPatient getSpecialPermissionByPatient) {
		Query query = Utility
				.getEM()
				.createQuery(
						"SELECT pm From Permissionmatrix pm WHERE pm.patient.id = "
								+ getSpecialPermissionByPatient.getPatientID()
								+ " AND pm.documentregister != null AND pm.healthcareprofessional != null");
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");
		List<Permissionmatrix> dbPermissionmatrix = query.getResultList();

		GetSpecialPermissionByPatientResponse response = new GetSpecialPermissionByPatientResponse();

		for (Permissionmatrix dbEntry : dbPermissionmatrix) {
			ch.bfh.www.ehrservices.SpecialPermissionsType specialPermission = new SpecialPermissionsType();
			specialPermission
					.setDocumentRegisterEntry(Utility
							.createDocumentRegisterHelper(dbEntry
									.getDocumentregister()));
			specialPermission.setHealthCareProfessional(Utility
					.createHPHelper(dbEntry.getHealthcareprofessional()));

			response.addSpecialPermissions(specialPermission);
		}

		return response;
	}

	/**
	 * <pre>
	 * Diese Methode liefert alle Metadaten zu Dokumenten von einem Patienten zur�ck.
	 * Die Dokumente selber sind nicht enthalten (eigene Methode).
	 * 
	 * Folgende Einschr�nkungen k�nnen mitgegeben werden, um die Dokumente einzugrenzen:
	 * 	- int ConfidentialityLevelID (Vertrauchlichkeitsstufe)
	 *  - calendar CreationDate (date without time) (Erstelldatum)
	 *  - string DocumentTitle (Like)(Dokumenttitel)
	 *  - int DocumentTypeID (Dateityp)
	 *  - int healthprofessionalID (Von welchem Behandelnden)
	 *  - int organisationID (Von welcher Organisation)
	 *  - calendar UploadDate (date without time) (Upload Datum)
	 * </pre>
	 * 
	 * @param int Patienten ID, Einschr�nkungen siehe Beschrieb
	 * @return Array mit allen Dokumenten (Metadaten) die zu den Einschr�nkungen
	 *         passen. - Organisation (1) - HealthcareProfessional (1) - Person
	 *         (1) => Address (1) - DocumentLog (*)
	 */

	public ch.bfh.www.ehrservices.GetDocumentsByAttributesResponse getDocumentsByAttributes(
			ch.bfh.www.ehrservices.GetDocumentsByAttributes getDocumentsByAttributes) {

		AttributesType attributes = getDocumentsByAttributes.getAttributes();
		String statement = "SELECT dr From Documentregister dr WHERE dr.patient.id = "
				+ getDocumentsByAttributes.getPatientID();
		if (attributes.isConfindentialityLevelIDSpecified()) {
			statement += " AND dr.confidentialitylevel.id = '"
					+ attributes.getConfindentialityLevelID() + "'";
		}
		if (attributes.isCreationDateSpecified()) {
			statement += " AND cast(dr.creationDate as date) = :creationDate";
		}
		if (attributes.isDocumentTitleSpecified()) {
			statement += " AND dr.title LIKE '" + attributes.getDocumentTitle()
					+ "'";
		}
		if (attributes.isDocumentTypeIDSpecified()) {
			statement += " AND dr.documenttype.id = '"
					+ attributes.getDocumentTypeID() + "'";
		}
		if (attributes.isHpIDSpecified()) {
			statement += " AND dr.organisationhp.healthcareprofessional.id = "
					+ attributes.getHpID();
		}
		if (attributes.isOrganisationIDSpecified()) {
			statement += " AND dr.organisationhp.organisation.id = "
					+ attributes.getOrganisationID();
		}
		if (attributes.isUploadDateSpecified()) {
			statement += " AND cast(dr.uploadDate as date) = :uploadDate";
		}

		Query query = Utility.getEM().createQuery(statement);
		if (attributes.isCreationDateSpecified()) {
			query.setParameter("creationDate", attributes.getCreationDate()
					.getTime(), TemporalType.DATE);
		}
		if (attributes.isUploadDateSpecified()) {
			query.setParameter("uploadDate", attributes.getUploadDate()
					.getTime(), TemporalType.DATE);
		}

		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		List<Documentregister> dbDocs = query.getResultList();

		// Create document register objects and add them to the array in the
		// response object
		GetDocumentsByAttributesResponse response = new GetDocumentsByAttributesResponse();
		for (Documentregister doc : dbDocs) {
			// create documentregister object
			response.addDocuments(Utility.createDocumentRegisterHelper(doc));
		}

		return response;
	}

	/**
	 * Diese Methode liefert das Dokument mit der gegebenen ID zur�ck (Binary)
	 * 
	 * @param int Dokumenten ID
	 * @return Dokument in Binary Form
	 */

	public ch.bfh.www.ehrservices.GetDocumentByIdResponse getDocumentById(
			ch.bfh.www.ehrservices.GetDocumentById getDocumentById) {
		Query query = Utility.getEM().createQuery(
				"SELECT d From Documentrepository d WHERE d.id = "
						+ getDocumentById.getDocumentID());
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");
		Documentrepository dbDocument = (Documentrepository) query
				.getSingleResult();

		// Create DocumentRepository object and add it to the response object
		GetDocumentByIdResponse response = new GetDocumentByIdResponse();
		// The file from the db is a byte array. The response needs a data
		// handler object.
		// So we have to add the byte array over a file object into a data
		// handler object.
		DataHandler dh = null;
		try {
			File outFile = new File("");
			ByteArrayDataSource dataSource = new ByteArrayDataSource(
					dbDocument.getDocument());
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
	 * F�gt einen Notfallkontakt (Person) zu einem bestimmten Patienten hinzu.
	 * 
	 * @param int Patienten ID, Person und Adressen Objekt
	 * @return Gibt bei Erfolg true zur�ck
	 */

	public ch.bfh.www.ehrservices.SetEmergencyContactResponse setEmergencyContact(
			ch.bfh.www.ehrservices.SetEmergencyContact setEmergencyContact) {

		Emergencycontact contact = new Emergencycontact();
		Person dbPerson = new Person();
		Address dbAddress = new Address();
		PersonType person = setEmergencyContact.getEmergencyContact();

		// create address
		dbAddress.setAddress(person.getAddress().getAddress());
		dbAddress.setCanton(person.getAddress().getCanton());
		dbAddress.setCountry(person.getAddress().getCountry());
		dbAddress.setMunicipality(person.getAddress().getMunicipality());
		dbAddress.setPostalcode(person.getAddress().getPostalcode());

		// create person
		dbPerson.setAddress(dbAddress);
		dbPerson.setBirthdate(person.getBirthdate().getTime());
		dbPerson.setEmail(person.getEmail());
		dbPerson.setFirstname(person.getFirstname());
		dbPerson.setGender(person.getGender());
		dbPerson.setMobile(person.getMobile());
		dbPerson.setName(person.getName());
		dbPerson.setPhone(person.getPhone());
		dbPerson.setTitle(person.getTitle());

		Utility.getEM().getTransaction().begin();
		Utility.getEM().persist(dbAddress);
		Utility.getEM().persist(dbPerson);

		// create emergency contact
		Patient patient = Utility.getEM().find(Patient.class,
				setEmergencyContact.getPatientID());
		contact.setPatient(patient);
		contact.setPerson(dbPerson);

		Utility.getEM().persist(contact);

		Utility.getEM().getTransaction().commit();

		SetEmergencyContactResponse response = new SetEmergencyContactResponse();
		response.setSuccess(true);

		return response;
	}

	/**
	 * Diese Methode liefert alle Notfallkontakte zu einem bestimmten Patienten
	 * zur�ck.
	 * 
	 * @param int Patienten ID
	 * @return Array mit Notfallkontakten - Person (1) - Address (1)
	 */

	public ch.bfh.www.ehrservices.GetEmergencyContactByPatientIdResponse getEmergencyContactByPatientId(
			ch.bfh.www.ehrservices.GetEmergencyContactByPatientId getEmergencyContactByPatientId) {
		Query query = Utility.getEM().createQuery(
				"SELECT ec From Emergencycontact ec WHERE ec.patient.id = "
						+ getEmergencyContactByPatientId.getPatientID());
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");
		List<Emergencycontact> dbEmergencyContact = query.getResultList();

		GetEmergencyContactByPatientIdResponse response = new GetEmergencyContactByPatientIdResponse();

		for (Emergencycontact dbEntry : dbEmergencyContact) {

			// create person object
			PersonType contact = Utility.createPersonWithAddressHelper(dbEntry
					.getPerson());

			response.addEmergencyContacts(contact);
		}

		return response;
	}

	/**
	 * <pre>
	 * Diese Methode liefert ein Patient zur�ck. Dieser Patient wird anhand des Benutzernamens gesucht.
	 * Mit dem enthaltenen Passwort kann der Benutzer eingeloggt werden.
	 * </pre>
	 * 
	 * @param String
	 *            Benutzername
	 * @return Patient => Person => Address Objekte
	 */

	public ch.bfh.www.ehrservices.GetLoginResponse getLogin(
			ch.bfh.www.ehrservices.GetLogin getLogin) {
		String username = getLogin.getUsername();
		Query query = Utility.getEM().createQuery(
				"SELECT p FROM Patient p WHERE p.username ='" + username + "'");
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");
		Patient user = (Patient) query.getSingleResult();

		// Create Patient object
		PatientType patient = Utility.createPatientHelper(user);

		// create address and person object
		patient.setPerson(Utility.createPersonWithAddressHelper(user
				.getPerson()));

		// Create Response
		GetLoginResponse response = new GetLoginResponse();
		response.setPatient(patient);

		return response;
	}

	/**
	 * Diese Methode liefert alle Behandelnden auf der Blacklist des Patienten
	 * zur�ck.
	 * 
	 * @param int Patient ID
	 * @return Array mit Behandelnden (Healthcareprofessional)
	 */

	public ch.bfh.www.ehrservices.GetBlacklistByPatientIdResponse getBlacklistByPatientId(
			ch.bfh.www.ehrservices.GetBlacklistByPatientId getBlacklistByPatientId) {
		Query query = Utility.getEM().createQuery(
				"SELECT bl From Blacklist bl WHERE bl.patient.id = "
						+ getBlacklistByPatientId.getPatientID());
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");
		List<Blacklist> dbBlacklist = query.getResultList();

		GetBlacklistByPatientIdResponse response = new GetBlacklistByPatientIdResponse();

		for (Blacklist dbEntry : dbBlacklist) {

			// create hp object
			HealthCareProfessionalType hp = Utility.createHPHelper(dbEntry
					.getHealthcareprofessional());

			response.addHealthCareProfessionals(hp);
		}

		return response;
	}

	/**
	 * Diese Methode liefert alle Rollen zur�ck.
	 * 
	 * @param boolean True mitgeben
	 * @return Array mit Rollen
	 */

	public ch.bfh.www.ehrservices.GetRolesResponse getRoles(
			ch.bfh.www.ehrservices.GetRoles getRoles) {
		Query query = Utility.getEM().createQuery("SELECT r From Role r");
		List<Role> dbRoles = query.getResultList();

		// Create Role objects and add them to the array in the response object
		GetRolesResponse response = new GetRolesResponse();
		for (Role role : dbRoles) {
			RoleType newRole = new RoleType();
			newRole.setId(role.getId());
			newRole.setName(role.getNameDe()); // TODO Mehrsprachig
			response.addRoles(newRole);
		}

		return response;
	}

	/**
	 * <pre>
	 * F�gt eine neue Spezialberechtigung f�r einen Patienten hinzu.
	 * Er berechtigt einen bestimmten Behandlenden auf ein bestimmtes Dokument.
	 * </pre>
	 * 
	 * @param int Patient ID, int healthcareprofessional ID (Behandelnder), int
	 *        documentregister ID (Metadaten)
	 * @return Gibt bei Erfolg true zur�ck
	 */

	public ch.bfh.www.ehrservices.SetSpecialPermissionResponse setSpecialPermission(
			ch.bfh.www.ehrservices.SetSpecialPermission setSpecialPermission) {
		Utility.getEM().getTransaction().begin();

		Permissionmatrix permissionMatrix = new Permissionmatrix();
		permissionMatrix.setPatient(Utility.getEM().find(Patient.class,
				setSpecialPermission.getPatientID()));
		permissionMatrix.setHealthcareprofessional(Utility.getEM().find(
				Healthcareprofessional.class,
				setSpecialPermission.getHealthProfessionalID()));
		permissionMatrix.setDocumentregister(Utility.getEM().find(
				Documentregister.class, setSpecialPermission.getDocumentID()));

		Utility.getEM().persist(permissionMatrix);
		Utility.getEM().getTransaction().commit();

		SetSpecialPermissionResponse response = new SetSpecialPermissionResponse();
		response.setOut("true"); // TODO sollte boolean sein..

		return response;
	}

	/**
	 * F�gt einen Behandelnden auf die Blacklist des Patienten hinzu.
	 * 
	 * @param int Patient ID, healthcareprofessional ID (Behandelnder)
	 * @return Gibt bei Erfolg true zur�ck
	 */

	public ch.bfh.www.ehrservices.SetHpOnBlacklistResponse setHpOnBlacklist(
			ch.bfh.www.ehrservices.SetHpOnBlacklist setHpOnBlacklist) {
		Utility.getEM().getTransaction().begin();

		Blacklist blacklist = new Blacklist();
		blacklist.setPatient(Utility.getEM().find(Patient.class,
				setHpOnBlacklist.getPatientID())); 
		blacklist.setHealthcareprofessional(Utility.getEM().find(
				Healthcareprofessional.class,
				setHpOnBlacklist.getHealthProfessionalID())); 
		Utility.getEM().persist(blacklist);
		Utility.getEM().getTransaction().commit();

		SetHpOnBlacklistResponse response = new SetHpOnBlacklistResponse();
		response.setSuccess(true);

		return response;
	}

	/**
	 * <pre>
	 * Diese Methode liefert OrganisationHP Objekte zur�ck passend zum angegebenen Patienten und der Rolle.
	 * OrganisationHP ist das Verbindungsglid von Behandelnden und Organisationen. Also welcher Behandelnde arbeit
	 * in welcher Organisation. 
	 * Folgende Attribute k�nnen gesetzt werden:
	 * 	- Keine Patienten ID (0) => gibt alle OrganisationHP zur�ck (ohne Verbindung zum Patienten)
	 * 	- Keine Rolle (null) => gibt alle OrganisationHP zum Patienten zur�ck oder ohne Verbindung zum Patienten
	 * 	- Trust => Behandelnde des Vertrauens
	 * 	- Current => Meine Behandelnde
	 * 	- Portential => Potentielle Behandelnde
	 * 
	 * Es ist nicht m�glich nach mehr als einer Rolle zu suchen.
	 * </pre>
	 * 
	 * @param int Patienten ID, boolean true bei der gew�hlten Rolle
	 * @return Array mit OrganisationHP Objekte
	 */

	public ch.bfh.www.ehrservices.GetHPByPatientAndRoleResponse getHPByPatientAndRole(
			ch.bfh.www.ehrservices.GetHPByPatientAndRole getHPByPatientAndRole) {
		String statement;
		if (getHPByPatientAndRole.getPatientID() == 0) {
			statement = "SELECT oh From Organisationhp oh";
		} else {
			statement = "SELECT pr From Patientrole pr WHERE pr.patient.id = "
					+ getHPByPatientAndRole.getPatientID();

			if (getHPByPatientAndRole.getTrust()) {
				statement += " AND pr.role.id = " + roleTrust;
			} else if (getHPByPatientAndRole.getCurrent()) {
				statement += " AND pr.role.id = " + roleCurrent;
			} else if (getHPByPatientAndRole.getPotential()) {
				statement += " AND pr.role.id = " + rolePotential;
			} else {
				// If there are no conditions set, it returns all HPs for the
				// patient or not for the patient
			}
		}

		Query query = Utility.getEM().createQuery(statement);
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");
		List<Patientrole> dbPatientRoleList = null;
		List<Organisationhp> dbOrganisationHPList = null;
		if (getHPByPatientAndRole.getPatientID() == 0) {
			dbOrganisationHPList = query.getResultList();
		} else {
			dbPatientRoleList = query.getResultList();
		}

		OrganisationHPType orgHP = null;
		GetHPByPatientAndRoleResponse response = new GetHPByPatientAndRoleResponse();
		if (getHPByPatientAndRole.getPatientID() == 0) {
			for (Organisationhp dbOrgaHp : dbOrganisationHPList) {

				// create organisation hp object
				orgHP = Utility.createOrganisationHPHelper(dbOrgaHp);

				if (dbOrgaHp.getPatientroles() != null
						&& !dbOrgaHp.getPatientroles().isEmpty()) {
					orgHP.setRole(dbOrgaHp.getPatientroles().get(0).getRole()
							.getNameDe());
					orgHP.setRoleID(dbOrgaHp.getPatientroles().get(0).getRole()
							.getId());
					orgHP.setAccessTill(Utility.convertDateToCalendar(dbOrgaHp
							.getPatientroles().get(0).getAccessTill()));
				}

				response.addHealthcareProfessional(orgHP);
			}
		} else {
			for (Patientrole dbPatientRole : dbPatientRoleList) {

				// create organisation hp object
				orgHP = Utility.createOrganisationHPHelper(dbPatientRole
						.getOrganisationhp());

				orgHP.setRole(dbPatientRole.getRole().getNameDe());
				orgHP.setRoleID(dbPatientRole.getRole().getId());
				orgHP.setAccessTill(Utility.convertDateToCalendar(dbPatientRole
						.getAccessTill()));

				response.addHealthcareProfessional(orgHP);
			}
		}

		return response;
	}

	/**
	 * <pre>
	 * �berschreibt die bestehenden Berechtigungen (Matrix)
	 * F�r jedes (14 St�ck) Element in der Berechtigungsmatrix kann ein Wert gesetzt werden (boolean).
	 * 
	 * CareGiver => Mein Behandelnder
	 * CareGiverOfTrust => Behandelnder des Vertrauens
	 * PotentialCareGiver => Potentieller Behandelnder
	 * EmergencyCareGiver => Notfallbehandelnder
	 * </pre>
	 * 
	 * @param int Patienten ID, Attribute nach Matrix (Empfehlungen) booleans
	 * @return Gibt bei Erfolg true zur�ck
	 */

	public ch.bfh.www.ehrservices.SetPermissionMatrixForPatientResponse setPermissionMatrixForPatient(
			ch.bfh.www.ehrservices.SetPermissionMatrixForPatient setPermissionMatrixForPatient) {
		Utility.getEM().getTransaction().begin();

		Query query = Utility
				.getEM()
				.createQuery(
						"SELECT pm From Permissionmatrix pm WHERE pm.patient.id = "
								+ setPermissionMatrixForPatient.getPatientID()
								+ " AND pm.documentregister = null AND pm.healthcareprofessional = null");
		Permissionmatrix dbMatrix = (Permissionmatrix) query.getSingleResult();

		List<Permissionschema> dbSchemas = dbMatrix.getPermissionschemas();
		PermissionSchemaType schema = setPermissionMatrixForPatient
				.getPermissionSchema();

		// Mein Behandelnder - Administrative Daten
		dbSchemas.get(0).setValue(
				schema.getCareGiver_adminData() ? (byte) 1 : (byte) 0);
		Utility.getEM().persist(dbSchemas.get(0));

		// Mein Behandelnder - N�tzliche Daten
		dbSchemas.get(1).setValue(
				schema.getCareGiver_usefulData() ? (byte) 1 : (byte) 0);
		Utility.getEM().persist(dbSchemas.get(1));

		// Mein Behandelnder - Medizinische Daten
		dbSchemas.get(2).setValue(
				schema.getCareGiver_medicalData() ? (byte) 1 : (byte) 0);
		Utility.getEM().persist(dbSchemas.get(2));

		// Mein Behandelnder - Stigmatisierende Daten
		dbSchemas.get(3).setValue(
				schema.getCareGiver_stigmatizingData() ? (byte) 1 : (byte) 0);
		Utility.getEM().persist(dbSchemas.get(3));

		// Mein Behandelnder des Vertrauens - Administrative Daten
		dbSchemas.get(4).setValue(
				schema.getCareGiverOfTrust_adminData() ? (byte) 1 : (byte) 0);
		Utility.getEM().persist(dbSchemas.get(4));

		// Mein Behandelnder des Vertrauens - N�tzliche Daten
		dbSchemas.get(5).setValue(
				schema.getCareGiverOfTrust_usefulData() ? (byte) 1 : (byte) 0);
		Utility.getEM().persist(dbSchemas.get(5));

		// Mein Behandelnder des Vertrauens - Medizinische Daten
		dbSchemas.get(6).setValue(
				schema.getCareGiverOfTrust_medicalData() ? (byte) 1 : (byte) 0);
		Utility.getEM().persist(dbSchemas.get(6));

		// Mein Behandelnder des Vertrauens - Stigmatisierende Daten
		dbSchemas.get(7).setValue(
				schema.getCareGiverOfTrust_stigmatizingData() ? (byte) 1
						: (byte) 0);
		Utility.getEM().persist(dbSchemas.get(7));

		// Potenzieller Behandelnder - Administrative Daten
		dbSchemas.get(8).setValue(
				schema.getPotentialCareGiver_adminData() ? (byte) 1 : (byte) 0);
		Utility.getEM().persist(dbSchemas.get(8));

		// Potenzieller Behandelnder - N�tzliche Daten
		dbSchemas.get(9)
				.setValue(
						schema.getPotentialCareGiver_usefulData() ? (byte) 1
								: (byte) 0);
		Utility.getEM().persist(dbSchemas.get(9));

		// Notfall Behandelnder - Administrative Daten
		dbSchemas.get(10).setValue(
				schema.getEmergencyCareGiver_adminData() ? (byte) 1 : (byte) 0);
		Utility.getEM().persist(dbSchemas.get(10));

		// Notfall Behandelnder - N�tzliche Daten
		dbSchemas.get(11)
				.setValue(
						schema.getEmergencyCareGiver_usefulData() ? (byte) 1
								: (byte) 0);
		Utility.getEM().persist(dbSchemas.get(11));

		// Notfall Behandelnder - Medizinische Daten
		dbSchemas.get(12).setValue(
				schema.getEmergencyCareGiver_medicalData() ? (byte) 1
						: (byte) 0);
		Utility.getEM().persist(dbSchemas.get(12));

		// Notfall Behandelnder - Stigmatisierende Daten
		dbSchemas.get(13).setValue(
				schema.getEmergencyCareGiver_stigmatizingData() ? (byte) 1
						: (byte) 0);
		Utility.getEM().persist(dbSchemas.get(13));

		Utility.getEM().getTransaction().commit();

		SetPermissionMatrixForPatientResponse response = new SetPermissionMatrixForPatientResponse();
		response.setSuccess(true);

		return response;
	}

	/**
	 * <pre>
	 * F�gt einen neuen Eintrag in der Whitelist des Patienten hinzu. (Vertrauensperson)
	 * Der Eintrag ist ein anderer Patient, welcher volle Berechtigung auf den Rechte gebenden Patienten erh�lt.
	 * 
	 * Giver => Gibt die Rechte an
	 * Receiver => Erh�lt die Rechte von
	 * </pre>
	 * 
	 * @param giver
	 *            Patienten ID, receiver Patienten ID
	 * @return Gibt bei Erfolg true zur�ck
	 */

	public ch.bfh.www.ehrservices.SetWhitelistResponse setWhitelist(
			ch.bfh.www.ehrservices.SetWhitelist setWhitelist) {
		Utility.getEM().getTransaction().begin();

		Whitelist whitelist = new Whitelist();
		whitelist.setPatient1(Utility.getEM().find(Patient.class,
				setWhitelist.getGiverPatientID()));
		whitelist.setPatient2(Utility.getEM().find(Patient.class,
				setWhitelist.getReceiverPatientID()));

		Utility.getEM().persist(whitelist);
		Utility.getEM().getTransaction().commit();

		SetWhitelistResponse response = new SetWhitelistResponse();
		response.setSuccess(true);

		return response;
	}

	/**
	 * Diese Methode liefert alle Vertrauchlichkeitsstufen zur�ck.
	 * 
	 * @param boolean True mitgeben
	 * @return Array mit Vertraulichkeitsstufen
	 */

	public ch.bfh.www.ehrservices.GetConfidentialityLevelsResponse getConfidentialityLevels(
			ch.bfh.www.ehrservices.GetConfidentialityLevels getConfidentialityLevels) {
		Query query = Utility.getEM().createQuery(
				"SELECT c From Confidentialitylevel c");
		List<Confidentialitylevel> dbConfLevels = query.getResultList();

		// Create confidentiality level objects and add them to the array in the
		// response object
		GetConfidentialityLevelsResponse response = new GetConfidentialityLevelsResponse();
		for (Confidentialitylevel confLevel : dbConfLevels) {
			ConfidentialyLevelType newConfLevel = new ConfidentialyLevelType();
			newConfLevel.setConfidentialyLevelID(confLevel.getId());
			newConfLevel.setName(confLevel.getNameDe()); // TODO Mehrsprachig
			response.addConfidentialyLevels(newConfLevel);
		}

		return response;
	}

	/**
	 * Diese Methode liefert liefert alle Whitelist Eintr�ge zum gegebenen
	 * Patienten zur�ck.
	 * 
	 * @param int Patienten ID
	 * @return Array von Whitelist Eintr�gen
	 */

	public ch.bfh.www.ehrservices.GetWhitelistByPatientIdResponse getWhitelistByPatientId(
			ch.bfh.www.ehrservices.GetWhitelistByPatientId getWhitelistByPatientId) {
		Query query = Utility.getEM().createQuery(
				"SELECT wl From Whitelist wl WHERE wl.patient1.id = "
						+ getWhitelistByPatientId.getPatientID());
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");
		List<Whitelist> dbWhitelist = query.getResultList();

		GetWhitelistByPatientIdResponse response = new GetWhitelistByPatientIdResponse();

		for (Whitelist dbEntry : dbWhitelist) {
			PatientType patient = Utility.createPatientHelper(dbEntry
					.getPatient2());
			patient.setPerson(Utility.createPersonWithAddressHelper(dbEntry
					.getPatient2().getPerson()));

			response.addPatients(patient);
		}

		return response;
	}

	/**
	 * <pre>
	 * Diese Methode liefert eine Gruppe von booleans zur�ck und stellt die Berechtigungsmatrix des Patienten dar.
	 * True = 1 also gesetztes Flag
	 * False = 0 also nicht gesetztes Flag
	 * 
	 * CareGiver => Mein Behandelnder
	 * CareGiverOfTrust => Behandelnder des Vertrauens
	 * PotentialCareGiver => Potentieller Behandelnder
	 * EmergencyCareGiver => Notfallbehandelnder
	 * </pre>
	 * 
	 * @param int Patienten ID
	 * @return Gruppe von booleans
	 */

	public ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientIdResponse getCurrentPermissionMatrixByPatientId(
			ch.bfh.www.ehrservices.GetCurrentPermissionMatrixByPatientId getCurrentPermissionMatrixByPatientId) {
		Query query = Utility
				.getEM()
				.createQuery(
						"SELECT pm From Permissionmatrix pm WHERE pm.patient.id = "
								+ getCurrentPermissionMatrixByPatientId
										.getPatientID()
								+ " AND pm.documentregister = null AND pm.healthcareprofessional = null");
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");
		Permissionmatrix dbMatrix = (Permissionmatrix) query.getSingleResult();

		GetCurrentPermissionMatrixByPatientIdResponse response = new GetCurrentPermissionMatrixByPatientIdResponse();

		// create permission schema object
		PermissionSchemaType schema = new PermissionSchemaType();

		List<Permissionschema> dbSchemas = dbMatrix.getPermissionschemas();

		// Mein Behandelnder - Administrative Daten
		schema.setCareGiver_adminData(dbSchemas.get(0).getValue() != 0);

		// Mein Behandelnder - N�tzliche Daten
		schema.setCareGiver_usefulData(dbSchemas.get(1).getValue() != 0);

		// Mein Behandelnder - Medizinische Daten
		schema.setCareGiver_medicalData(dbSchemas.get(2).getValue() != 0);

		// Mein Behandelnder - Stigmatisierende Daten
		schema.setCareGiver_stigmatizingData(dbSchemas.get(3).getValue() != 0);

		// Mein Behandelnder des Vertrauens - Administrative Daten
		schema.setCareGiverOfTrust_adminData(dbSchemas.get(4).getValue() != 0);

		// Mein Behandelnder des Vertrauens - N�tzliche Daten
		schema.setCareGiverOfTrust_usefulData(dbSchemas.get(5).getValue() != 0);

		// Mein Behandelnder des Vertrauens - Medizinische Daten
		schema.setCareGiverOfTrust_medicalData(dbSchemas.get(6).getValue() != 0);

		// Mein Behandelnder des Vertrauens - Stigmatisierende Daten
		schema.setCareGiverOfTrust_stigmatizingData(dbSchemas.get(7).getValue() != 0);

		// Potenzieller Behandelnder - Administrative Daten
		schema.setPotentialCareGiver_adminData(dbSchemas.get(8).getValue() != 0);

		// Potenzieller Behandelnder - N�tzliche Daten
		schema.setPotentialCareGiver_usefulData(dbSchemas.get(9).getValue() != 0);

		// Notfall Behandelnder - Administrative Daten
		schema.setEmergencyCareGiver_adminData(dbSchemas.get(10).getValue() != 0);

		// Notfall Behandelnder - N�tzliche Daten
		schema.setEmergencyCareGiver_usefulData(dbSchemas.get(11).getValue() != 0);

		// Notfall Behandelnder - Medizinische Daten
		schema.setEmergencyCareGiver_medicalData(dbSchemas.get(12).getValue() != 0);

		// Notfall Behandelnder - Stigmatisierende Daten
		schema.setEmergencyCareGiver_stigmatizingData(dbSchemas.get(13)
				.getValue() != 0);

		response.setPermissionSchema(schema);

		return response;
	}

	/**
	 * <pre>
	 * Setzt die gesetzte Rolle f�r die gegebene OrganisationHP ID. 
	 * Somit ist der Behandelnde von einer bestimmten Organisation mit einer Rolle versehen und geh�rt zu einem Patienten.
	 * 
	 * Rollen ID => getAllRoles
	 * OrganisationHP ID => GetHPByPatientAndRole
	 * </pre>
	 * 
	 * @param int Patienten ID, Rollen ID, OrganisationHP ID
	 * @return Gibt bei Erfolg true zur�ck
	 */

	public ch.bfh.www.ehrservices.SetHPRoleResponse setHPRole(
			ch.bfh.www.ehrservices.SetHPRole setHPRole) {
		Utility.getEM().getTransaction().begin();

		Patientrole hpRole = new Patientrole();
		Query query = Utility.getEM().createQuery(
				"SELECT pr From Patientrole pr WHERE pr.patient.id = "
						+ setHPRole.getPatientID()
						+ " AND pr.organisationhp.id = "
						+ setHPRole.getHealthCareProfessionalID());
		List<Patientrole> list = query.getResultList();
		if (!list.isEmpty()) {
			hpRole = (Patientrole) query.getSingleResult();
		}

		hpRole.setPatient(Utility.getEM().find(Patient.class,
				setHPRole.getPatientID()));
		hpRole.setRole(Utility.getEM().find(Role.class, setHPRole.getRoleID()));
		hpRole.setOrganisationhp(Utility.getEM().find(Organisationhp.class,
				setHPRole.getHealthCareProfessionalID())); // TODO w�re
															// organisaitonhp
															// nicht hp
		hpRole.setAccessTill(setHPRole.getAccessTill().getTime());

		Utility.getEM().persist(hpRole);
		Utility.getEM().getTransaction().commit();

		SetHPRoleResponse response = new SetHPRoleResponse();
		response.setSuccess(true);

		return response;
	}

	/**
	 * <pre>
	 * Diese Methode liefert alle Metadaten zu Dokumenten von einem Patienten zur�ck.
	 * Die Dokumente selber sind nicht enthalten (eigene Methode).
	 * </pre>
	 * 
	 * @param int id
	 * @return documentRegister - Organisation (1) - HealthcareProfessional (1)
	 *         - Person => Address - DocumentLog (*)
	 */

	public ch.bfh.www.ehrservices.GetAllDocumentsByPatientIdResponse getAllDocumentsByPatientId(
			ch.bfh.www.ehrservices.GetAllDocumentsByPatientId getAllDocumentsByPatientId) {
		Query query = Utility.getEM().createQuery(
				"SELECT dr From Documentregister dr WHERE dr.patient.id = "
						+ getAllDocumentsByPatientId.getPatientID());
		query.setHint("javax.persistence.cache.storeMode", "REFRESH");

		List<Documentregister> dbDocs = query.getResultList();

		// Create document register objects and add them to the array in the
		// response object
		GetAllDocumentsByPatientIdResponse response = new GetAllDocumentsByPatientIdResponse();
		for (Documentregister doc : dbDocs) {
			DocumentRegisterEntryType newDoc = new DocumentRegisterEntryType();

			// create document register object
			response.addDocumentRegisterEntries(Utility
					.createDocumentRegisterHelper(doc));
		}

		return response;
	}

	/**
	 * <pre>
	 * Setzt die Vertrauchlichkeitsstufe f�r das gegebene Dokument.
	 * Vertrauchlichkeitsstufe von getConfidentialityLevels
	 * </pre>
	 * 
	 * @param int Documentregister ID, Confidentialitylevel ID
	 * @return Gibt bei Erfolg true zur�ck
	 */

	public ch.bfh.www.ehrservices.SetConfidentialityResponse setConfidentiality(
			ch.bfh.www.ehrservices.SetConfidentiality setConfidentiality) {
		Utility.getEM().getTransaction().begin();

		Documentregister documentRegister = Utility.getEM().find(
				Documentregister.class,
				setConfidentiality.getDocumentRegisterID());
		documentRegister.setConfidentialitylevel(Utility.getEM().find(
				Confidentialitylevel.class,
				setConfidentiality.getConfidentialityID()));

		Utility.getEM().persist(documentRegister);
		Utility.getEM().getTransaction().commit();

		SetConfidentialityResponse response = new SetConfidentialityResponse();
		response.setSuccess(true);

		return response;
	}

	/**
	 * <pre>
	 * L�scht einen gegebenen Notfallkontakt (Person) eines Patienten.
	 * </pre>
	 * 
	 * @param int Person ID, int Patient ID 
	 * @return Gibt true zur�ck falls erfolgreich gel�scht.
	 */

	public ch.bfh.www.ehrservices.RemoveEmergencyContactResponse removeEmergencyContact(
			ch.bfh.www.ehrservices.RemoveEmergencyContact removeEmergencyContact) {
		
		Query query = Utility.getEM().createQuery("SELECT ec FROM Emergencycontact ec WHERE ec.patient.id = " 
		+ removeEmergencyContact.getPatientID() + " AND ec.person.id = " 
		+ removeEmergencyContact.getPersonID());
		Emergencycontact emergencyContact = (Emergencycontact) query.getSingleResult();
		Person person = Utility.getEM().find(Person.class, removeEmergencyContact.getPersonID());
		
		RemoveEmergencyContactResponse response = new RemoveEmergencyContactResponse();
		
		if(emergencyContact != null && person != null) {
			Utility.getEM().getTransaction().begin();
			Utility.getEM().remove(emergencyContact);
			Utility.getEM().remove(person);
			Utility.getEM().getTransaction().commit();
			response.setSuccess(true);
		}
		else {
			response.setSuccess(false);
		}
		return response;
	}

	/**
	 * <pre>
	 * L�scht eine Verbindung zwischen einem Patienten und einer Organisation.
	 * </pre>
	 * 
	 * @param int OrganisationHP ID, int Patient ID 
	 * @return Gibt true zur�ck falls erfolgreich gel�scht.
	 */

	public ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatientResponse removeOrganisationHPFromPatient(
			ch.bfh.www.ehrservices.RemoveOrganisationHPFromPatient removeOrganisationHPFromPatient) {
		Query query = Utility.getEM().createQuery(
				"SELECT pr FROM Patientrole pr WHERE pr.patient.id = "
						+ removeOrganisationHPFromPatient.getPatientID()
						+ " AND pr.organisationhp.id = "
						+ removeOrganisationHPFromPatient.getOrganisationHPID());
		Patientrole patientRole = (Patientrole) query.getSingleResult();		

		RemoveOrganisationHPFromPatientResponse response = new RemoveOrganisationHPFromPatientResponse();

		if (patientRole != null) {
			Utility.getEM().getTransaction().begin();
			Utility.getEM().remove(patientRole);			
			Utility.getEM().getTransaction().commit();
			response.setSuccess(true);
		} else {
			response.setSuccess(false);
		}
		return response;
	}

	/**
	 * <pre>
	 * L�scht einen Whitelist Eintrag. (Vertrauensperson)
	 * </pre>
	 * 
	 * @param int Patient 1 ID (Enzieht die Rechte), int Patient 2 (Werden die Rechte entzogen) ID 
	 * @return Gibt true zur�ck falls erfolgreich gel�scht.
	 */

	public ch.bfh.www.ehrservices.RemovePatientFromWhitelistResponse removePatientFromWhitelist(
			ch.bfh.www.ehrservices.RemovePatientFromWhitelist removePatientFromWhitelist) {
		Query query = Utility.getEM().createQuery(
				"SELECT wl FROM Whitelist wl WHERE wl.patient1.id = "
						+ removePatientFromWhitelist.getPatientID()
						+ " AND wl.patient2.id = "
						+ removePatientFromWhitelist.getWhitelistPatientID());
		Whitelist whitelist = (Whitelist) query.getSingleResult();		

		RemovePatientFromWhitelistResponse response = new RemovePatientFromWhitelistResponse();

		if (whitelist != null) {
			Utility.getEM().getTransaction().begin();
			Utility.getEM().remove(whitelist);			
			Utility.getEM().getTransaction().commit();
			response.setSuccess(true);
		} else {
			response.setSuccess(false);
		}
		return response;
	}

	/**
	 * <pre>
	 * L�scht einen Healthcare Professional von der Blacklist
	 * </pre>
	 * 
	 * @param int Patient ID, int Healthcareprofessional ID 
	 * @return Gibt true zur�ck falls erfolgreich gel�scht.
	 */

	public ch.bfh.www.ehrservices.RemoveHPFromBlacklistResponse removeHPFromBlacklist(
			ch.bfh.www.ehrservices.RemoveHPFromBlacklist removeHPFromBlacklist) {
		Query query = Utility.getEM().createQuery(
				"SELECT bl FROM Blacklist bl WHERE bl.patient.id = "
						+ removeHPFromBlacklist.getPatientID()
						+ " AND bl.healthcareprofessional.id = "
						+ removeHPFromBlacklist.getHpcID());
		Blacklist blacklist = (Blacklist) query.getSingleResult();		

		RemoveHPFromBlacklistResponse response = new RemoveHPFromBlacklistResponse();

		if (blacklist != null) {
			Utility.getEM().getTransaction().begin();
			Utility.getEM().remove(blacklist);			
			Utility.getEM().getTransaction().commit();
			response.setSuccess(true);
		} else {
			response.setSuccess(false);
		}
		return response;
	}

	/**
	 * <pre>
	 * �berschreibt die Stammdaten des Patienten. Wird nichts mitgegeben (Null) wird keine �nderungen gemacht.
	 * </pre>
	 * 
	 * @param int Person ID (Person ist der Patient)
	 * @return Gibt bei Erfolg das neue, ge�nderte Patient Objekt zur�ck.
	 */

	public ch.bfh.www.ehrservices.SetMasterDataForPatientResponse setMasterDataForPatient(
			ch.bfh.www.ehrservices.SetMasterDataForPatient setMasterDataForPatient) {
		
		// get person object
		Person person = Utility.getEM().find(
				Person.class,
				setMasterDataForPatient.getPersonID());
		
		// set new data to existing object
		if(setMasterDataForPatient.getAddress() != null) person.getAddress().setAddress(setMasterDataForPatient.getAddress());
		if(setMasterDataForPatient.getPostalcode() > 0) person.getAddress().setPostalcode(setMasterDataForPatient.getPostalcode());
		if(setMasterDataForPatient.getMunicipality() != null) person.getAddress().setMunicipality(setMasterDataForPatient.getMunicipality());
		if(setMasterDataForPatient.getCanton() != null) person.getAddress().setCanton(setMasterDataForPatient.getCanton());
		if(setMasterDataForPatient.getCountry() != null) person.getAddress().setCountry(setMasterDataForPatient.getCountry());
		if(setMasterDataForPatient.getEmail() != null) person.setEmail(setMasterDataForPatient.getEmail());
		person.setBirthdate(setMasterDataForPatient.getBirthdate());
		person.setFirstname(setMasterDataForPatient.getFirstname());
		person.setName(setMasterDataForPatient.getName());
		if(setMasterDataForPatient.getMobile() != null) person.setMobile(setMasterDataForPatient.getMobile());
		if(setMasterDataForPatient.getPhone() != null) person.setPhone(setMasterDataForPatient.getPhone());
		
		SetMasterDataForPatientResponse response = new SetMasterDataForPatientResponse();

		// update person object and prepare patient object for frontend
		if (person != null) {
			Utility.getEM().getTransaction().begin();
			Utility.getEM().persist(person);	
			Utility.getEM().getTransaction().commit();
			
			// update patient object for frontend
			Query query = Utility.getEM().createQuery(
					"SELECT p FROM Patient p WHERE p.person.id ='" + setMasterDataForPatient.getPersonID() + "'");
			query.setHint("javax.persistence.cache.storeMode", "REFRESH");
			Patient user = (Patient) query.getSingleResult();

			// Create patient object
			PatientType patient = Utility.createPatientHelper(user);

			// create address and person object
			patient.setPerson(Utility.createPersonWithAddressHelper(user
					.getPerson()));
			
			response.setPatient(patient);
		}
		
		return response;
	}

	/**
	 * <pre>
	 * Gibt alle Dokumente eines Patienten zur�ck, auf welche ein bestimmter OrganisationHp berechtigt ist.
	 * </pre>
	 * 
	 * @param int Patient ID, int OrganisationHP ID
	 * @return Gibt alle berechtigte Dokumente zur�ck.
	 */

	public ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHPResponse getVisibleDocumentsForOrgaHP(
			ch.bfh.www.ehrservices.GetVisibleDocumentsForOrgaHP getVisibleDocumentsForOrgaHP) {
		Query query = Utility.getEM().createQuery(
				"SELECT pm FROM Permissionmatrix pm WHERE pm.patient.id ='" + getVisibleDocumentsForOrgaHP.getPatientID() + "'"
						+ " AND pm.documentregister.organisationhp.id = '" + getVisibleDocumentsForOrgaHP.getOrganisationHPID() + "'");
		List<Permissionmatrix> permissionmatrix = query.getResultList();
		
		GetVisibleDocumentsForOrgaHPResponse response = new GetVisibleDocumentsForOrgaHPResponse();
		
		for(Permissionmatrix pm : permissionmatrix) {		
			response.addDocuments(Utility.createDocumentRegisterHelper(pm.getDocumentregister()));
		}
		
		return response;
	}

	/**
	 * Gibt alle OrganisationHp Objekte zur�ck, welche auf ein bestimmtes Dokument berechtigt sind.
	 * 
	 * @param int Patient ID, int Documentregister ID
	 * @return Gibt alle berechtigten OrganisationHps zur�ck
	 */

	public ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocumentResponse getAuthorisedOrgaHPsForDocument(
			ch.bfh.www.ehrservices.GetAuthorisedOrgaHPsForDocument getAuthorisedOrgaHPsForDocument) {
				
		Query query = Utility.getEM().createQuery(
				"SELECT pm FROM Permissionmatrix pm WHERE pm.documentregister.id = '" + getAuthorisedOrgaHPsForDocument.getDocumentRegisterID() + "'"  // TODO ist noch hp id nicht orgahp..
				+ " AND pm.patient.id = '" + getAuthorisedOrgaHPsForDocument.getPatientID() + "'");
		List<Permissionmatrix> permissionmatrix = query.getResultList();
		
		GetAuthorisedOrgaHPsForDocumentResponse response = new GetAuthorisedOrgaHPsForDocumentResponse();
		
		for(Permissionmatrix pm : permissionmatrix) {		
			Organisationhp orgahp = Utility.getEM().find(
					Organisationhp.class,pm.getDocumentregister().getOrganisationhp().getId());
			response.addOrganisationHPs(Utility.createOrganisationHPHelper(orgahp));
		}
		
		return response;
	}

}
