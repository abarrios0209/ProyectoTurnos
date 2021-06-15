package com.ejercicio1.semilla.Turnos.service;

import java.util.List;

import com.ejercicio1.semilla.Turnos.dto.ComerciosDTO;
import com.ejercicio1.semilla.Turnos.dto.ResponseDTO;
import com.ejercicio1.semilla.Turnos.entity.ComerciosEntity;

public interface IComerciosService {
	
	
	public List<ComerciosEntity> getAll();
	
	public ResponseDTO getComercioById_comercio(Integer id_comercio);
	
	public ResponseDTO createComercio(ComerciosEntity comerciosEntity);
	
	public ResponseDTO updateComercio(ComerciosEntity comerciosEntity);
	
	public ResponseDTO deleteComercio(Integer id_comercio);
	
	public ComerciosDTO buscarPorId_comercio(Integer id_comercio);

}
