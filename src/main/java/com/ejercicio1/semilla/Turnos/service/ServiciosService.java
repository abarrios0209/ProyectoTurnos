package com.ejercicio1.semilla.Turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio1.semilla.Turnos.entity.ServiciosEntity;
import com.ejercicio1.semilla.Turnos.repository.IServiciosRepository;

@Service
public class ServiciosService implements IServiciosService {
	
	@Autowired
	private IServiciosRepository serviciosRepository;

	@Override
	public List<ServiciosEntity> getAll() {
		// TODO Auto-generated method stub
		return serviciosRepository.findAll();
	}
	

	@Override
	public ServiciosEntity getServiciosById_servicio(Integer id_servicio) {
		// TODO Auto-generated method stub
		Optional<ServiciosEntity> optional= serviciosRepository.findById(id_servicio);
		
		if(optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
	}

	@Override
	public ServiciosEntity createServicios(ServiciosEntity serviciosEntity) {
		// TODO Auto-generated method stub
		try {
			return serviciosRepository.save(serviciosEntity);
		}catch (Exception e){
			return null;
		}
	}

	@Override
	public ServiciosEntity updateServicios(ServiciosEntity serviciosEntity) {
		// TODO Auto-generated method stub
		return serviciosRepository.save(serviciosEntity);
	}

	@Override
	public void deleteServicios(Integer id_servicio) {
		// TODO Auto-generated method stub
		
		serviciosRepository.deleteById(id_servicio);
		
	}
	



}
