
public class ConversorEuro {

	private double valorDoProduto;
	private double valorDoServico;
	private double cotacao = 1;
	private double valorTotalEmEuro;

	public ConversorEuro(double valorDoProduto, double valorDoServico) {
		this.valorDoProduto = valorDoProduto;
		this.valorDoServico = valorDoServico;
	}

	public double calcularEmEuro() {
		this.valorTotalEmEuro = (this.valorDoProduto + this.valorDoServico) * this.cotacao;
		System.out.println("O valor total em euro é: €$" + this.valorTotalEmEuro);
		return this.valorTotalEmEuro;
	}

}
