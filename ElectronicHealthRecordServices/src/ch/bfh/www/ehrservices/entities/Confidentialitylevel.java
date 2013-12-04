package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the confidentialitylevel database table.
 * 
 */
@Entity
@NamedQuery(name="Confidentialitylevel.findAll", query="SELECT c FROM Confidentialitylevel c")
public class Confidentialitylevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String nameDe;

	private String nameFr;

	private String nameIt;

	//bi-directional many-to-one association to Documentregister
	@OneToMany(mappedBy="confidentialitylevel")
	private List<Documentregister> documentregisters;

	//bi-directional many-to-one association to Permissionschema
	@OneToMany(mappedBy="confidentialitylevel")
	private List<Permissionschema> permissionschemas;

	public Confidentialitylevel() {
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

	public List<Documentregister> getDocumentregisters() {
		return this.documentregisters;
	}

	public void setDocumentregisters(List<Documentregister> documentregisters) {
		this.documentregisters = documentregisters;
	}

	public Documentregister addDocumentregister(Documentregister documentregister) {
		getDocumentregisters().add(documentregister);
		documentregister.setConfidentialitylevel(this);

		return documentregister;
	}

	public Documentregister removeDocumentregister(Documentregister documentregister) {
		getDocumentregisters().remove(documentregister);
		documentregister.setConfidentialitylevel(null);

		return documentregister;
	}

	public List<Permissionschema> getPermissionschemas() {
		return this.permissionschemas;
	}

	public void setPermissionschemas(List<Permissionschema> permissionschemas) {
		this.permissionschemas = permissionschemas;
	}

	public Permissionschema addPermissionschema(Permissionschema permissionschema) {
		getPermissionschemas().add(permissionschema);
		permissionschema.setConfidentialitylevel(this);

		return permissionschema;
	}

	public Permissionschema removePermissionschema(Permissionschema permissionschema) {
		getPermissionschemas().remove(permissionschema);
		permissionschema.setConfidentialitylevel(null);

		return permissionschema;
	}

}