package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date birthdate;

	private String email;

	private String firstname;

	private String gender;

	private String mobile;

	private String name;

	private String phone;

	private String title;

	//bi-directional many-to-one association to Emergencycontact
	@OneToMany(mappedBy="person")
	private List<Emergencycontact> emergencycontacts;

	//bi-directional many-to-one association to Healthcareprofessional
	@OneToMany(mappedBy="person")
	private List<Healthcareprofessional> healthcareprofessionals;

	//bi-directional many-to-one association to Patient
	@OneToMany(mappedBy="person")
	private List<Patient> patients;

	//bi-directional many-to-one association to Address
	@ManyToOne
	@JoinColumn(name="addressID")
	private Address address;

	public Person() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Emergencycontact> getEmergencycontacts() {
		return this.emergencycontacts;
	}

	public void setEmergencycontacts(List<Emergencycontact> emergencycontacts) {
		this.emergencycontacts = emergencycontacts;
	}

	public Emergencycontact addEmergencycontact(Emergencycontact emergencycontact) {
		getEmergencycontacts().add(emergencycontact);
		emergencycontact.setPerson(this);

		return emergencycontact;
	}

	public Emergencycontact removeEmergencycontact(Emergencycontact emergencycontact) {
		getEmergencycontacts().remove(emergencycontact);
		emergencycontact.setPerson(null);

		return emergencycontact;
	}

	public List<Healthcareprofessional> getHealthcareprofessionals() {
		return this.healthcareprofessionals;
	}

	public void setHealthcareprofessionals(List<Healthcareprofessional> healthcareprofessionals) {
		this.healthcareprofessionals = healthcareprofessionals;
	}

	public Healthcareprofessional addHealthcareprofessional(Healthcareprofessional healthcareprofessional) {
		getHealthcareprofessionals().add(healthcareprofessional);
		healthcareprofessional.setPerson(this);

		return healthcareprofessional;
	}

	public Healthcareprofessional removeHealthcareprofessional(Healthcareprofessional healthcareprofessional) {
		getHealthcareprofessionals().remove(healthcareprofessional);
		healthcareprofessional.setPerson(null);

		return healthcareprofessional;
	}

	public List<Patient> getPatients() {
		return this.patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public Patient addPatient(Patient patient) {
		getPatients().add(patient);
		patient.setPerson(this);

		return patient;
	}

	public Patient removePatient(Patient patient) {
		getPatients().remove(patient);
		patient.setPerson(null);

		return patient;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}