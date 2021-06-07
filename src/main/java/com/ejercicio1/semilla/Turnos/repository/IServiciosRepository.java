package com.ejercicio1.semilla.Turnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio1.semilla.Turnos.entity.ServiciosEntity;

public interface IServiciosRepository extends JpaRepository<ServiciosEntity, Integer> {

}
