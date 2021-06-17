package com.ejercicio1.semilla.Turnos.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
@Data
@Entity
@Table(name = "servicios")
public class ServiciosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_servicio")
	private Integer idServicio;
	
	@Column(name = "id_comercio")
	private Integer idComercio;
	
	@Column(name = "nom_servicio")
	private String nomServicio;
	
	@Column(name = "hora_apertura")
	@Temporal(TemporalType.TIME)
	private Date horaApertura;
	
	@Column(name = "hora_cierre")
	@Temporal(TemporalType.TIME)
	private Date horaCierre;
	
	@Column(name = "duracion")
	@Temporal(TemporalType.TIME)
	private Date duracion;
	
	
	@OneToMany(mappedBy = "idServicio")
	private List<TurnosEntity> turnos;
	

}
