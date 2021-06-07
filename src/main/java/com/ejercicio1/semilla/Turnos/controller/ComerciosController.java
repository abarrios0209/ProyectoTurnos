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

import com.ejercicio1.semilla.Turnos.entity.ComerciosEntity;
import com.ejercicio1.semilla.Turnos.service.IComerciosService;

@RestController
@RequestMapping(path = "/api/v1/comercios")
public class ComerciosController {
	
	@Autowired
	private IComerciosService comerciosService;
	
	///listar todos
	@GetMapping(path = "/all")
	public List<ComerciosEntity> getAll() {
		
		return comerciosService.getAll();
	}
	
	
	///Listar uno
	
	@GetMapping(path="/comercios/{id_comercio}")
	public ComerciosEntity getComercioById_comercio(@PathVariable Integer id_comercio) {
		
		return comerciosService.getComercioById_comercio(id_comercio);
	}

	@GetMapping(path="/comercios")
	public ComerciosEntity getParameterComercioById_comercio(@RequestParam Integer id_comercio) {
		
		return comerciosService.getComercioById_comercio(id_comercio);
	}
	
	
	// crear
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ComerciosEntity createComercio(@RequestBody ComerciosEntity entity) {
		
		return comerciosService.createComercio(entity); 
				
	}
	
	//editar
	@PostMapping(path="/editar", consumes = "application/json", produces = "application/json")
	public ComerciosEntity editarComercio(@RequestBody ComerciosEntity entity) {
		
		return comerciosService.updateComercio(entity);
	}
	//delete 
	
	@GetMapping(path = "/eliminar/{id_comercio}")
	public void deleteComercio(@PathVariable Integer id_comercio) {
		// TODO Auto-generated method stub
		
		comerciosService.deleteComercio(id_comercio);
		
	}
	
	

	
	
}