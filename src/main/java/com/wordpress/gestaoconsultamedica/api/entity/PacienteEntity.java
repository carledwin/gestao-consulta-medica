package com.wordpress.gestaoconsultamedica.api.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="paciente")
public class PacienteEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private ConvenioEntity convenio;
	
	@OneToMany(mappedBy="paciente")
	private List<TelefoneEntity> telefones;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ConvenioEntity getConvenio() {
		return convenio;
	}
	public void setConvenio(ConvenioEntity convenio) {
		this.convenio = convenio;
	}
	public List<TelefoneEntity> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<TelefoneEntity> telefones) {
		this.telefones = telefones;
	}
}