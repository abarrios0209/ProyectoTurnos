package com.ejercicio1.semilla.Turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio1.semilla.Turnos.entity.ComerciosEntity;
import com.ejercicio1.semilla.Turnos.repository.IComerciosRepository;

@Service
public class ComerciosService implements IComerciosService {
	
	@Autowired
	private IComerciosRepository comerciosRepository;

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
	public ComerciosEntity getComercioById_comercio(Integer id_comercio) {
		// TODO Auto-generated method stub
		
		Optional<ComerciosEntity> optional = comerciosRepository.findById(id_comercio);
		
		if (optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
		
		
		
	}

	@Override
	public ComerciosEntity createComercio(ComerciosEntity comerciosEntity) {
		// TODO Auto-generated method stub
		try {
			return comerciosRepository.save(comerciosEntity);
		}catch (Exception e){
			return null;
		}
		
	}

	@Override
	public ComerciosEntity updateComercio(ComerciosEntity comerciosEntity) {
		// TODO Auto-generated method stub
		return comerciosRepository.save(comerciosEntity);
	}

	@Override
	public void deleteComercio(Integer id_comercio) {
		// TODO Auto-generated method stub
		
		comerciosRepository.deleteById(id_comercio);
	}

}
