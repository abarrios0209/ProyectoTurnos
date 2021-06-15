package com.ejercicio1.semilla.Turnos.dto;



import java.util.List;


import com.ejercicio1.semilla.Turnos.entity.ServiciosEntity;

import lombok.Data;

@Data
public class ComerciosDTO {


	private Integer identificador_comercio;
	

	private String nombre_comercio;
	

	private String aforo_maximo;

	
	private List<ServiciosEntity> servicios;

	
	
}
