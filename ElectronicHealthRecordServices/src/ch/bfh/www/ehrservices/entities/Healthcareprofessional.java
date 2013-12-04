package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the healthcareprofessional database table.
 * 
 */
@Entity
@NamedQuery(name="Healthcareprofessional.findAll", query="SELECT h FROM Healthcareprofessional h")
public class Healthcareprofessional implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String email;

	private String fmh;

	private String gln;

	private String hpc;

	private int mobile;

	private int phone;

	//bi-directional many-to-one association to Blacklist
	@OneToMany(mappedBy="healthcareprofessional")
	private List<Blacklist> blacklists;

	//bi-directional many-to-one association to Person
	@ManyToOne
	@JoinColumn(name="personID")
	private Person person;

	//bi-directional many-to-one association to Hptype
	@ManyToOne
	@JoinColumn(name="qualitativeDignityID")
	private Hptype hptype;

	//bi-directional many-to-one association to Organisationhp
	@OneToMany(mappedBy="healthcareprofessional")
	private List<Organisationhp> organisationhps;

	//bi-directional many-to-one association to Permissionmatrix
	@OneToMany(mappedBy="healthcareprofessional")
	private List<Permissionmatrix> permissionmatrixs;

	public Healthcareprofessional() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFmh() {
		return this.fmh;
	}

	public void setFmh(String fmh) {
		this.fmh = fmh;
	}

	public String getGln() {
		return this.gln;
	}

	public void setGln(String gln) {
		this.gln = gln;
	}

	public String getHpc() {
		return this.hpc;
	}

	public void setHpc(String hpc) {
		this.hpc = hpc;
	}

	public int getMobile() {
		return this.mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public int getPhone() {
		return this.phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public List<Blacklist> getBlacklists() {
		return this.blacklists;
	}

	public void setBlacklists(List<Blacklist> blacklists) {
		this.blacklists = blacklists;
	}

	public Blacklist addBlacklist(Blacklist blacklist) {
		getBlacklists().add(blacklist);
		blacklist.setHealthcareprofessional(this);

		return blacklist;
	}

	public Blacklist removeBlacklist(Blacklist blacklist) {
		getBlacklists().remove(blacklist);
		blacklist.setHealthcareprofessional(null);

		return blacklist;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Hptype getHptype() {
		return this.hptype;
	}

	public void setHptype(Hptype hptype) {
		this.hptype = hptype;
	}

	public List<Organisationhp> getOrganisationhps() {
		return this.organisationhps;
	}

	public void setOrganisationhps(List<Organisationhp> organisationhps) {
		this.organisationhps = organisationhps;
	}

	public Organisationhp addOrganisationhp(Organisationhp organisationhp) {
		getOrganisationhps().add(organisationhp);
		organisationhp.setHealthcareprofessional(this);

		return organisationhp;
	}

	public Organisationhp removeOrganisationhp(Organisationhp organisationhp) {
		getOrganisationhps().remove(organisationhp);
		organisationhp.setHealthcareprofessional(null);

		return organisationhp;
	}

	public List<Permissionmatrix> getPermissionmatrixs() {
		return this.permissionmatrixs;
	}

	public void setPermissionmatrixs(List<Permissionmatrix> permissionmatrixs) {
		this.permissionmatrixs = permissionmatrixs;
	}

	public Permissionmatrix addPermissionmatrix(Permissionmatrix permissionmatrix) {
		getPermissionmatrixs().add(permissionmatrix);
		permissionmatrix.setHealthcareprofessional(this);

		return permissionmatrix;
	}

	public Permissionmatrix removePermissionmatrix(Permissionmatrix permissionmatrix) {
		getPermissionmatrixs().remove(permissionmatrix);
		permissionmatrix.setHealthcareprofessional(null);

		return permissionmatrix;
	}

}