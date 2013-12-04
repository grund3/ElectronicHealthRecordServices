package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the documentregister database table.
 * 
 */
@Entity
@NamedQuery(name="Documentregister.findAll", query="SELECT d FROM Documentregister d")
public class Documentregister implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	private String title;

	@Temporal(TemporalType.TIMESTAMP)
	private Date uploadDate;

	//bi-directional many-to-one association to Documentlog
	@OneToMany(mappedBy="documentregister")
	private List<Documentlog> documentlogs;

	//bi-directional many-to-one association to Documenttype
	@ManyToOne
	@JoinColumn(name="documentTypeID")
	private Documenttype documenttype;

	//bi-directional many-to-one association to Organisationhp
	@ManyToOne
	@JoinColumn(name="organisationHpID")
	private Organisationhp organisationhp;

	//bi-directional many-to-one association to Confidentialitylevel
	@ManyToOne
	@JoinColumn(name="confidentialityLevelID")
	private Confidentialitylevel confidentialitylevel;

	//bi-directional many-to-one association to Patient
	@ManyToOne
	@JoinColumn(name="patientID")
	private Patient patient;

	//bi-directional many-to-one association to Documentrepository
	@ManyToOne
	@JoinColumn(name="documentRepositoryID")
	private Documentrepository documentrepository;

	//bi-directional many-to-one association to Permissionmatrix
	@OneToMany(mappedBy="documentregister")
	private List<Permissionmatrix> permissionmatrixs;

	public Documentregister() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUploadDate() {
		return this.uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public List<Documentlog> getDocumentlogs() {
		return this.documentlogs;
	}

	public void setDocumentlogs(List<Documentlog> documentlogs) {
		this.documentlogs = documentlogs;
	}

	public Documentlog addDocumentlog(Documentlog documentlog) {
		getDocumentlogs().add(documentlog);
		documentlog.setDocumentregister(this);

		return documentlog;
	}

	public Documentlog removeDocumentlog(Documentlog documentlog) {
		getDocumentlogs().remove(documentlog);
		documentlog.setDocumentregister(null);

		return documentlog;
	}

	public Documenttype getDocumenttype() {
		return this.documenttype;
	}

	public void setDocumenttype(Documenttype documenttype) {
		this.documenttype = documenttype;
	}

	public Organisationhp getOrganisationhp() {
		return this.organisationhp;
	}

	public void setOrganisationhp(Organisationhp organisationhp) {
		this.organisationhp = organisationhp;
	}

	public Confidentialitylevel getConfidentialitylevel() {
		return this.confidentialitylevel;
	}

	public void setConfidentialitylevel(Confidentialitylevel confidentialitylevel) {
		this.confidentialitylevel = confidentialitylevel;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Documentrepository getDocumentrepository() {
		return this.documentrepository;
	}

	public void setDocumentrepository(Documentrepository documentrepository) {
		this.documentrepository = documentrepository;
	}

	public List<Permissionmatrix> getPermissionmatrixs() {
		return this.permissionmatrixs;
	}

	public void setPermissionmatrixs(List<Permissionmatrix> permissionmatrixs) {
		this.permissionmatrixs = permissionmatrixs;
	}

	public Permissionmatrix addPermissionmatrix(Permissionmatrix permissionmatrix) {
		getPermissionmatrixs().add(permissionmatrix);
		permissionmatrix.setDocumentregister(this);

		return permissionmatrix;
	}

	public Permissionmatrix removePermissionmatrix(Permissionmatrix permissionmatrix) {
		getPermissionmatrixs().remove(permissionmatrix);
		permissionmatrix.setDocumentregister(null);

		return permissionmatrix;
	}

}