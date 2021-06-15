package com.ejercicio1.semilla.Turnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ejercicio1.semilla.Turnos.dto.ComerciosDTO;
import com.ejercicio1.semilla.Turnos.entity.ComerciosEntity;

@Mapper(componentModel = "spring")
public interface IComerciosMapper {

	@Mappings({
		@Mapping(source="id_comercio", target="identificador_comercio"),
		@Mapping(source="nom_comercio", target="nombre_comercio")
		})
	public ComerciosDTO entityToDto(ComerciosEntity comerciosEntity);
	
	@Mappings({
	@Mapping(source="identificador_comercio", target="id_comercio"),
	@Mapping(source="nombre_comercio", target="nom_comercio")
	})
	public ComerciosEntity dtoToEntity(ComerciosDTO comerciosDTO);
	
	public List<ComerciosDTO> listEntityToDto(List<ComerciosEntity> comerciosEntity);
	
	public List<ComerciosEntity> listdtoToEntity(List<ComerciosDTO> comerciosDTO);
	
}
