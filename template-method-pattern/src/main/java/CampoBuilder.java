
public class CampoBuilder {

	private Campo campo;

	private CampoBuilder() {
	}

	public static CampoBuilder builder() {
		CampoBuilder builder = new CampoBuilder();
		builder.campo = new Campo();
		return builder;
	}

	public Campo get() {
		return this.campo;
	}

	public CampoBuilder setNome(String nome) {
		this.campo.setNome(nome);
		return this;
	}

	public CampoBuilder setTamanho(int tamanho) {
		this.campo.setTamanho(tamanho);
		return this;
	}

}
