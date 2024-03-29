
public class EuroAdapter implements ITarget {

	private ConversorEuro conversor;

	public EuroAdapter(double valorDoProduto, double valorDoServico) {
		this.conversor = new ConversorEuro(valorDoProduto, valorDoServico);
	}

	@Override
	public double calcular() {
		return this.conversor.calcularEmEuro();
	}

}
