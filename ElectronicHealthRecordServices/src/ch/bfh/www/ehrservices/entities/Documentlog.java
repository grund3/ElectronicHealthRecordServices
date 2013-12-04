package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the documentlog database table.
 * 
 */
@Entity
@NamedQuery(name="Documentlog.findAll", query="SELECT d FROM Documentlog d")
public class Documentlog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date time;

	//bi-directional many-to-one association to Documentregister
	@ManyToOne
	@JoinColumn(name="documentID")
	private Documentregister documentregister;

	//bi-directional many-to-one association to Organisationhp
	@ManyToOne
	@JoinColumn(name="organisationHpID")
	private Organisationhp organisationhp;

	//bi-directional many-to-one association to Accesstype
	@ManyToOne
	@JoinColumn(name="accessTypeID")
	private Accesstype accesstype;

	public Documentlog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Documentregister getDocumentregister() {
		return this.documentregister;
	}

	public void setDocumentregister(Documentregister documentregister) {
		this.documentregister = documentregister;
	}

	public Organisationhp getOrganisationhp() {
		return this.organisationhp;
	}

	public void setOrganisationhp(Organisationhp organisationhp) {
		this.organisationhp = organisationhp;
	}

	public Accesstype getAccesstype() {
		return this.accesstype;
	}

	public void setAccesstype(Accesstype accesstype) {
		this.accesstype = accesstype;
	}

}