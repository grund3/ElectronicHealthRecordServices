package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the blacklist database table.
 * 
 */
@Entity
@NamedQuery(name="Blacklist.findAll", query="SELECT b FROM Blacklist b")
public class Blacklist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to Healthcareprofessional
	@ManyToOne
	@JoinColumn(name="hpID")
	private Healthcareprofessional healthcareprofessional;

	//bi-directional many-to-one association to Patient
	@ManyToOne
	@JoinColumn(name="patientID")
	private Patient patient;

	public Blacklist() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Healthcareprofessional getHealthcareprofessional() {
		return this.healthcareprofessional;
	}

	public void setHealthcareprofessional(Healthcareprofessional healthcareprofessional) {
		this.healthcareprofessional = healthcareprofessional;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}