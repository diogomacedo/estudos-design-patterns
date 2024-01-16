package br.com.diogomacedo.exemplos;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Double> ingredientes = new HashMap<String, Double>();

		ingredientes.put("Massa", 15.0);
		ingredientes.put("Queijo Mussarela", 10.0);
		ingredientes.put("Manjericão", 3.0);
		ingredientes.put("Tomate", 3.0);

		Pizza pizza = new PizzaComum(ingredientes);

		pizza = new PizzaComMassaIntegral(pizza);
//
//		pizza = new PizzaComBordaRecheada(pizza);
//
//		pizza = new PizzaComRecheioExtra(pizza);

		System.out.println("Preço da pizza: R$" + pizza.preco());

	}

}
