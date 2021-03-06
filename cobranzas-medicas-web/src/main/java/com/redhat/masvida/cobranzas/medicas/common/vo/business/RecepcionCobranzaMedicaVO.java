package com.redhat.masvida.cobranzas.medicas.common.vo.business;

import java.io.Serializable;
import java.util.Date;

public class RecepcionCobranzaMedicaVO implements Serializable {

	private static final long serialVersionUID = -3450306769242381268L;

	private Integer folio;
	private Date fechaRecepcion;
	private Date fechaRegistro;
	private AgenciaVO agenciaRecepcion;
	private String observacion;

	public Integer getFolio() {
		return folio;
	}

	public void setFolio(Integer folio) {
		this.folio = folio;
	}

	public Date getFechaRecepcion() {
		return fechaRecepcion;
	}

	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public AgenciaVO getAgenciaRecepcion() {
		return agenciaRecepcion;
	}

	public void setAgenciaRecepcion(AgenciaVO agenciaRecepcion) {
		this.agenciaRecepcion = agenciaRecepcion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
