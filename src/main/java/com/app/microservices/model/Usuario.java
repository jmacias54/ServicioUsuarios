package com.app.microservices.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigDecimal id;
	@Column(name = "name")
	private String name;
	@Column(name = "comments")
	private String comments;
	@Column(name = "birth_date")
	private String birthDate;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(BigDecimal id, String name, String comments, String birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.comments = comments;
		this.birthDate = birthDate;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", comments=" + comments + ", birthDate=" + birthDate + "]";
	}

}
