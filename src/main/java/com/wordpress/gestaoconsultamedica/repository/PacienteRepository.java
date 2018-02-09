package com.wordpress.gestaoconsultamedica.repository;

import org.springframework.data.repository.CrudRepository;

import com.wordpress.gestaoconsultamedica.api.entity.PacienteEntity;

public interface PacienteRepository extends CrudRepository<PacienteEntity, Long> {

}
