package com.ejercicio1.semilla.Turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ejercicio1.semilla.Turnos.dto.ResponseDTO;
import com.ejercicio1.semilla.Turnos.dto.ServiciosDTO;

import com.ejercicio1.semilla.Turnos.entity.ServiciosEntity;
import com.ejercicio1.semilla.Turnos.mapper.IServiciosMapper;
import com.ejercicio1.semilla.Turnos.repository.IServiciosRepository;

@Service
public class ServiciosService implements IServiciosService {
	
	@Autowired
	private IServiciosRepository serviciosRepository;
	
	@Autowired
	private IServiciosMapper mapperServicios;

	@Override
	public ResponseDTO getAll() {
		// TODO Auto-generated method stub
		List<ServiciosEntity> servicioEntity =serviciosRepository.findAll();
		return new ResponseDTO(mapperServicios.listEntityToDto(servicioEntity),true, "ok", HttpStatus.OK);
	}
	

	@Override
	public ResponseDTO getServiciosById_servicio(Integer id_servicio) {
		// TODO Auto-generated method stub
		Optional<ServiciosEntity> optional = serviciosRepository.findById(id_servicio);
		
		if(optional.isPresent()) {
			return	new ResponseDTO(mapperServicios.entityToDto(optional.get()), true, "ok", HttpStatus.OK);
		}else {
			return null;
		}
	}

	@Override
	public ResponseDTO createServicios(ServiciosDTO serviciosDTO) {
		// TODO Auto-generated method stub
		
		try {
			ServiciosEntity serviciosEntity = mapperServicios.dtoToentity(serviciosDTO);
			return new ResponseDTO(mapperServicios.entityToDto(serviciosRepository.save(serviciosEntity)), true, "ok", HttpStatus.OK);
		}catch (Exception e){
			return new ResponseDTO(null, false, "No se pudo crear el Servicio", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO updateServicios(ServiciosDTO serviciosDTO) {
		// TODO Auto-generated method stub
		
		try {
			ServiciosEntity serviciosEntity = mapperServicios.dtoToentity(serviciosDTO);
			
			return new ResponseDTO(mapperServicios.entityToDto(serviciosRepository.save(serviciosEntity)), true, "ok", HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseDTO(null, false, "No se pudo editar el Servicio", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO deleteServicios(Integer id_servicio) {
		// TODO Auto-generated method stub
		
		try {
			serviciosRepository.deleteById(id_servicio);
			return new ResponseDTO(null,true, "Servicio Eliminado",HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseDTO(null,false, "El Servicio no se puede Eliminar",HttpStatus.OK);
		}
	}
	
	@Override
	public ResponseDTO buscarPorId_servicio(Integer id_servicio) {
		// TODO Auto-generated method stub
		
		try {
			Optional<ServiciosEntity> servicioEntity = serviciosRepository.findById(id_servicio);
			servicioEntity.get();
			return new ResponseDTO(mapperServicios.entityToDto(servicioEntity.get()), true, "ok", HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseDTO(null, false, "No se encontro el Comercio", HttpStatus.OK);
			
		}
		
	}




}
