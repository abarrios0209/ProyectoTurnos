package com.ejercicio1.semilla.Turnos.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio1.semilla.Turnos.dto.ComerciosDTO;
import com.ejercicio1.semilla.Turnos.dto.ResponseDTO;
import com.ejercicio1.semilla.Turnos.service.IComerciosService;

@RestController
@RequestMapping(path = "/api/v1/comercios")
public class ComerciosController {
	
	private static final Logger logger = LoggerFactory.getLogger(ComerciosController.class);
	
	@Autowired
	private IComerciosService comerciosService;
	
	///listar todos
	@GetMapping(path = "/all")
	public ResponseDTO getAll() {
		
		return comerciosService.getAll();
	}
	
	
	///Listar uno
	
	@GetMapping(path="/comercios/{id_comercio}")
	public ResponseDTO getComercioById_comercio(@PathVariable Integer id_comercio) {
		
		return comerciosService.getComercioById_comercio(id_comercio);
	}

	@GetMapping(path="/comercios")
	public ResponseDTO getParameterComercioById_comercio(@RequestParam Integer id_comercio) {
		
		return comerciosService.getComercioById_comercio(id_comercio);
	}
	
	
	// crear
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ResponseDTO createComercio(@RequestBody ComerciosDTO dto) {
		
		return comerciosService.createComercio(dto); 
				
	}
	
	//editar
	@PostMapping(path="/editar", consumes = "application/json", produces = "application/json")
	public ResponseDTO editarComercio(@RequestBody ComerciosDTO dto) {
		
		return comerciosService.updateComercio(dto);
	}
	//delete 
	
	@GetMapping(path = "/eliminar/{id_comercio}")
	public ResponseDTO deleteComercio(@PathVariable Integer id_comercio) {
		// TODO Auto-generated method stub
		
		logger.info("Ingreso al metodo eliminar Comercio ");
		
		logger.info("Usuario a eliminar {}",id_comercio);
		
		return comerciosService.deleteComercio(id_comercio);
		
	}
	
	
	@GetMapping(path="/{id_comercio}")
	public ResponseDTO buscarPorId_comercio(@PathVariable Integer id_comercio) {
		
		return comerciosService.buscarPorId_comercio(id_comercio);
	}
	
	
	
}
