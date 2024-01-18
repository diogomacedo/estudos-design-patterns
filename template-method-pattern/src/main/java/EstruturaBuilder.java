import java.util.LinkedList;

public class EstruturaBuilder {

	private Estrutura estrutura;

	private EstruturaBuilder() {
	}

	public static EstruturaBuilder builder() {
		EstruturaBuilder builder = new EstruturaBuilder();
		builder.estrutura = new Estrutura();
		builder.estrutura.setCampos(new LinkedList<Campo>());
		return builder;
	}

	public Estrutura get() {
		return this.estrutura;
	}

	public EstruturaBuilder addCampo(Campo campo) {
		this.estrutura.getCampos().add(campo);
		return this;
	}

}
