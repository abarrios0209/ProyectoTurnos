package com.ejercicio1.semilla.Turnos.service;

import java.util.List;
import java.util.Optional;

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
	
	@Autowired
	private IComerciosRepository comerciosRepository;
	
	@Autowired
	private IComerciosMapper mapperComercios;

	@Override
	public List<ComerciosEntity> getAll() {
		// TODO Auto-generated method stub
		return comerciosRepository.findAll();
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
	public ResponseDTO createComercio(ComerciosEntity comerciosEntity) {
		// TODO Auto-generated method stub
		
		
		try {
			
			comerciosRepository.save(comerciosEntity);
			
			return new ResponseDTO(comerciosEntity,true,"El comercio se creo correctamente",HttpStatus.OK);
		}catch (Exception e){
			return new ResponseDTO(null,false,"No se puede crear el comercio",HttpStatus.OK);
		}
		
	}

	@Override
	public ResponseDTO updateComercio(ComerciosEntity comerciosEntity) {
		// TODO Auto-generated method stub
		
		try {
			
			comerciosRepository.save(comerciosEntity);
			
			return new ResponseDTO(comerciosEntity,true,"ok",HttpStatus.OK);
		}catch (Exception e){
			return new ResponseDTO(null,true,"No se puede cargar el comercio",HttpStatus.OK);
		}
		
	}

	@Override
	public ResponseDTO deleteComercio(Integer id_comercio) {
		// TODO Auto-generated method stub
		
		try {
			comerciosRepository.deleteById(id_comercio);
			return new ResponseDTO(null,true,"Usuario eliminado",HttpStatus.OK);
		}catch (Exception e){
			return new ResponseDTO(null,false,"Usuario no se puede eliminar",HttpStatus.OK);
		}
		
		
		
	}

	@Override
	public ComerciosDTO buscarPorId_comercio(Integer id_comercio) {
		// TODO Auto-generated method stub
		
		Optional<ComerciosEntity> comerciosEntity = comerciosRepository.findById(id_comercio);
		
		
		return mapperComercios.entityToDto(comerciosEntity.get());
	}

}
