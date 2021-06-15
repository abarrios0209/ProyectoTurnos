package com.ejercicio1.semilla.Turnos.dto;

import java.util.Date;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
public class ServiciosDTO {

	

	private Integer identificador_servicio;
	

	private Integer id_comercio;
	

	private String nombre_servicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="HH:mm:ss",timezone = "America/New_York") 
	private Date hr_apertura;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="HH:mm:ss",timezone = "America/New_York") 
	private Date hora_cierre;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="HH:mm:ss",timezone = "America/New_York") 
	private Date duracion;
	

	private List<TurnosDTO> turnos;
	
	
}
