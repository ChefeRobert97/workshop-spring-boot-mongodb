package com.educandoweb.workshopmongo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

import com.educandoweb.workshopmongo.dto.AuthorDTO;

@Document
public class Post implements Serializable{
	private static final long serialVersionUID = 1L;

	
	private String id;
	private Date date;
	private String title;
	private String body;
	private AuthorDTO author;
	
	public Post() {

	}

	public Post(String id, Date date, String title, String body, AuthorDTO user) {
		super();
		this.id = id;
		this.date = date;
		this.title = title;
		this.body = body;
		this.author = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public AuthorDTO getUser() {
		return author;
	}

	public void setUser(AuthorDTO user) {
		this.author = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(id, other.id);
	}
}
