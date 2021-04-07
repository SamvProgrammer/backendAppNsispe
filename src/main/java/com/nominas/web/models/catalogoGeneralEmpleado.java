package com.nominas.web.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="maestro")
public class catalogoGeneralEmpleado {


	@Id                                                 
	@Column(name="id_emplea")                           
	@GeneratedValue(strategy = GenerationType.AUTO)     	
	

	private Long id;
	private String jpp;
	private Integer num;
	private String rfc;
	private String nombre;
	private String categ;
	private String curp;
	private String proyecto;
	private String sexo;
	private String cvecat;
	private String nivel;
	private String oficina;
	private String depto;
	private String domicilio;
    private String telefono;
    private String imss;
    private String sangre;
    private String avisar;
    private String avitel;
    private String ubic;
	private Date fchingpen;
	private Date fchinggob;
	private Date fchingnom;
	private String rellab;
	private String empleado;
	private Integer numquin;
	private  String pint;
	 private Boolean espmadre;
	 private Boolean esputil;
	 private String nombrepea;
	 private String notas;
	 private Integer hijos;
	 private Integer nivest;
	 private Integer gdoest;
	 private Integer status;
	 private Date aguifdes;
	 private Date aguifhas;
	 private Date dafdes;
	 private Date dafhas;
	 private Integer profesion;
	 private Double bgimss;
	 private Double roge;
	 private String statpago;
	 private Date licedes;
	 private Date licehas;
	 private Date gufdes;
	 private Date gufhas;
	 private Date  infdes;
	 public Date getInfhas() {
		return infhas;
	}
	public void setInfhas(Date infhas) {
		this.infhas = infhas;
	}
	private Date  infhas;

