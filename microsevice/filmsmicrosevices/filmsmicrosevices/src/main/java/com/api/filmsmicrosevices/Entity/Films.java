package com.api.filmsmicrosevices.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Films {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private Long releaseDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Films(Long id, String title, Long releaseDate) {
		super();
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
	}
	public Films() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Films [id=" + id + ", title=" + title + ", releaseDate=" + releaseDate + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Long releaseDate) {
		this.releaseDate = releaseDate;
	}

}
