package com.ejercicio1.semilla.Turnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio1.semilla.Turnos.entity.ComerciosEntity;

public interface IComerciosRepository extends JpaRepository<ComerciosEntity, Integer> {

}