	 private Double  mot;
	 private Double uimss;
	 private Double uoimss;
	 private Double infcu;
	 private Double fonpen;
	 private String nombanco;
	 private String numcuenta;
	 private String clave_inte;
	 private Date fpuesto;
	 private String esppadre;
	 private String indisindi;
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
		this.jpp = jpp;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc.toUpperCase();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre.toUpperCase();
	}
	public String getCateg() {
		return categ;
	}
	public void setCateg(String categ) {
		this.categ = categ;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp.toUpperCase();
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCvecat() {
		return cvecat;
	}
	public void setCvecat(String cvecat) {
		this.cvecat = cvecat;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getOficina() {
		return oficina;
	}
	public void setOficina(String oficina) {
		this.oficina = oficina;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio.toUpperCase();
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getImss() {
		return imss;
	}
	public void setImss(String imss) {
		this.imss = imss;
	}
	public String getSangre() {
		return sangre;
	}
	public void setSangre(String sangre) {
		this.sangre = sangre;
	}
	public String getAvisar() {
		return avisar;
	}
	public void setAvisar(String avisar) {
		this.avisar = avisar.toUpperCase();
	}
	public String getAvitel() {
		return avitel;
	}
	public void setAvitel(String avitel) {
		this.avitel = avitel;
	}
	public String getUbic() {
		return ubic;
	}
	public void setUbic(String ubic) {
		this.ubic = ubic;
	}
	public Date getFchingpen() {
		return fchingpen;
	}
	public void setFchingpen(Date fchingpen) {
		this.fchingpen = fchingpen;
	}
	public Date getFchinggob() {
		return fchinggob;
	}
	public void setFchinggob(Date fchinggob) {
		this.fchinggob = fchinggob;
	}
	public Date getFchingnom() {
		return fchingnom;
	}
	public void setFchingnom(Date fchingnom) {
		this.fchingnom = fchingnom;
	}
	public String getRellab() {
		return rellab;
	}
	public void setRellab(String rellab) {
		this.rellab = rellab;
	}
	public String getEmpleado() {
		return empleado;
	}
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	public Integer getNumquin() {
		return numquin;
	}
	public void setNumquin(Integer numquin) {
		this.numquin = numquin;
	}
	public String getPint() {
		return pint;
	}
	public void setPint(String pint) {
		this.pint = pint;
	}
	public Boolean getEspmadre() {
		return espmadre;
	}
	public void setEspmadre(Boolean espmadre) {
		this.espmadre = espmadre;
	}
	public Boolean getEsputil() {
		return esputil;
	}
	public void setEsputil(Boolean esputil) {
		this.esputil = esputil;
	}
	public String getNombrepea() {
		return nombrepea;
	}
	public void setNombrepea(String nombrepea) {
		this.nombrepea = nombrepea;
	}
	public String getNotas() {
		return notas;
	}
	public void setNotas(String notas) {
		this.notas = notas;
	}
	public Integer getHijos() {
		return hijos;
	}
	public void setHijos(Integer hijos) {
		this.hijos = hijos;
	}
	public Integer getNivest() {
		return nivest;
	}
	public void setNivest(Integer nivest) {
		this.nivest = nivest;
	}
	public Integer getGdoest() {
		return gdoest;
	}
	public void setGdoest(Integer gdoest) {
		this.gdoest = gdoest;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getAguifdes() {
		return aguifdes;
	}
	public void setAguifdes(Date aguifdes) {
		this.aguifdes = aguifdes;
	}
	public Date getAguifhas() {
		return aguifhas;
	}
	public void setAguifhas(Date aguifhas) {
		this.aguifhas = aguifhas;
	}
	public Date getDafdes() {
		return dafdes;
	}
	public void setDafdes(Date dafdes) {
		this.dafdes = dafdes;
	}
	public Date getDafhas() {
		return dafhas;
	}
	public void setDafhas(Date dafhas) {
		this.dafhas = dafhas;
	}
	public Integer getProfesion() {
		return profesion;
	}
	public void setProfesion(Integer profesion) {
		this.profesion = profesion;
	}
	public Double getBgimss() {
		return bgimss;
	}
	public void setBgimss(Double bgimss) {
		this.bgimss = bgimss;
	}
	public Double getRoge() {
		return roge;
	}
	public void setRoge(Double roge) {
		this.roge = roge;
	}
	public String getStatpago() {
		return statpago;
	}
	public void setStatpago(String statpago) {
		this.statpago = statpago;
	}
	public Date getLicedes() {
		return licedes;
	}
	public void setLicedes(Date licedes) {
		this.licedes = licedes;
	}
	public Date getLicehas() {
		return licehas;
	}
	public void setLicehas(Date licehas) {
		this.licehas = licehas;
	}
	public Date getGufdes() {
		return gufdes;
	}
	public void setGufdes(Date gufdes) {
		this.gufdes = gufdes;
	}
	public Date getGufhas() {
		return gufhas;
	}
	public void setGufhas(Date gufhas) {
		this.gufhas = gufhas;
	}
	public Date getInfdes() {
		return infdes;
	}
	public void setInfdes(Date infdes) {
		this.infdes = infdes;
	}
	public Double getMot() {
		return mot;
	}
	public void setMot(Double mot) {
		this.mot = mot;
	}
	public Double getUimss() {
		return uimss;
	}
	public void setUimss(Double uimss) {
		this.uimss = uimss;
	}
	public Double getUoimss() {
		return uoimss;
	}
	public void setUoimss(Double uoimss) {
		this.uoimss = uoimss;
	}
	public Double getInfcu() {
		return infcu;
	}
	public void setInfcu(Double infcu) {
		this.infcu = infcu;
	}
	public Double getFonpen() {
		return fonpen;
	}
	public void setFonpen(Double fonpen) {
		this.fonpen = fonpen;
	}
	public String getNombanco() {
		return nombanco;
	}
	public void setNombanco(String nombanco) {
		this.nombanco = nombanco;
	}
	public String getNumcuenta() {
		return numcuenta;
	}
	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}
	public String getClave_inte() {
		return clave_inte;
	}
	public void setClave_inte(String clave_inte) {
		this.clave_inte = clave_inte;
	}
	public Date getFpuesto() {
		return fpuesto;
	}
	public void setFpuesto(Date fpuesto) {
		this.fpuesto = fpuesto;
	}
	
	public String getIndisindi() {
		return indisindi;
	}
	public void setIndisindi(String indisindi) {
		this.indisindi = indisindi;
	}
	public String getEsppadre() {
		return esppadre;
	}
	public void setEsppadre(String esppadre) {
		this.esppadre = esppadre;
	}
	 
	 

}