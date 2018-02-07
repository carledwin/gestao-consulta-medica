package com.wordpress.gestaoconsultamedica.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordpress.gestaoconsultamedica.model.Telefone;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Paciente
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-07T13:33:43.748Z")

public class Paciente   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("sobrenome")
  private String sobrenome = null;

  @JsonProperty("telefone")
  private Telefone telefone = null;

  public Paciente id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Paciente nome(String nome) {
    this.nome = nome;
    return this;
  }

   /**
   * Get nome
   * @return nome
  **/
  @ApiModelProperty(value = "")


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Paciente sobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
    return this;
  }

   /**
   * Get sobrenome
   * @return sobrenome
  **/
  @ApiModelProperty(value = "")


  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public Paciente telefone(Telefone telefone) {
    this.telefone = telefone;
    return this;
  }

   /**
   * Get telefone
   * @return telefone
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Telefone getTelefone() {
    return telefone;
  }

  public void setTelefone(Telefone telefone) {
    this.telefone = telefone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paciente paciente = (Paciente) o;
    return Objects.equals(this.id, paciente.id) &&
        Objects.equals(this.nome, paciente.nome) &&
        Objects.equals(this.sobrenome, paciente.sobrenome) &&
        Objects.equals(this.telefone, paciente.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, sobrenome, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paciente {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    sobrenome: ").append(toIndentedString(sobrenome)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

