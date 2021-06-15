package com.ejercicio1.semilla.Turnos.service;



import com.ejercicio1.semilla.Turnos.dto.ResponseDTO;
import com.ejercicio1.semilla.Turnos.dto.ServiciosDTO;


public interface IServiciosService {
	
	public ResponseDTO  getAll();
	
	
	public ResponseDTO getServiciosById_servicio(Integer id_servicio);
	
	public ResponseDTO createServicios(ServiciosDTO serviciosDTO);
	
	public ResponseDTO updateServicios(ServiciosDTO serviciosDTO);
	
	public ResponseDTO deleteServicios(Integer id_servicio);


	public ResponseDTO buscarPorId_servicio(Integer id_servicio);


}
