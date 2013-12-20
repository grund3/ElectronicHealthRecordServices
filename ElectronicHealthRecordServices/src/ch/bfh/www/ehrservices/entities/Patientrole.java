package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the patientrole database table.
 * 
 */
@Entity
@NamedQuery(name="Patientrole.findAll", query="SELECT p FROM Patientrole p")
public class Patientrole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date accessTill;

	//bi-directional many-to-one association to Organisationhp
	@ManyToOne
	@JoinColumn(name="organisationHpID")
	private Organisationhp organisationhp;

	//bi-directional many-to-one association to Patient
	@ManyToOne
	@JoinColumn(name="patientID")
	private Patient patient;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="roleID")
	private Role role;

	public Patientrole() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAccessTill() {
		return this.accessTill;
	}

	public void setAccessTill(Date accessTill) {
		this.accessTill = accessTill;
	}

	public Organisationhp getOrganisationhp() {
		return this.organisationhp;
	}

	public void setOrganisationhp(Organisationhp organisationhp) {
		this.organisationhp = organisationhp;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}