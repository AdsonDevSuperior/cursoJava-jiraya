package com.springReact.domain;

public class Funcionario extends Pessoa {
	
	private double salario;
		
//	public Employ(String nome) {
//		super(nome);;
//	}
	
	public void imprime() {
		super.imprime();
		System.out.println(this.salario);
	}

	public void relatorioPagamento() {
		System.out.println("Eu " + this.nome + "Recebi o salario de: " + this.salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
