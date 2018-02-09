package com.wordpress.gestaoconsultamedica.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.wordpress.gestaoconsultamedica.api.entity.PacienteEntity;
import com.wordpress.gestaoconsultamedica.model.Consulta;
import com.wordpress.gestaoconsultamedica.model.ModelApiResponse;
import com.wordpress.gestaoconsultamedica.model.Paciente;
import com.wordpress.gestaoconsultamedica.repository.PacienteRepository;

import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-07T13:33:43.748Z")

@Controller
public class ConsultaApiController implements ConsultaApi {

	@Autowired
	private PacienteRepository pacienteRepository;

    public ResponseEntity<Consulta> cadastro(@ApiParam(value = "Informacoes sobre a consulta" ,required=true )  @Valid @RequestBody Consulta body) {
        // do some magic!
        return new ResponseEntity<Consulta>(HttpStatus.OK);
    }

    public ResponseEntity consultaPorCodigo(@ApiParam(value = "Codigo da consulta para busca",required=true ) @PathVariable("codigo") Long codigo) {
    	
    	PacienteEntity pacienteBd = pacienteRepository.findOne(codigo);
    	
    	if(pacienteBd != null) {
    		
    		Consulta consulta = new Consulta();
    		Paciente paciente = new Paciente();
    		paciente.setId(pacienteBd.getId());
    		
    		consulta.paciente(paciente);
    		
    		return new ResponseEntity<Consulta>(consulta, HttpStatus.OK);
    	}
    	
    	return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<ModelApiResponse> delete(@ApiParam(value = "Codigo da consulta para exclusao",required=true ) @PathVariable("codigo") Long codigo) {
        // do some magic!
        return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Consulta> update(@ApiParam(value = "Informacoes sobre a consulta para efeturar a alteracao" ,required=true )  @Valid @RequestBody Consulta body) {
        // do some magic!
        return new ResponseEntity<Consulta>(HttpStatus.OK);
    }

}
