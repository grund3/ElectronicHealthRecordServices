package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the patientinsurance database table.
 * 
 */
@Entity
@NamedQuery(name="Patientinsurance.findAll", query="SELECT p FROM Patientinsurance p")
public class Patientinsurance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String insuranceCardNr;

	private String ward;

	//bi-directional many-to-one association to Insurance
	@ManyToOne
	@JoinColumn(name="insuranceID")
	private Insurance insurance;

	//bi-directional many-to-one association to Patient
	@ManyToOne
	@JoinColumn(name="patientID")
	private Patient patient;

	public Patientinsurance() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInsuranceCardNr() {
		return this.insuranceCardNr;
	}

	public void setInsuranceCardNr(String insuranceCardNr) {
		this.insuranceCardNr = insuranceCardNr;
	}

	public String getWard() {
		return this.ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public Insurance getInsurance() {
		return this.insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}