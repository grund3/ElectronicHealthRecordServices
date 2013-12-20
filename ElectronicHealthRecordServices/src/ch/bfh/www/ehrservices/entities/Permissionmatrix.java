package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the permissionmatrix database table.
 * 
 */
@Entity
@NamedQuery(name="Permissionmatrix.findAll", query="SELECT p FROM Permissionmatrix p")
public class Permissionmatrix implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to Documentregister
	@ManyToOne
	@JoinColumn(name="documentID")
	private Documentregister documentregister;

	//bi-directional many-to-one association to Healthcareprofessional
	@ManyToOne
	@JoinColumn(name="hpID")
	private Healthcareprofessional healthcareprofessional;

	//bi-directional many-to-one association to Patient
	@ManyToOne
	@JoinColumn(name="patientID")
	private Patient patient;

	//bi-directional many-to-one association to Permissionschema
	@OneToMany(mappedBy="permissionmatrix")
	private List<Permissionschema> permissionschemas;

	public Permissionmatrix() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Documentregister getDocumentregister() {
		return this.documentregister;
	}

	public void setDocumentregister(Documentregister documentregister) {
		this.documentregister = documentregister;
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

	public List<Permissionschema> getPermissionschemas() {
		return this.permissionschemas;
	}

	public void setPermissionschemas(List<Permissionschema> permissionschemas) {
		this.permissionschemas = permissionschemas;
	}

	public Permissionschema addPermissionschema(Permissionschema permissionschema) {
		getPermissionschemas().add(permissionschema);
		permissionschema.setPermissionmatrix(this);

		return permissionschema;
	}

	public Permissionschema removePermissionschema(Permissionschema permissionschema) {
		getPermissionschemas().remove(permissionschema);
		permissionschema.setPermissionmatrix(null);

		return permissionschema;
	}

}