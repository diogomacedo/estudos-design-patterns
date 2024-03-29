
public class ConversorDolar {

	private double valorDoProduto;
	private double valorDoServico;
	private double cotacao = 1;
	private double valorTotalEmDolar;

	public ConversorDolar(double valorDoProduto, double valorDoServico) {
		this.valorDoProduto = valorDoProduto;
		this.valorDoServico = valorDoServico;
	}

	public double calcular() {
		this.valorTotalEmDolar = (this.valorDoProduto + this.valorDoServico) * this.cotacao;
		System.out.println("O valor total em dolar é: U$" + this.valorTotalEmDolar);
		return this.valorTotalEmDolar;
	}

}
