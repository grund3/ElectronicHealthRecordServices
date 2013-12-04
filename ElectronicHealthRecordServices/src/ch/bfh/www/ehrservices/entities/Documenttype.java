package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the documenttype database table.
 * 
 */
@Entity
@NamedQuery(name="Documenttype.findAll", query="SELECT d FROM Documenttype d")
public class Documenttype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String extension;

	@Lob
	private byte[] icon;

	private String mimeType;

	private String name;

	//bi-directional many-to-one association to Documentregister
	@OneToMany(mappedBy="documenttype")
	private List<Documentregister> documentregisters;

	public Documenttype() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public byte[] getIcon() {
		return this.icon;
	}

	public void setIcon(byte[] icon) {
		this.icon = icon;
	}

	public String getMimeType() {
		return this.mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Documentregister> getDocumentregisters() {
		return this.documentregisters;
	}

	public void setDocumentregisters(List<Documentregister> documentregisters) {
		this.documentregisters = documentregisters;
	}

	public Documentregister addDocumentregister(Documentregister documentregister) {
		getDocumentregisters().add(documentregister);
		documentregister.setDocumenttype(this);

		return documentregister;
	}

	public Documentregister removeDocumentregister(Documentregister documentregister) {
		getDocumentregisters().remove(documentregister);
		documentregister.setDocumenttype(null);

		return documentregister;
	}

}