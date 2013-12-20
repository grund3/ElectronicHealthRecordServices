package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the permissionschema database table.
 * 
 */
@Entity
@NamedQuery(name="Permissionschema.findAll", query="SELECT p FROM Permissionschema p")
public class Permissionschema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private byte value;

	//bi-directional many-to-one association to Confidentialitylevel
	@ManyToOne
	@JoinColumn(name="confidentialityLevelID")
	private Confidentialitylevel confidentialitylevel;

	//bi-directional many-to-one association to Permissionmatrix
	@ManyToOne
	@JoinColumn(name="matrixID")
	private Permissionmatrix permissionmatrix;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="roleID")
	private Role role;

	public Permissionschema() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getValue() {
		return this.value;
	}

	public void setValue(byte value) {
		this.value = value;
	}

	public Confidentialitylevel getConfidentialitylevel() {
		return this.confidentialitylevel;
	}

	public void setConfidentialitylevel(Confidentialitylevel confidentialitylevel) {
		this.confidentialitylevel = confidentialitylevel;
	}

	public Permissionmatrix getPermissionmatrix() {
		return this.permissionmatrix;
	}

	public void setPermissionmatrix(Permissionmatrix permissionmatrix) {
		this.permissionmatrix = permissionmatrix;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}