package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the patient database table.
 * 
 */
@Entity
@NamedQuery(name="Patient.findAll", query="SELECT p FROM Patient p")
public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String language;

	private String mpi;

	private String password;

	private String salt;

	private String username;

	//bi-directional many-to-one association to Blacklist
	@OneToMany(mappedBy="patient")
	private List<Blacklist> blacklists;

	//bi-directional many-to-one association to Documentregister
	@OneToMany(mappedBy="patient")
	private List<Documentregister> documentregisters;

	//bi-directional many-to-one association to Emergencycontact
	@OneToMany(mappedBy="patient")
	private List<Emergencycontact> emergencycontacts;

	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="personID")
	private Person person;

	//bi-directional many-to-one association to Patientinsurance
	@OneToMany(mappedBy="patient")
	private List<Patientinsurance> patientinsurances;

	//bi-directional many-to-one association to Patientrole
	@OneToMany(mappedBy="patient")
	private List<Patientrole> patientroles;

	//bi-directional many-to-one association to Permissionmatrix
	@OneToMany(mappedBy="patient")
	private List<Permissionmatrix> permissionmatrixs;

	//bi-directional many-to-one association to Whitelist
	@OneToMany(mappedBy="patient1")
	private List<Whitelist> whitelists1;

	//bi-directional many-to-one association to Whitelist
	@OneToMany(mappedBy="patient2")
	private List<Whitelist> whitelists2;

	public Patient() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMpi() {
		return this.mpi;
	}

	public void setMpi(String mpi) {
		this.mpi = mpi;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Blacklist> getBlacklists() {
		return this.blacklists;
	}

	public void setBlacklists(List<Blacklist> blacklists) {
		this.blacklists = blacklists;
	}

	public Blacklist addBlacklist(Blacklist blacklist) {
		getBlacklists().add(blacklist);
		blacklist.setPatient(this);

		return blacklist;
	}

	public Blacklist removeBlacklist(Blacklist blacklist) {
		getBlacklists().remove(blacklist);
		blacklist.setPatient(null);

		return blacklist;
	}

	public List<Documentregister> getDocumentregisters() {
		return this.documentregisters;
	}

	public void setDocumentregisters(List<Documentregister> documentregisters) {
		this.documentregisters = documentregisters;
	}

	public Documentregister addDocumentregister(Documentregister documentregister) {
		getDocumentregisters().add(documentregister);
		documentregister.setPatient(this);

		return documentregister;
	}

	public Documentregister removeDocumentregister(Documentregister documentregister) {
		getDocumentregisters().remove(documentregister);
		documentregister.setPatient(null);

		return documentregister;
	}

	public List<Emergencycontact> getEmergencycontacts() {
		return this.emergencycontacts;
	}

	public void setEmergencycontacts(List<Emergencycontact> emergencycontacts) {
		this.emergencycontacts = emergencycontacts;
	}

	public Emergencycontact addEmergencycontact(Emergencycontact emergencycontact) {
		getEmergencycontacts().add(emergencycontact);
		emergencycontact.setPatient(this);

		return emergencycontact;
	}

	public Emergencycontact removeEmergencycontact(Emergencycontact emergencycontact) {
		getEmergencycontacts().remove(emergencycontact);
		emergencycontact.setPatient(null);

		return emergencycontact;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Patientinsurance> getPatientinsurances() {
		return this.patientinsurances;
	}

	public void setPatientinsurances(List<Patientinsurance> patientinsurances) {
		this.patientinsurances = patientinsurances;
	}

	public Patientinsurance addPatientinsurance(Patientinsurance patientinsurance) {
		getPatientinsurances().add(patientinsurance);
		patientinsurance.setPatient(this);

		return patientinsurance;
	}

	public Patientinsurance removePatientinsurance(Patientinsurance patientinsurance) {
		getPatientinsurances().remove(patientinsurance);
		patientinsurance.setPatient(null);

		return patientinsurance;
	}

	public List<Patientrole> getPatientroles() {
		return this.patientroles;
	}

	public void setPatientroles(List<Patientrole> patientroles) {
		this.patientroles = patientroles;
	}

	public Patientrole addPatientrole(Patientrole patientrole) {
		getPatientroles().add(patientrole);
		patientrole.setPatient(this);

		return patientrole;
	}

	public Patientrole removePatientrole(Patientrole patientrole) {
		getPatientroles().remove(patientrole);
		patientrole.setPatient(null);

		return patientrole;
	}

	public List<Permissionmatrix> getPermissionmatrixs() {
		return this.permissionmatrixs;
	}

	public void setPermissionmatrixs(List<Permissionmatrix> permissionmatrixs) {
		this.permissionmatrixs = permissionmatrixs;
	}

	public Permissionmatrix addPermissionmatrix(Permissionmatrix permissionmatrix) {
		getPermissionmatrixs().add(permissionmatrix);
		permissionmatrix.setPatient(this);

		return permissionmatrix;
	}

	public Permissionmatrix removePermissionmatrix(Permissionmatrix permissionmatrix) {
		getPermissionmatrixs().remove(permissionmatrix);
		permissionmatrix.setPatient(null);

		return permissionmatrix;
	}

	public List<Whitelist> getWhitelists1() {
		return this.whitelists1;
	}

	public void setWhitelists1(List<Whitelist> whitelists1) {
		this.whitelists1 = whitelists1;
	}

	public Whitelist addWhitelists1(Whitelist whitelists1) {
		getWhitelists1().add(whitelists1);
		whitelists1.setPatient1(this);

		return whitelists1;
	}

	public Whitelist removeWhitelists1(Whitelist whitelists1) {
		getWhitelists1().remove(whitelists1);
		whitelists1.setPatient1(null);

		return whitelists1;
	}

	public List<Whitelist> getWhitelists2() {
		return this.whitelists2;
	}

	public void setWhitelists2(List<Whitelist> whitelists2) {
		this.whitelists2 = whitelists2;
	}

	public Whitelist addWhitelists2(Whitelist whitelists2) {
		getWhitelists2().add(whitelists2);
		whitelists2.setPatient2(this);

		return whitelists2;
	}

	public Whitelist removeWhitelists2(Whitelist whitelists2) {
		getWhitelists2().remove(whitelists2);
		whitelists2.setPatient2(null);

		return whitelists2;
	}

}