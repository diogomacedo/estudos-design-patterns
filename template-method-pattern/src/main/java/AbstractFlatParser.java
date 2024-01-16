
public abstract class AbstractFlatParser<T> {

	public abstract void initObjeto();
	public abstract T getObjecto();

	public abstract void setValor(String campo, Object valor);
	public abstract void adicionarElemento(String campo, Object valor);

	public abstract T parse(String texto);
	

}
