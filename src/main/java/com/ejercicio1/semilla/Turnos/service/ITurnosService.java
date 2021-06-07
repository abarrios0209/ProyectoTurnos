package com.ejercicio1.semilla.Turnos.service;

import java.util.List;

import com.ejercicio1.semilla.Turnos.entity.TurnosEntity;

public interface ITurnosService {
	
	public List<TurnosEntity> getAll();
	
	public TurnosEntity getTurnosById_turnos(Integer id_turno);
	
	public TurnosEntity createTurnos(TurnosEntity turnosEntity);

	public TurnosEntity updateTurnos(TurnosEntity turnosEntity);
	
	public void deleteTurnos(Integer id_turno);
}
