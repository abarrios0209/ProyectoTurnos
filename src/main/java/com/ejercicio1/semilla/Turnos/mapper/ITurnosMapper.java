package com.ejercicio1.semilla.Turnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ejercicio1.semilla.Turnos.dto.TurnosDTO;
import com.ejercicio1.semilla.Turnos.entity.TurnosEntity;

@Mapper(componentModel="spring")
public interface ITurnosMapper {

	@Mappings({
		@Mapping(source="id_turno", target="identificador_turno"),
		})	
	public TurnosDTO entityToDto(TurnosEntity turnosEntity);
	
	@Mappings({
		@Mapping(source="identificador_turno", target="id_turno"),
		})	
	
	public TurnosEntity dtoToEntity(TurnosDTO turnosDTO);
	
	public List<TurnosDTO> listEntityToDto(List<TurnosEntity> turnosEntity);
	
	public List<TurnosEntity> listToDtoEntity(List<TurnosDTO> turnosDTO);
	
}
