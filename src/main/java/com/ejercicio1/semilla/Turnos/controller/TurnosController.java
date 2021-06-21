package com.ejercicio1.semilla.Turnos.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio1.semilla.Turnos.dto.ResponseDTO;
import com.ejercicio1.semilla.Turnos.service.ITurnosService;

@RestController
@RequestMapping(path = "/api/v1/turnos")
public class TurnosController {
	
	@Autowired
	private ITurnosService turnosService;
	
	
	///listar todos
	@GetMapping(path = "/all")
	public ResponseDTO getAll(){
		
		return turnosService.getAll();
	}
	
	@GetMapping(path="/turnos/{id_turno}")
	public ResponseDTO buscarPorId_turno(@PathVariable Integer id_turno) {
		
		return turnosService.buscarPorId_turno(id_turno);
	}
	
	@GetMapping(path = "/parametro")
	public ResponseDTO getTurnoParametroById(@RequestParam Integer id_turno) {
		return turnosService.getTurnosById_turnos(id_turno);
	}
	
	//buscar por id
	@GetMapping(path = "/{id_turno}")
	public ResponseDTO buscarPorId(@PathVariable Integer id_turno){
		return turnosService.buscarPorId_turno(id_turno);
	}
	
	
	//consultar turnos por id_de_servicio
	@GetMapping(path="/todos/{identificadorServicio}")
	public ResponseDTO buscarTodosPorIdentificadorServicio(@PathVariable Integer identificadorServicio) {
		
		return turnosService.buscarTodosPorIdentificadorServicio(identificadorServicio);
	
	}
	
	//consultar turnos por nom_de_servicio
	@GetMapping(path="/servicio")
	public ResponseDTO buscarTodosPorNomServicio(@RequestParam String nombreServicio) {
		
		return turnosService.buscarTodosPorNomServicio(nombreServicio);
	
	}
	
}
