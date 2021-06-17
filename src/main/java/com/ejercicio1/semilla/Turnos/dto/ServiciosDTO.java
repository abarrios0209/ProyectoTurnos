package com.ejercicio1.semilla.Turnos.dto;

import java.util.Date;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
public class ServiciosDTO {

	

	private Integer identificadorServicio;
	

	private Integer idComercio;
	

	private String nombreServicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="HH:mm:ss",timezone = "America/New_York") 
	private Date hrApertura;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="HH:mm:ss",timezone = "America/New_York") 
	private Date horaCierre;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="HH:mm:ss",timezone = "America/New_York") 
	private Date duracion;
	

	private List<TurnosDTO> turnos;
	
	
}
