package com.ejercicio1.semilla.Turnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.ejercicio1.semilla.Turnos.dto.ResponseDTO;
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
	public ResponseDTO getAll() {
		// TODO Auto-generated method stub
		List<TurnosEntity> turnoEntity = turnosRepository.findAll();
		
		return new ResponseDTO(mapperTurnos.listEntityToDto(turnoEntity),true, "ok", HttpStatus.OK);
	}

	@Override
	public ResponseDTO getTurnosById_turnos(Integer id_turno) {
		Optional<TurnosEntity> optional= turnosRepository.findById(id_turno);
		if (optional.isPresent()) {
			return new ResponseDTO(optional.get(), true, "ok", HttpStatus.OK);
		}else {
			return new ResponseDTO(null, false, "No se encontro el Turno", HttpStatus.OK);
		}
	
	}

	@Override
	public ResponseDTO createTurnos(TurnosDTO turnosDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseDTO updateTurnos(TurnosDTO turnosDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseDTO deleteTurnos(Integer id_turno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseDTO buscarPorId_turno(Integer id_turno) {
		// TODO Auto-generated method stub
		
		try {
			Optional<TurnosEntity> turnoEntity = turnosRepository.findById(id_turno);
			turnoEntity.get();
			return new ResponseDTO(mapperTurnos.entityToDto(turnoEntity.get()), true, "ok", HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseDTO(null, false, "No se encontro el Turno", HttpStatus.OK);
			
		}
	}

	@Override
	public ResponseDTO buscarTodosPorIdentificadorServicio(Integer identificadorServicio) {
		// TODO Auto-generated method stub
		
		//List<TurnosDTO> listTurnosDTOs = mapperTurnos.listEntityToDto(turnosRepository.findByIdServicio(identificadorServicio));
		List<TurnosDTO> listTurnosDTOs = mapperTurnos.listEntityToDto(turnosRepository.queryIdServicio(identificadorServicio));
		
		
		
		return new ResponseDTO(listTurnosDTOs,true,"OK",HttpStatus.OK);
	}

	@Override
	public ResponseDTO buscarTodosPorNomServicio(String nombreServicio) {
		// TODO Auto-generated method stub
		
		/*List<TurnosDTO> listTurnosDTOs = mapperTurnos.listEntityToDto(turnosRepository.queryIdServicio(nombreServicio));*/
		List<TurnosDTO> listTurnosDTOs = turnosRepository.queryIdServicioDTO(nombreServicio);
		
		
		return new ResponseDTO(listTurnosDTOs, true,"ok",HttpStatus.OK);
	}

	
}
