package br.com.diogomacedo.exemplos;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Double> ingredientes = new HashMap<String, Double>();

		ingredientes.put("Massa", 15.0);
		ingredientes.put("Queijo Mussarela", 10.0);
		ingredientes.put("Manjericão", 3.0);
		ingredientes.put("Tomate", 3.0);

		Pizza pizzaDeMarguerita = new PizzaComum(ingredientes);

		Pizza pizzaDeMargueritaComBordaRecheada = new PizzaComBordaRecheada(pizzaDeMarguerita);

		Pizza pizzaDeMargueritaComBordaRecheadaComMassaIntegral = new PizzaComMassaIntegral(
				pizzaDeMargueritaComBordaRecheada);

		Pizza pizzaDeMargueritaComBordaRecheadaComMassaIntegralComRecheioExtra = new PizzaComRecheioExtra(
				pizzaDeMargueritaComBordaRecheadaComMassaIntegral);

		System.out.println(
				"Preço da pizza: R$" + pizzaDeMargueritaComBordaRecheadaComMassaIntegralComRecheioExtra.preco());

	}

}
