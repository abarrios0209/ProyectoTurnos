package com.ejercicio1.semilla.Turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio1.semilla.Turnos.dto.TurnosDTO;
import com.ejercicio1.semilla.Turnos.entity.TurnosEntity;
import com.ejercicio1.semilla.Turnos.mapper.ITurnosMapper;
import com.ejercicio1.semilla.Turnos.repository.ITurnosRepository;

@Service
public class TurnosService implements ITurnosService {

	@Autowired
	private ITurnosRepository turnosRepository;
	
	@Autowired
	private ITurnosMapper mapperTurnos;
	
	
	@Override
	public List<TurnosEntity> getAll() {
		// TODO Auto-generated method stub
		return turnosRepository.findAll();
	}

	@Override
	public TurnosDTO getTurnosById_turnos(Integer id_turno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TurnosDTO createTurnos(TurnosDTO turnosDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TurnosDTO updateTurnos(TurnosDTO turnosDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTurnos(Integer id_turno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TurnosDTO buscarPorId_turno(Integer id_turno) {
		// TODO Auto-generated method stub
		
		Optional<TurnosEntity> turnosEntity = turnosRepository.findById(id_turno);
		
		return mapperTurnos.entityToDto(turnosEntity.get());
	}

	
	
}
