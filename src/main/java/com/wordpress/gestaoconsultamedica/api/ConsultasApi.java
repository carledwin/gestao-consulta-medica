/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.wordpress.gestaoconsultamedica.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.wordpress.gestaoconsultamedica.model.Consulta;
import com.wordpress.gestaoconsultamedica.model.ModelApiResponse;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-07T13:33:43.748Z")

@Api(value = "consultas", description = "the consultas API")
public interface ConsultasApi {

    @ApiOperation(value = "Resgata consultas por status", notes = "", response = Consulta.class, responseContainer = "List", tags={ "Agenda", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Consulta.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status of query", response = ModelApiResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = ModelApiResponse.class) })
    
    @RequestMapping(value = "/consultas",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Consulta>> consulta( @NotNull@ApiParam(value = "Status da consulta realizar o filtro", required = true) @RequestParam(value = "status", required = true) String status);

}