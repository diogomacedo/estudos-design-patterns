package br.com.diogomacedo.exemplos;

import br.com.diogomacedo.exemplos.pojos.Escola;

public class Main {

	public static void main(String[] args) {

		System.out.println("Instanciando a Escola #1");

		Escola escolaUm = Escola.getInstance();

		escolaUm.setNomeEscola("Escola de Primeiro e Segundo Grau Xuxu Beleza");

		System.out.println("Nome da Escola #1: " + escolaUm.getNomeEscola());

		System.out.println("");

		System.out.println("Instanciando a Escola #2");

		Escola escolaDois = Escola.getInstance();

		escolaDois.setNomeEscola("Escolha de Primeiro e Segundo Grau Yuke");

		System.out.println("Nome da Escola #2: " + escolaDois.getNomeEscola());

		System.out.println("");

		System.out.println("Nome da Escola #1: " + escolaUm.getNomeEscola());
		System.out.println("Nome da Escola #2: " + escolaDois.getNomeEscola());

		System.out.println("");

		System.out.println("escolaUm=escolaDois => " + (escolaUm == escolaDois) );

	}

}
