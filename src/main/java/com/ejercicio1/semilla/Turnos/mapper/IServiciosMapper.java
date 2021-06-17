package com.ejercicio1.semilla.Turnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ejercicio1.semilla.Turnos.dto.ServiciosDTO;
import com.ejercicio1.semilla.Turnos.entity.ServiciosEntity;

@Mapper(componentModel = "spring", uses = {ITurnosMapper.class})
public interface IServiciosMapper {
	
	
	@Mappings({
		@Mapping(source="idServicio",target="identificadorServicio"),
		@Mapping(source="nomServicio",target="nombreServicio"),
		@Mapping(source="horaApertura",target="hrApertura")
	})
	
	public ServiciosDTO entityToDto(ServiciosEntity serviciosEntity);

	@Mappings({
		@Mapping(source="identificadorServicio",target="idServicio"),
		@Mapping(source="nombreServicio",target="nomServicio"),
		@Mapping(source="hrApertura",target="horaApertura")
	})
	
	public ServiciosEntity dtoToentity(ServiciosDTO serviciosDTO);

	public List<ServiciosDTO> listEntityToDto(List<ServiciosEntity> serviciosEntity);

	public List<ServiciosEntity> listDtoToEntity(List<ServiciosDTO> serviciosDTO);
}
