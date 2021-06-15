package com.ejercicio1.semilla.Turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio1.semilla.Turnos.dto.TurnosDTO;
import com.ejercicio1.semilla.Turnos.entity.TurnosEntity;
import com.ejercicio1.semilla.Turnos.service.ITurnosService;

@RestController
@RequestMapping(path = "/api/v1/turnos")
public class TurnosController {
	
	@Autowired
	private ITurnosService turnosService;
	
	
	///listar todos
	@GetMapping(path = "/all")
	public List<TurnosEntity> getAll(){
		
		return turnosService.getAll();
	}
	
	@GetMapping(path="/{id_turno}")
	public TurnosDTO buscarPorId_turno(@PathVariable Integer id_turno) {
		
		return turnosService.buscarPorId_turno(id_turno);
	}

}
