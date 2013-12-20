package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the insurance database table.
 * 
 */
@Entity
@NamedQuery(name="Insurance.findAll", query="SELECT i FROM Insurance i")
public class Insurance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String nameDe;

	private String nameFr;

	private String nameIt;

	//bi-directional many-to-one association to Address
	@ManyToOne
	@JoinColumn(name="addressID")
	private Address address;

	//bi-directional many-to-one association to Patientinsurance
	@OneToMany(mappedBy="insurance")
	private List<Patientinsurance> patientinsurances;

	public Insurance() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameDe() {
		return this.nameDe;
	}

	public void setNameDe(String nameDe) {
		this.nameDe = nameDe;
	}

	public String getNameFr() {
		return this.nameFr;
	}

	public void setNameFr(String nameFr) {
		this.nameFr = nameFr;
	}

	public String getNameIt() {
		return this.nameIt;
	}

	public void setNameIt(String nameIt) {
		this.nameIt = nameIt;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Patientinsurance> getPatientinsurances() {
		return this.patientinsurances;
	}

	public void setPatientinsurances(List<Patientinsurance> patientinsurances) {
		this.patientinsurances = patientinsurances;
	}

	public Patientinsurance addPatientinsurance(Patientinsurance patientinsurance) {
		getPatientinsurances().add(patientinsurance);
		patientinsurance.setInsurance(this);

		return patientinsurance;
	}

	public Patientinsurance removePatientinsurance(Patientinsurance patientinsurance) {
		getPatientinsurances().remove(patientinsurance);
		patientinsurance.setInsurance(null);

		return patientinsurance;
	}

}