package com.rebeka.PrjEmpresa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long depcodigo;
	
	private String depnome;
	
	//criando os metodos getts e setts	
	public Long getDepcodigo() {
		return depcodigo;
	}
	
	public void setDepcodigo(Long depcodigo) {
		this.depcodigo = depcodigo;
	}
	
	public String getDepnome() {
		return depnome;
	}
	
	public void setDepnome(String depnome) {
		this.depnome = depnome;
	}
	
}
