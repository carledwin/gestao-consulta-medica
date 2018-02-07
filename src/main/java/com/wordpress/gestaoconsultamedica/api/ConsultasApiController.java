package com.wordpress.gestaoconsultamedica.api;

import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.wordpress.gestaoconsultamedica.model.Consulta;
import com.wordpress.gestaoconsultamedica.model.Consulta.StatusEnum;

import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-07T13:33:43.748Z")

@Controller
public class ConsultasApiController implements ConsultasApi {



    @SuppressWarnings("unchecked")
	public ResponseEntity consulta( @NotNull@ApiParam(value = "Status da consulta realizar o filtro", required = true) @RequestParam(value = "status", required = true) String status) {
    	
    	if(isValidStatus(status)) {
    		List<Consulta> consultas = Arrays.asList(new Consulta(), new Consulta());
    		return new ResponseEntity<List<Consulta>>(consultas, HttpStatus.OK);
    	}else {
    		return new ResponseEntity<ApiResponseMessage>(new ApiResponseMessage(400, "Status inválido"), HttpStatus.BAD_REQUEST);
    	}
    }
    
    private boolean isValidStatus(String status) {
    	
    	if(status != null) {
    		return status.equalsIgnoreCase(StatusEnum.AGENDADA.toString()) || status.equalsIgnoreCase(StatusEnum.CANCELADA.toString()) || status.equalsIgnoreCase(StatusEnum.REALIZADA.toString());
    	}
    	
    	return false;
    }

}
