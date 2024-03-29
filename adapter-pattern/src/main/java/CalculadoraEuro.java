
/**
 * Classe Adaptee
 */
public class CalculadoraEuro {

	private double valorDoProduto;
	private double valorDoServico;
	private double valorTotalEmEuro;

	public CalculadoraEuro(double valorDoProduto, double valorDoServico) {
		this.valorDoProduto = valorDoProduto;
		this.valorDoServico = valorDoServico;
	}

	public double calcularEmEuro(double cotacao) {
		this.valorTotalEmEuro = (this.valorDoProduto + this.valorDoServico) * cotacao;
		System.out.println("O valor total em euro é: €$" + this.valorTotalEmEuro);
		return this.valorTotalEmEuro;
	}

}
