package com.ejercicio1.semilla.Turnos.service;

import java.util.List;

import com.ejercicio1.semilla.Turnos.dto.ServiciosDTO;
import com.ejercicio1.semilla.Turnos.entity.ServiciosEntity;

public interface IServiciosService {
	
	public List<ServiciosEntity> getAll();
	
	
	public ServiciosDTO getServiciosById_servicio(Integer id_servicio);
	
	public ServiciosDTO createServicios(ServiciosDTO serviciosDTO);
	
	public ServiciosDTO updateServicios(ServiciosDTO serviciosDTO);
	
	public void deleteServicios(Integer id_servicio);


	public ServiciosDTO buscarPorId_servicio(Integer id_servicio);


}
