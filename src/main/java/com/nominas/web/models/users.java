package com.nominas.web.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "usuarios")
public class users {
	
	@Id
	@Column(name= "idUser")
	@GeneratedValue(strategy = GenerationType.AUTO)
 
	
	private Long id;
	private String usuario;
	private String password;
	private boolean supeadmin;
	private boolean status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isSupeadmin() {
		return supeadmin;
	}
	public void setSupeadmin(boolean supeadmin) {
		this.supeadmin = supeadmin;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
	
	
	