package com.ejercicio1.semilla.Turnos.service;



import com.ejercicio1.semilla.Turnos.dto.ResponseDTO;
import com.ejercicio1.semilla.Turnos.dto.TurnosDTO;


public interface ITurnosService {
	
	public ResponseDTO getAll();
	
	public ResponseDTO getTurnosById_turnos(Integer id_turno);
	
	public ResponseDTO createTurnos(TurnosDTO turnosDTO);

	public ResponseDTO updateTurnos(TurnosDTO turnosDTO);
	
	public ResponseDTO deleteTurnos(Integer id_turno);

	public ResponseDTO buscarPorId_turno(Integer id_turno);
	
	public ResponseDTO buscarTodosPorIdentificadorServicio(Integer identificadorServicio);
	
	public ResponseDTO buscarTodosPorNomServicio(String nombreServicio);
	
}
