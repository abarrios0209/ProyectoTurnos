package com.ejercicio1.semilla.Turnos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio1.semilla.Turnos.entity.TurnosEntity;
import com.ejercicio1.semilla.Turnos.repository.ITurnosRepository;

@Service
public class TurnosService implements ITurnosService {

	@Autowired
	private ITurnosRepository turnosRepository;
	
	
	@Override
	public List<TurnosEntity> getAll() {
		// TODO Auto-generated method stub
		return turnosRepository.findAll();
	}

	@Override
	public TurnosEntity getTurnosById_turnos(Integer id_turno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TurnosEntity createTurnos(TurnosEntity turnosEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TurnosEntity updateTurnos(TurnosEntity turnosEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTurnos(Integer id_turno) {
		// TODO Auto-generated method stub
		
	}

	
	
}
