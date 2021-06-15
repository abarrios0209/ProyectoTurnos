package com.ejercicio1.semilla.Turnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ejercicio1.semilla.Turnos.dto.ServiciosDTO;
import com.ejercicio1.semilla.Turnos.entity.ServiciosEntity;

@Mapper(componentModel = "spring")
public interface IServiciosMapper {
	
	@Mappings({
		@Mapping(source="id_servicio",target="identificador_servicio"),
		@Mapping(source="nom_servicio",target="nombre_servicio"),
		@Mapping(source="hora_apertura",target="hr_apertura")
		})
	public ServiciosDTO entityToDto(ServiciosEntity serviciosEntity);
	
	@Mappings({
		@Mapping(source="identificador_servicio",target="id_servicio"),
		@Mapping(source="nombre_servicio",target="nom_servicio"),
		@Mapping(source="hr_apertura",target="hora_apertura")
		})
	public ServiciosEntity dtoToentity(ServiciosDTO serviciosDTO);
	
	public List<ServiciosDTO> listEntityToDto(List<ServiciosEntity> serviciosEntity);
	
	public List<ServiciosEntity> listDtoToEntity(List<ServiciosDTO> serviciosDTO);
}
