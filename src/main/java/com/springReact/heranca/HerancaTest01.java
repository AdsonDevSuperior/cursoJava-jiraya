package com.springReact.heranca;

import com.springReact.domain.Funcionario;
import com.springReact.domain.Endereco;
import com.springReact.domain.Pessoa;

public class HerancaTest01 {

	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua do Pombal");
		endereco.setCep("2323=2332");
		Pessoa people = new Pessoa();
		people.setNome("Toyphisa Shimazu");
		people.setCpf("443443-4343");
		people.setEndereco(endereco);
		people.imprime();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Oda Tuanda");
		funcionario.setCpf("049333433-01");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(2100);
		System.out.println("----------------------------------------------");
		funcionario.imprime();
		
	}
	

}
