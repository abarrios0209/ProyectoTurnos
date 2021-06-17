package com.ejercicio1.semilla.Turnos.dto;





import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.Data;

@Data
public class TurnosDTO {

	
	private Integer identificadorTurno;
	

	private Integer identificadorServicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING ,pattern ="yyyy/mm/dd")
	private Date fechaTurno;

	@JsonFormat(shape = JsonFormat.Shape.STRING ,pattern ="HH:mm:ss", timezone = "America/New_York")
	private Date horaInicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING ,pattern ="HH:mm:ss", timezone = "America/New_York")
	private Date horaFin;

	
	private String estado;
	
	
}
