package com.ejercicio1.semilla.Turnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ejercicio1.semilla.Turnos.dto.ComerciosDTO;
import com.ejercicio1.semilla.Turnos.entity.ComerciosEntity;

@Mapper(componentModel = "spring", uses = {IServiciosMapper.class})
public interface IComerciosMapper {

	@Mappings({
		@Mapping(source="idComercio", target="identificadorComercio"),
		@Mapping(source="nomComercio", target="nombreComercio")
		})
	public ComerciosDTO entityToDto(ComerciosEntity comerciosEntity);
	
	@Mappings({
	@Mapping(source="identificadorComercio", target="idComercio"),
	@Mapping(source="nombreComercio", target="nomComercio")
	})
	public ComerciosEntity dtoToEntity(ComerciosDTO comerciosDTO);
	
	public List<ComerciosDTO> listEntityToDto(List<ComerciosEntity> comerciosEntity);
	
	public List<ComerciosEntity> listdtoToEntity(List<ComerciosDTO> comerciosDTO);
	
}
