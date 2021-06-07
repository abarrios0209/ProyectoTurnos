package com.ejercicio1.semilla.Turnos.service;

import java.util.List;

import com.ejercicio1.semilla.Turnos.entity.ComerciosEntity;

public interface IComerciosService {
	
	
	public List<ComerciosEntity> getAll();
	
	public ComerciosEntity getComercioById_comercio(Integer id_comercio);
	
	public ComerciosEntity createComercio(ComerciosEntity comerciosEntity);
	
	public ComerciosEntity updateComercio(ComerciosEntity comerciosEntity);
	
	public void deleteComercio(Integer id_comercio);
	
}
