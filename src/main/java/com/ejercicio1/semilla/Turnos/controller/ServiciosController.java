package com.ejercicio1.semilla.Turnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.ejercicio1.semilla.Turnos.entity.ServiciosEntity;
import com.ejercicio1.semilla.Turnos.service.IServiciosService;

@RestController
@RequestMapping(path = "/api/v1/servicios")
public class ServiciosController {
	
	@Autowired
	private IServiciosService serviciosService;
	
	///listar todos
	@GetMapping(path = "/all")
	public List<ServiciosEntity> getAll(){
		return serviciosService.getAll();
	}
	
	///Listar uno
	
	@GetMapping(path="/servicios/{id_servicio}")
	public ServiciosEntity getServiciosById_servicio(@PathVariable Integer id_servicio) {
		
		return serviciosService.getServiciosById_servicio(id_servicio);
	}

	@GetMapping(path="/servicios")
	public ServiciosEntity getParameterServiciosById_servicio(@RequestParam Integer id_servicio) {
		
		return serviciosService.getServiciosById_servicio(id_servicio);
	}
	
	
	// crear
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ServiciosEntity createServicio(@RequestBody ServiciosEntity entity) {
		
		return serviciosService.createServicios(entity); 
				
	}
	
	//editar
	@PostMapping(path="/editar", consumes = "application/json", produces = "application/json")
	public ServiciosEntity editarComercio(@RequestBody ServiciosEntity entity) {
		
		return serviciosService.updateServicios(entity);
	}
	//delete 
	
	@GetMapping(path = "/eliminar/{id_servicio}")
	public void deleteServicios(@PathVariable Integer id_servicio) {
		// TODO Auto-generated method stub
		
		serviciosService.deleteServicios(id_servicio);
		
	}
	
	

}