package com.ejercicio1.semilla.Turnos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio1.semilla.Turnos.dto.ResponseDTO;
import com.ejercicio1.semilla.Turnos.dto.ServiciosDTO;
import com.ejercicio1.semilla.Turnos.service.IServiciosService;

@RestController
@RequestMapping(path = "/api/v1/servicios")
public class ServiciosController {
	
	@Autowired
	private IServiciosService serviciosService;
	
	///listar todos
	@GetMapping(path = "/all")
	public ResponseDTO getAll(){
		return serviciosService.getAll();
	}
	
	///Listar uno
	
	@GetMapping(path="/servicios/{id_servicio}")
	public ResponseDTO getServiciosById_servicio(@PathVariable Integer id_servicio) {
		
		return serviciosService.getServiciosById_servicio(id_servicio);
	}

	@GetMapping(path="/servicios")
	public ResponseDTO getParameterServiciosById_servicio(@RequestParam Integer id_servicio) {
		
		return serviciosService.getServiciosById_servicio(id_servicio);
	}
	
	
	// crear
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ResponseDTO createServicio(@RequestBody ServiciosDTO dto) {
		
		return serviciosService.createServicios(dto); 
				
	}
	
	//editar
	@PostMapping(path="/editar", consumes = "application/json", produces = "application/json")
	public ResponseDTO editarComercio(@RequestBody ServiciosDTO dto) {
		
		return serviciosService.updateServicios(dto);
	}
	//delete 
	
	@GetMapping(path = "/eliminar/{id_servicio}")
	public ResponseDTO deleteServicios(@PathVariable Integer id_servicio) {
		// TODO Auto-generated method stub
		
		return serviciosService.deleteServicios(id_servicio);
		
	}
	
	@GetMapping(path="/{id_servicio}")
	public ResponseDTO buscarPorId_servicio(@PathVariable Integer id_servicio) {
		
		return serviciosService.buscarPorId_servicio(id_servicio);
	}
	

}
