package com.ejercicio1.semilla.Turnos.dto;



import java.util.List;



import lombok.Data;

@Data
public class ComerciosDTO {


	private Integer identificadorComercio;
	

	private String nombreComercio;
	

	private String aforoMaximo;

	
	private List<ServiciosDTO> servicios;

	
	
}
