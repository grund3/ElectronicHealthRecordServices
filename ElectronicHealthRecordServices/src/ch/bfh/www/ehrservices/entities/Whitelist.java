package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the whitelist database table.
 * 
 */
@Entity
@NamedQuery(name="Whitelist.findAll", query="SELECT w FROM Whitelist w")
public class Whitelist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to Patient
	@ManyToOne
	@JoinColumn(name="giverID")
	private Patient patient1;

	//bi-directional many-to-one association to Patient
	@ManyToOne
	@JoinColumn(name="receiverID")
	private Patient patient2;

	public Whitelist() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Patient getPatient1() {
		return this.patient1;
	}

	public void setPatient1(Patient patient1) {
		this.patient1 = patient1;
	}

	public Patient getPatient2() {
		return this.patient2;
	}

	public void setPatient2(Patient patient2) {
		this.patient2 = patient2;
	}

}