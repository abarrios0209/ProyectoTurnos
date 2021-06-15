package com.ejercicio1.semilla.Turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
	public List<ServiciosEntity> getAll() {
		// TODO Auto-generated method stub
		return serviciosRepository.findAll();
	}
	

	@Override
	public ServiciosDTO getServiciosById_servicio(Integer id_servicio) {
		// TODO Auto-generated method stub
		Optional<ServiciosEntity> optional= serviciosRepository.findById(id_servicio);
		
		if(optional.isPresent()) {
			return null;
		}else {
			return null;
		}
	}

	@Override
	public ServiciosDTO createServicios(ServiciosDTO serviciosDTO) {
		// TODO Auto-generated method stub
		
		ServiciosEntity serviciosEntity = mapperServicios.dtoToentity(serviciosDTO);
		
		try {
			return mapperServicios.entityToDto(serviciosRepository.save(serviciosEntity));
		}catch (Exception e){
			return null;
		}
	}

	@Override
	public ServiciosDTO updateServicios(ServiciosDTO serviciosDTO) {
		// TODO Auto-generated method stub
		
		ServiciosEntity serviciosEntity = mapperServicios.dtoToentity(serviciosDTO);
		
		return mapperServicios.entityToDto(serviciosRepository.save(serviciosEntity));
	}

	@Override
	public void deleteServicios(Integer id_servicio) {
		// TODO Auto-generated method stub
		
		serviciosRepository.deleteById(id_servicio);
		
	}
	
	@Override
	public ServiciosDTO buscarPorId_servicio(Integer id_servicio) {
		// TODO Auto-generated method stub
		
		Optional<ServiciosEntity> serviciosEntity = serviciosRepository.findById(id_servicio);
		
		
		return mapperServicios.entityToDto(serviciosEntity.get());
	}




}
