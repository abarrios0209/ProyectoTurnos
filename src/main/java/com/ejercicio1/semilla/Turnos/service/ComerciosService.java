package com.ejercicio1.semilla.Turnos.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ejercicio1.semilla.Turnos.dto.ComerciosDTO;
import com.ejercicio1.semilla.Turnos.dto.ResponseDTO;
import com.ejercicio1.semilla.Turnos.entity.ComerciosEntity;
import com.ejercicio1.semilla.Turnos.mapper.IComerciosMapper;
import com.ejercicio1.semilla.Turnos.repository.IComerciosRepository;

@Service
public class ComerciosService implements IComerciosService {
	
	private static final Logger logger = LoggerFactory.getLogger(ComerciosService.class);
	
	@Autowired
	private IComerciosRepository comerciosRepository;
	
	@Autowired
	private IComerciosMapper mapperComercios;

	@Override
	public ResponseDTO getAll() {
		// TODO Auto-generated method stub
		List<ComerciosEntity> comercioEntity = comerciosRepository.findAll();
		
		return new ResponseDTO(mapperComercios.listEntityToDto(comercioEntity),true,"ok",HttpStatus.OK);
		
	}

	public IComerciosRepository getComerciosRepository() {
		return comerciosRepository;
	}

	public void setComerciosRepository(IComerciosRepository comerciosRepository) {
		this.comerciosRepository = comerciosRepository;
	}

	@Override
	public ResponseDTO getComercioById_comercio(Integer id_comercio) {
		// TODO Auto-generated method stub
		
		Optional<ComerciosEntity> optional = comerciosRepository.findById(id_comercio);
		
		if (optional.isPresent()) {
			return new ResponseDTO(optional.get(), true, "ok", HttpStatus.OK);
		}else {
			return new ResponseDTO(null, false, "No se encontro este comercio", HttpStatus.OK);
		}
		
		
		
	}

	@Override
	public ResponseDTO createComercio(ComerciosDTO comerciosDTO) {
		// TODO Auto-generated method stub
		
		
		try {
			
			ComerciosEntity comerciosEntity = mapperComercios.dtoToEntity(comerciosDTO);
			
			return new ResponseDTO(mapperComercios.entityToDto(comerciosRepository.save(comerciosEntity)), true, "ok", HttpStatus.OK);
			
		}catch (Exception e){
			return new ResponseDTO(null,false,"No se puede crear el comercio",HttpStatus.OK);
		}
		
	}

	@Override
	public ResponseDTO updateComercio(ComerciosDTO comerciosDTO) {
		// TODO Auto-generated method stub
		
		try {
			ComerciosEntity comerciosEntity = mapperComercios.dtoToEntity(comerciosDTO);
			
			return new ResponseDTO(mapperComercios.entityToDto(comerciosRepository.save(comerciosEntity)), true, "ok", HttpStatus.OK);
			
		}catch (Exception e){
			return new ResponseDTO(null,true,"No se puede cargar el comercio",HttpStatus.OK);
		}
		
	}

	@Override
	public ResponseDTO deleteComercio(Integer id_comercio) {
		// TODO Auto-generated method stub
		
		logger.info("Ingreso al metodo deleteComercio");
		
		
		try {
			comerciosRepository.deleteById(id_comercio);
			
			logger.info("El usuario {} se elimino",id_comercio);
			
			return new ResponseDTO(null,true,"Usuario eliminado",HttpStatus.OK);
		}catch (Exception e){
			
			logger.error("Error {}",e.getMessage());
			
			return new ResponseDTO(null,false,"Usuario no se puede eliminar",HttpStatus.OK);
		}
		
		
		
	}

	@Override
	public ResponseDTO buscarPorId_comercio(Integer id_comercio) {
		// TODO Auto-generated method stub
		
		try {
			Optional<ComerciosEntity> comerciosEntity = comerciosRepository.findById(id_comercio);
			comerciosEntity.get();
			return new ResponseDTO( mapperComercios.entityToDto(comerciosEntity.get()), true, "ok", HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseDTO(null, false, "No se encontro el Comercio", HttpStatus.OK);
			
		}
	}

}
