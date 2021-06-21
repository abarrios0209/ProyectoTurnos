package com.ejercicio1.semilla.Turnos.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ejercicio1.semilla.Turnos.dto.TurnosDTO;
import com.ejercicio1.semilla.Turnos.entity.TurnosEntity;

public interface ITurnosRepository extends JpaRepository<TurnosEntity, Integer> {
	
	List<TurnosEntity> findByIdServicio(Integer idServicio);
	
	@Query("SELECT t FROM TurnosEntity t WHERE t.idServicio =?1 ")
	List<TurnosEntity> queryIdServicio(Integer idServicio);
	
	@Query("SELECT t FROM TurnosEntity t, ServiciosEntity u WHERE t.idServicio = u.idServicio AND u.nomServicio like %?1%")
	List<TurnosDTO> queryIdServicio(String nomServicio);
	
	@Query("SELECT new com.ejercicio1.semilla.Turnos.dto.TurnosDTO( t.idTurno, t.idServicio,t.fechaTurno,t.horaInicio, t.horaFin, t.estado) FROM TurnosEntity t, ServiciosEntity u WHERE t.idServicio = u.idServicio AND u.nomServicio like %?1% ")
	List<TurnosDTO> queryIdServicioDTO(String nomServicio);
	



}
