
public class EuroAdapter implements IConversor {

	private CalculadoraEuro calculadoraEuro;
	private double cotacao;

	public EuroAdapter(double valorDoProduto, double valorDoServico, double cotacao) {
		this.calculadoraEuro = new CalculadoraEuro(valorDoProduto, valorDoServico);
		this.cotacao = cotacao;
	}

	@Override
	public double converter() {
		return this.calculadoraEuro.calcularEmEuro(this.cotacao);
	}

}
