package com.ejercicio1.semilla.Turnos.service;



import com.ejercicio1.semilla.Turnos.dto.ComerciosDTO;
import com.ejercicio1.semilla.Turnos.dto.ResponseDTO;


public interface IComerciosService {
	
	
	public ResponseDTO getAll();
	
	public ResponseDTO getComercioById_comercio(Integer id_comercio);
	
	public ResponseDTO createComercio(ComerciosDTO comerciosDTO);
	
	public ResponseDTO updateComercio(ComerciosDTO comerciosDTO);
	
	public ResponseDTO deleteComercio(Integer id_comercio);
	
	public ResponseDTO buscarPorId_comercio(Integer id_comercio);

}
