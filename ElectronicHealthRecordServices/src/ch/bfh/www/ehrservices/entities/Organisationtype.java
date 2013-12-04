package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the organisationtype database table.
 * 
 */
@Entity
@NamedQuery(name="Organisationtype.findAll", query="SELECT o FROM Organisationtype o")
public class Organisationtype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String nameDe;

	private String nameFr;

	private String nameIt;

	//bi-directional many-to-one association to Organisation
	@OneToMany(mappedBy="organisationtype")
	private List<Organisation> organisations;

	public Organisationtype() {
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

	public List<Organisation> getOrganisations() {
		return this.organisations;
	}

	public void setOrganisations(List<Organisation> organisations) {
		this.organisations = organisations;
	}

	public Organisation addOrganisation(Organisation organisation) {
		getOrganisations().add(organisation);
		organisation.setOrganisationtype(this);

		return organisation;
	}

	public Organisation removeOrganisation(Organisation organisation) {
		getOrganisations().remove(organisation);
		organisation.setOrganisationtype(null);

		return organisation;
	}

}