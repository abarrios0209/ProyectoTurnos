package com.ejercicio1.semilla.Turnos.service;

import java.util.List;

import com.ejercicio1.semilla.Turnos.dto.TurnosDTO;
import com.ejercicio1.semilla.Turnos.entity.TurnosEntity;

public interface ITurnosService {
	
	public List<TurnosEntity> getAll();
	
	public TurnosDTO getTurnosById_turnos(Integer id_turno);
	
	public TurnosDTO createTurnos(TurnosDTO turnosDTO);

	public TurnosDTO updateTurnos(TurnosDTO turnosDTO);
	
	public void deleteTurnos(Integer id_turno);

	public TurnosDTO buscarPorId_turno(Integer id_turno);
}
