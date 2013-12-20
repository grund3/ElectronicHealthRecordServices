package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the organisationhp database table.
 * 
 */
@Entity
@NamedQuery(name="Organisationhp.findAll", query="SELECT o FROM Organisationhp o")
public class Organisationhp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String zsr;

	//bi-directional many-to-one association to Documentlog
	@OneToMany(mappedBy="organisationhp")
	private List<Documentlog> documentlogs;

	//bi-directional many-to-one association to Documentregister
	@OneToMany(mappedBy="organisationhp")
	private List<Documentregister> documentregisters;

	//bi-directional many-to-one association to Healthcareprofessional
	@ManyToOne
	@JoinColumn(name="hpID")
	private Healthcareprofessional healthcareprofessional;

	//bi-directional many-to-one association to Hptype
	@ManyToOne
	@JoinColumn(name="hpTypeID")
	private Hptype hptype;

	//bi-directional many-to-one association to Organisation
	@ManyToOne
	@JoinColumn(name="organisationID")
	private Organisation organisation;

	//bi-directional many-to-one association to Patientrole
	@OneToMany(mappedBy="organisationhp")
	private List<Patientrole> patientroles;

	public Organisationhp() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getZsr() {
		return this.zsr;
	}

	public void setZsr(String zsr) {
		this.zsr = zsr;
	}

	public List<Documentlog> getDocumentlogs() {
		return this.documentlogs;
	}

	public void setDocumentlogs(List<Documentlog> documentlogs) {
		this.documentlogs = documentlogs;
	}

	public Documentlog addDocumentlog(Documentlog documentlog) {
		getDocumentlogs().add(documentlog);
		documentlog.setOrganisationhp(this);

		return documentlog;
	}

	public Documentlog removeDocumentlog(Documentlog documentlog) {
		getDocumentlogs().remove(documentlog);
		documentlog.setOrganisationhp(null);

		return documentlog;
	}

	public List<Documentregister> getDocumentregisters() {
		return this.documentregisters;
	}

	public void setDocumentregisters(List<Documentregister> documentregisters) {
		this.documentregisters = documentregisters;
	}

	public Documentregister addDocumentregister(Documentregister documentregister) {
		getDocumentregisters().add(documentregister);
		documentregister.setOrganisationhp(this);

		return documentregister;
	}

	public Documentregister removeDocumentregister(Documentregister documentregister) {
		getDocumentregisters().remove(documentregister);
		documentregister.setOrganisationhp(null);

		return documentregister;
	}

	public Healthcareprofessional getHealthcareprofessional() {
		return this.healthcareprofessional;
	}

	public void setHealthcareprofessional(Healthcareprofessional healthcareprofessional) {
		this.healthcareprofessional = healthcareprofessional;
	}

	public Hptype getHptype() {
		return this.hptype;
	}

	public void setHptype(Hptype hptype) {
		this.hptype = hptype;
	}

	public Organisation getOrganisation() {
		return this.organisation;
	}

	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}

	public List<Patientrole> getPatientroles() {
		return this.patientroles;
	}

	public void setPatientroles(List<Patientrole> patientroles) {
		this.patientroles = patientroles;
	}

	public Patientrole addPatientrole(Patientrole patientrole) {
		getPatientroles().add(patientrole);
		patientrole.setOrganisationhp(this);

		return patientrole;
	}

	public Patientrole removePatientrole(Patientrole patientrole) {
		getPatientroles().remove(patientrole);
		patientrole.setOrganisationhp(null);

		return patientrole;
	}

}