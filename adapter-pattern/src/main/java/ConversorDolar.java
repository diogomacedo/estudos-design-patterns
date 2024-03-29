
public class ConversorDolar implements IConversor {

	private double valorDoProduto;
	private double valorDoServico;
	private double cotacao = 1;
	private double valorTotalEmDolar;

	public ConversorDolar(double valorDoProduto, double valorDoServico, double cotacao) {
		this.valorDoProduto = valorDoProduto;
		this.valorDoServico = valorDoServico;
		this.cotacao = cotacao;
	}

	@Override
	public double converter() {
		this.valorTotalEmDolar = (this.valorDoProduto + this.valorDoServico) * this.cotacao;
		System.out.println("O valor total em dolar é: U$" + this.valorTotalEmDolar);
		return this.valorTotalEmDolar;
	}

}
