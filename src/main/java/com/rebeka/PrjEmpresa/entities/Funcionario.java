package com.rebeka.PrjEmpresa.entities;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name = "funcionario")
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long funcodigo;
	
	private String funnome;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate funnascimento;
	
	private double funsalario;
	
	@ManyToOne
	private Departamento departamento;

    //inserir os metodos get e o set
     public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	//criando os metodos getts e setts	
	public Long getFuncodigo() {
		return funcodigo;
	}
	
	public void setFuncodigo(Long funcodigo) {
		this.funcodigo = funcodigo;
	}
	
	public String getFunnome() {
		return funnome;
	}
	
	public void setFunnome(String funnome) {
		this.funnome = funnome;
	}
	//
	public LocalDate getFunnascimento() {
		return funnascimento;
	}
	
	public void setFunnascimento(LocalDate funnascimento) {
		this.funnascimento = funnascimento;
	}
	//
	public double getFunsalario() {
		return funsalario;
	}
	
	public void setFunsalario(double funsalario) {
		this.funsalario = funsalario;
	}
	
}
