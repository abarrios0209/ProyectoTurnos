package com.ejercicio1.semilla.Turnos.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "comercios")
public class ComerciosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_comercio")
	private Integer idComercio;
	
	@Column(name = "nom_comercio")
	private String nomComercio;
	
	@Column(name = "aforo_maximo")
	private String aforoMaximo;

	@OneToMany(mappedBy = "idComercio")
	private List<ServiciosEntity> servicios;

}
