package com.ejercicio1.semilla.Turnos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "servicios")
public class ServiciosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_servicio")
	private Integer id_servicio;
	
	@Column(name = "id_comercio")
	private Integer id_comercio;
	
	@Column(name = "nom_servicio")
	private String nom_servicio;
	
	@Column(name = "hora_apertura")
	private String hora_apertura;
	
	@Column(name = "hora_cierre")
	private String hora_cierre;
	
	@Column(name = "duracion")
	private String duracion;

	public Integer getId_servicio() {
		return id_servicio;
	}

	public void setId_servicio(Integer id_servicio) {
		this.id_servicio = id_servicio;
	}

	public Integer getId_comercio() {
		return id_comercio;
	}

	public void setId_comercio(Integer id_comercio) {
		this.id_comercio = id_comercio;
	}

	public String getNom_servicio() {
		return nom_servicio;
	}

	public void setNom_servicio(String nom_servicio) {
		this.nom_servicio = nom_servicio;
	}

	public String getHora_apertura() {
		return hora_apertura;
	}

	public void setHora_apertura(String hora_apertura) {
		this.hora_apertura = hora_apertura;
	}

	public String getHora_cierre() {
		return hora_cierre;
	}

	public void setHora_cierre(String hora_cierre) {
		this.hora_cierre = hora_cierre;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	} 


	

}
