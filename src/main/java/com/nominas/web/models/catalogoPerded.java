package com.nominas.web.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="perded" )


public class catalogoPerded {
	@Id
	@Column(name="id_perded")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer clave;
	private String descripcion;
	private String part_cve;
	private String partida;
	private boolean perded;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getClave() {
		return clave;
	}
	public void setClave(Integer clave) {
		this.clave = clave;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPart_cve() {
		return part_cve;
	}
	public void setPart_cve(String part_cve) {
		this.part_cve = part_cve;
	}
	public String getPartida() {
		return partida;
	}
	public void setPartida(String partida) {
		this.partida = partida;
	}
	public boolean isPerded() {
		return perded;
	}
	public void setPerded(boolean perded) {
		this.perded = perded;
	}
	
}
