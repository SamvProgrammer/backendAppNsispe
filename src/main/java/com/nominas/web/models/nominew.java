package com.nominas.web.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

@Entity
@Table(name="nominew")
public class nominew {
	@Id
	@Column(name="id_mov")
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
    private String jpp;
    private Integer numjpp;
    private Integer clave;
    private Integer secuen;
    private String descri;
    private Double monto;
    private String tipopago;
    private Integer folio;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getJpp() {
		return jpp;
	}
	public void setJpp(String jpp) {
		this.jpp = jpp.toUpperCase();
	}
	public Integer getNumjpp() {
		return numjpp;
	}
	public void setNumjpp(Integer numjpp) {
		this.numjpp = numjpp;
	}
	public Integer getClave() {
		return clave;
	}
	public void setClave(Integer clave) {
		this.clave = clave;
	}
	public Integer getSecuen() {
		return secuen;
	}
	public void setSecuen(Integer secuen) {
		this.secuen = secuen;
	}
	public String getDescri() {
		return descri;
	}
	public void setDescri(String descri) {
		this.descri = descri.toUpperCase();
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public String getTipopago() {
		return tipopago;
	}
	public void setTipopago(String tipopago) {
		this.tipopago = tipopago;
	}
	public Integer getFolio() {
		return folio;
	}
	public void setFolio(Integer folio) {
		this.folio = folio;
	}

    
    
}
