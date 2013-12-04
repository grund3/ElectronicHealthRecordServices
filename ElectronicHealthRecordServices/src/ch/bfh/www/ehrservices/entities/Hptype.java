package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the hptype database table.
 * 
 */
@Entity
@NamedQuery(name="Hptype.findAll", query="SELECT h FROM Hptype h")
public class Hptype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String nameDe;

	private String nameFr;

	private String nameIt;

	//bi-directional many-to-one association to Healthcareprofessional
	@OneToMany(mappedBy="hptype")
	private List<Healthcareprofessional> healthcareprofessionals;

	//bi-directional many-to-one association to Organisationhp
	@OneToMany(mappedBy="hptype")
	private List<Organisationhp> organisationhps;

	public Hptype() {
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

	public List<Healthcareprofessional> getHealthcareprofessionals() {
		return this.healthcareprofessionals;
	}

	public void setHealthcareprofessionals(List<Healthcareprofessional> healthcareprofessionals) {
		this.healthcareprofessionals = healthcareprofessionals;
	}

	public Healthcareprofessional addHealthcareprofessional(Healthcareprofessional healthcareprofessional) {
		getHealthcareprofessionals().add(healthcareprofessional);
		healthcareprofessional.setHptype(this);

		return healthcareprofessional;
	}

	public Healthcareprofessional removeHealthcareprofessional(Healthcareprofessional healthcareprofessional) {
		getHealthcareprofessionals().remove(healthcareprofessional);
		healthcareprofessional.setHptype(null);

		return healthcareprofessional;
	}

	public List<Organisationhp> getOrganisationhps() {
		return this.organisationhps;
	}

	public void setOrganisationhps(List<Organisationhp> organisationhps) {
		this.organisationhps = organisationhps;
	}

	public Organisationhp addOrganisationhp(Organisationhp organisationhp) {
		getOrganisationhps().add(organisationhp);
		organisationhp.setHptype(this);

		return organisationhp;
	}

	public Organisationhp removeOrganisationhp(Organisationhp organisationhp) {
		getOrganisationhps().remove(organisationhp);
		organisationhp.setHptype(null);

		return organisationhp;
	}

}