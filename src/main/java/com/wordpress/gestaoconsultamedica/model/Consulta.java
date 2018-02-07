package com.wordpress.gestaoconsultamedica.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wordpress.gestaoconsultamedica.model.Paciente;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.joda.time.DateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Consulta
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-07T13:33:43.748Z")

public class Consulta   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("datahora")
  private DateTime datahora = null;

  /**
   * Gets or Sets categoria
   */
  public enum CategoriaEnum {
    CONVENIO("convenio"),
    
    PARTICULAR("particular");

    private String value;

    CategoriaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoriaEnum fromValue(String text) {
      for (CategoriaEnum b : CategoriaEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("categoria")
  private CategoriaEnum categoria = null;

  @JsonProperty("paciente")
  private Paciente paciente = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    CANCELADA("cancelada"),
    
    AGENDADA("agendada"),
    
    REALIZADA("realizada");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public Consulta id(Long id) {
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

  public Consulta datahora(DateTime datahora) {
    this.datahora = datahora;
    return this;
  }

   /**
   * Get datahora
   * @return datahora
  **/
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "")

  @Valid

  public DateTime getDatahora() {
    return datahora;
  }

  public void setDatahora(DateTime datahora) {
    this.datahora = datahora;
  }

  public Consulta categoria(CategoriaEnum categoria) {
    this.categoria = categoria;
    return this;
  }

   /**
   * Get categoria
   * @return categoria
  **/
  @ApiModelProperty(value = "")


  public CategoriaEnum getCategoria() {
    return categoria;
  }

  public void setCategoria(CategoriaEnum categoria) {
    this.categoria = categoria;
  }

  public Consulta paciente(Paciente paciente) {
    this.paciente = paciente;
    return this;
  }

   /**
   * Get paciente
   * @return paciente
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  public Consulta status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consulta consulta = (Consulta) o;
    return Objects.equals(this.id, consulta.id) &&
        Objects.equals(this.datahora, consulta.datahora) &&
        Objects.equals(this.categoria, consulta.categoria) &&
        Objects.equals(this.paciente, consulta.paciente) &&
        Objects.equals(this.status, consulta.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, datahora, categoria, paciente, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consulta {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    datahora: ").append(toIndentedString(datahora)).append("\n");
    sb.append("    categoria: ").append(toIndentedString(categoria)).append("\n");
    sb.append("    paciente: ").append(toIndentedString(paciente)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

