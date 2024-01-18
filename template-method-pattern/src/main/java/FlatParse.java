import java.lang.reflect.Field;

public class FlatParse<T> extends AbstractFlatParser<T> {

	private static final String ERRO_AO_INSTANCIAR_OBJETO = "Ocorreu um erro durante a instanciação do objeto.";

	private T objeto;
	private Class<T> classeDoObjeto;

	public FlatParse(Estrutura estrutura, Class<T> classeDoObjeto) {
		super(estrutura);
		this.classeDoObjeto = classeDoObjeto;
	}

	@Override
	public void initObjeto() {
		try {
			this.objeto = classeDoObjeto.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			String mensagemDeErro = ERRO_AO_INSTANCIAR_OBJETO + " - " + classeDoObjeto.getName();
			throw new IllegalStateException(mensagemDeErro, e);
		}
	}

	@Override
	public T getObjeto() {
		return this.objeto;
	}

	@Override
	public void setValor(String campo, Object valor) {
		try {
			Field javaField = this.javaField(campo);
			javaField.setAccessible(true);
			javaField.set(this.objeto, valor);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			String mensagemDeErro = ERRO_AO_INSTANCIAR_OBJETO + " - " + classeDoObjeto.getName();
			throw new IllegalStateException(mensagemDeErro, e);
		}
	}

	private Field javaField(String fieldName) {
		Field javaField;
		try {
			javaField = classeDoObjeto.getDeclaredField(fieldName);
		} catch (NoSuchFieldException | SecurityException e) {
			String mensagemDeErro = ERRO_AO_INSTANCIAR_OBJETO + " - " + classeDoObjeto.getName();
			throw new IllegalStateException(mensagemDeErro, e);
		}
		return javaField;
	}

}
