package com.nominas.web.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="tipo_empleados")

public class CatalogoTipoEmpleados {
	@Id
	@Column(name="id_tipoEm")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer clave;
	private String categoria;
	private String cve_nivel;
	private Integer numnivel;
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
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCve_nivel() {
		return cve_nivel;
	}
	public void setCve_nivel(String cve_nivel) {
		this.cve_nivel = cve_nivel;
	}
	public Integer getNumnivel() {
		return numnivel;
	}
	public void setNumnivel(Integer numnivel) {
		this.numnivel = numnivel;
	}


}
