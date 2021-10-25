package br.com.diogomacedo.exemplos;

import br.com.diogomacedo.exemplos.pojos.Escola;

public class Main {

	public static void main(String[] args) {

		Escola escola = Escola.getInstance();

		escola.setNomeEscola("Escola de Primeiro e Segundo Grau Xuxu Beleza");

		System.out.println("Nome da Escola #1: " + escola.getNomeEscola());

		Escola escolaDois = Escola.getInstance();

		System.out.println("Nome da Escola #2: " + escolaDois.getNomeEscola());

	}

}
