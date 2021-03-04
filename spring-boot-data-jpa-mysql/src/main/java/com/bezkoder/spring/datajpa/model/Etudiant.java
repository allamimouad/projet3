package com.bezkoder.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "Etudiants")
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "pdf")
	private String pdf;

	@Column(name = "published")
	private boolean published;

	public Etudiant() {

	}

	public Etudiant(String title, String description, boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Cours [" 
						+ "id=" + id 
						+ ", title=" + title 
						+ ", desc=" + description 
						+ ", image=" + image 
						+ ", pdf=" + pdf 
						+ ", published=" + published 
					+ "]";
	}

}
