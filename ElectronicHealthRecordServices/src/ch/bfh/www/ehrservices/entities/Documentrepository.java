package ch.bfh.www.ehrservices.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the documentrepository database table.
 * 
 */
@Entity
@NamedQuery(name="Documentrepository.findAll", query="SELECT d FROM Documentrepository d")
public class Documentrepository implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Lob
	private byte[] document;

	//bi-directional many-to-one association to Documentregister
	@OneToMany(mappedBy="documentrepository")
	private List<Documentregister> documentregisters;

	public Documentrepository() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getDocument() {
		return this.document;
	}

	public void setDocument(byte[] document) {
		this.document = document;
	}

	public List<Documentregister> getDocumentregisters() {
		return this.documentregisters;
	}

	public void setDocumentregisters(List<Documentregister> documentregisters) {
		this.documentregisters = documentregisters;
	}

	public Documentregister addDocumentregister(Documentregister documentregister) {
		getDocumentregisters().add(documentregister);
		documentregister.setDocumentrepository(this);

		return documentregister;
	}

	public Documentregister removeDocumentregister(Documentregister documentregister) {
		getDocumentregisters().remove(documentregister);
		documentregister.setDocumentrepository(null);

		return documentregister;
	}

}