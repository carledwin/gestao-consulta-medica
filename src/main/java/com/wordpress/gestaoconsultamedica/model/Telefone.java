package com.wordpress.gestaoconsultamedica.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Telefone
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-07T13:33:43.748Z")

public class Telefone   {
  @JsonProperty("ddd")
  private Integer ddd = null;

  @JsonProperty("numero")
  private Integer numero = null;

  public Telefone ddd(Integer ddd) {
    this.ddd = ddd;
    return this;
  }

   /**
   * Get ddd
   * @return ddd
  **/
  @ApiModelProperty(value = "")


  public Integer getDdd() {
    return ddd;
  }

  public void setDdd(Integer ddd) {
    this.ddd = ddd;
  }

  public Telefone numero(Integer numero) {
    this.numero = numero;
    return this;
  }

   /**
   * Get numero
   * @return numero
  **/
  @ApiModelProperty(value = "")


  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Telefone telefone = (Telefone) o;
    return Objects.equals(this.ddd, telefone.ddd) &&
        Objects.equals(this.numero, telefone.numero);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddd, numero);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Telefone {\n");
    
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
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

