package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String nameDe;

	private String nameFr;

	private String nameIt;

	//bi-directional many-to-one association to Patientrole
	@OneToMany(mappedBy="role")
	private List<Patientrole> patientroles;

	//bi-directional many-to-one association to Permissionschema
	@OneToMany(mappedBy="role")
	private List<Permissionschema> permissionschemas;

	public Role() {
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

	public List<Patientrole> getPatientroles() {
		return this.patientroles;
	}

	public void setPatientroles(List<Patientrole> patientroles) {
		this.patientroles = patientroles;
	}

	public Patientrole addPatientrole(Patientrole patientrole) {
		getPatientroles().add(patientrole);
		patientrole.setRole(this);

		return patientrole;
	}

	public Patientrole removePatientrole(Patientrole patientrole) {
		getPatientroles().remove(patientrole);
		patientrole.setRole(null);

		return patientrole;
	}

	public List<Permissionschema> getPermissionschemas() {
		return this.permissionschemas;
	}

	public void setPermissionschemas(List<Permissionschema> permissionschemas) {
		this.permissionschemas = permissionschemas;
	}

	public Permissionschema addPermissionschema(Permissionschema permissionschema) {
		getPermissionschemas().add(permissionschema);
		permissionschema.setRole(this);

		return permissionschema;
	}

	public Permissionschema removePermissionschema(Permissionschema permissionschema) {
		getPermissionschemas().remove(permissionschema);
		permissionschema.setRole(null);

		return permissionschema;
	}

}