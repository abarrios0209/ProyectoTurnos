package com.ejercicio1.semilla.Turnos.dto;

import java.util.Date;
import java.util.List;



import com.ejercicio1.semilla.Turnos.entity.TurnosEntity;

import lombok.Data;
@Data
public class ServiciosDTO {

	

	private Integer identificador_servicio;
	

	private Integer id_comercio;
	

	private String nombre_servicio;
	

	private Date hr_apertura;
	

	private Date hora_cierre;
	

	private Date duracion;
	

	private List<TurnosEntity> turnos;
	
	
}
