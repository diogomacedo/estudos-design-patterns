import java.util.LinkedList;
import java.util.List;

public abstract class AbstractFlatParser<T> {

	private static final String ERRO = "Erro ao realizar o parse do objeto";

	private Estrutura estrutura;

	public abstract void initObjeto();

	public abstract T getObjeto();

	public abstract void setValor(String campo, Object valor);

	

	public AbstractFlatParser(Estrutura estrutura) {
		this.estrutura = estrutura;
	}

	public List<T> parse(List<String> valores) {

		List<T> resultado = null;

		try {
			resultado = this.innerParse(valores);
		} catch (Exception e) {
			throw new IllegalStateException(ERRO, e);
		}

		return resultado;

	}

	private List<T> innerParse(List<String> valores) throws Exception {

		List<T> resultado = new LinkedList<T>();

		try {

			for (String valor : valores) {

				int posicao = 0;

				this.initObjeto();

				for (Campo campo : this.estrutura.getCampos()) {

					String nomeDoCampo = campo.getNome();
					Integer tamanhoDoCampo = campo.getTamanho();

					String valorDoCampo = valor.substring(posicao, posicao + tamanhoDoCampo).trim();

					this.setValor(nomeDoCampo, valorDoCampo);

					posicao += tamanhoDoCampo;

				}

				resultado.add(this.getObjeto());

			}

		} catch (Exception e) {
			throw e;
		}

		return resultado;

	}

}
