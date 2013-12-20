package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the accesstype database table.
 * 
 */
@Entity
@NamedQuery(name="Accesstype.findAll", query="SELECT a FROM Accesstype a")
public class Accesstype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String nameDe;

	private String nameFr;

	private String nameIt;

	//bi-directional many-to-one association to Documentlog
	@OneToMany(mappedBy="accesstype")
	private List<Documentlog> documentlogs;

	public Accesstype() {
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

	public List<Documentlog> getDocumentlogs() {
		return this.documentlogs;
	}

	public void setDocumentlogs(List<Documentlog> documentlogs) {
		this.documentlogs = documentlogs;
	}

	public Documentlog addDocumentlog(Documentlog documentlog) {
		getDocumentlogs().add(documentlog);
		documentlog.setAccesstype(this);

		return documentlog;
	}

	public Documentlog removeDocumentlog(Documentlog documentlog) {
		getDocumentlogs().remove(documentlog);
		documentlog.setAccesstype(null);

		return documentlog;
	}

}