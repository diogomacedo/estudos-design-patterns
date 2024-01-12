package br.com.diogomacedo.exemplos;

import java.util.HashMap;
import java.util.Map.Entry;

public class PizzaComum implements Pizza {

	HashMap<String, Double> ingredientes;

	public PizzaComum() {
	}

	public PizzaComum(HashMap<String, Double> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public double preco() {
		double preco = 0;
		System.out.println("Valor inicial da pizza: R$" + preco);
		System.out.println("");
		if (this.ingredientes != null) {
			for (Entry<String, Double> ingrediente : this.ingredientes.entrySet()) {
				System.out.println("Adicionando " + ingrediente.getKey());
				System.out.println("Valor do item: R$ " + ingrediente.getValue());
				System.out.println("");
				preco += ingrediente.getValue();
				System.out.println("Valor parcial da pizza: R$" + preco);
				System.out.println("");
			}
		}
		System.out.println("Valor final da pizza: R$" + preco);
		System.out.println("");
		return preco;
	}

}
