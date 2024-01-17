
public abstract class AbstractFlatParser<T> {

	private static final String ERRO = "Erro";

	public abstract void initObjeto();

	public abstract T getObjeto();

	public abstract void setValor(String campo, Object valor);

//	public abstract void adicionarElemento(String campo, Object valor);

	public abstract T innerParse(String texto) throws Exception;

	public T parse(String texto) {

		T resultado = null;

		try {
			resultado = this.innerParse(texto);
		} catch (Exception e) {
			String mensagemDeErro = ERRO + this.getObjeto().toString();
			throw new IllegalStateException(mensagemDeErro, e);
		}

		return resultado;

	}

}
