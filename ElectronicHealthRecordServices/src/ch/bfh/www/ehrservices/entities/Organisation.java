package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the organisation database table.
 * 
 */
@Entity
@NamedQuery(name="Organisation.findAll", query="SELECT o FROM Organisation o")
public class Organisation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String nameDe;

	private String nameFr;

	private String nameIt;

	private String url;

	//bi-directional many-to-one association to Address
	@ManyToOne
	@JoinColumn(name="addressID")
	private Address address;

	//bi-directional many-to-one association to Organisation
	@ManyToOne
	@JoinColumn(name="parentID")
	private Organisation organisation;

	//bi-directional many-to-one association to Organisation
	@OneToMany(mappedBy="organisation")
	private List<Organisation> organisations;

	//bi-directional many-to-one association to Organisationtype
	@ManyToOne
	@JoinColumn(name="organisationTypeID")
	private Organisationtype organisationtype;

	//bi-directional many-to-one association to Organisationhp
	@OneToMany(mappedBy="organisation")
	private List<Organisationhp> organisationhps;

	public Organisation() {
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Organisation getOrganisation() {
		return this.organisation;
	}

	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}

	public List<Organisation> getOrganisations() {
		return this.organisations;
	}

	public void setOrganisations(List<Organisation> organisations) {
		this.organisations = organisations;
	}

	public Organisation addOrganisation(Organisation organisation) {
		getOrganisations().add(organisation);
		organisation.setOrganisation(this);

		return organisation;
	}

	public Organisation removeOrganisation(Organisation organisation) {
		getOrganisations().remove(organisation);
		organisation.setOrganisation(null);

		return organisation;
	}

	public Organisationtype getOrganisationtype() {
		return this.organisationtype;
	}

	public void setOrganisationtype(Organisationtype organisationtype) {
		this.organisationtype = organisationtype;
	}

	public List<Organisationhp> getOrganisationhps() {
		return this.organisationhps;
	}

	public void setOrganisationhps(List<Organisationhp> organisationhps) {
		this.organisationhps = organisationhps;
	}

	public Organisationhp addOrganisationhp(Organisationhp organisationhp) {
		getOrganisationhps().add(organisationhp);
		organisationhp.setOrganisation(this);

		return organisationhp;
	}

	public Organisationhp removeOrganisationhp(Organisationhp organisationhp) {
		getOrganisationhps().remove(organisationhp);
		organisationhp.setOrganisation(null);

		return organisationhp;
	}

}