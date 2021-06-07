package com.ejercicio1.semilla.Turnos.service;

import java.util.List;

import com.ejercicio1.semilla.Turnos.entity.ServiciosEntity;

public interface IServiciosService {
	
	public List<ServiciosEntity> getAll();
	
	
	public ServiciosEntity getServiciosById_servicio(Integer id_servicio);
	
	public ServiciosEntity createServicios(ServiciosEntity serviciosEntity);
	
	public ServiciosEntity updateServicios(ServiciosEntity serviciosEntity);
	
	public void deleteServicios(Integer id_servicio);
}
