import java.util.LinkedHashMap;
import java.util.Map;

public class MapFlatParser extends AbstractFlatParser<Map<String, String>> {

	private Map<String, String> map;

	public MapFlatParser(Estrutura estrutura) {
		super(estrutura);
	}

	@Override
	public void initObjeto() {
		this.map = new LinkedHashMap<String, String>();
	}

	@Override
	public Map<String, String> getObjeto() {
		return this.map;
	}

	@Override
	public void setValor(String campo, Object valor) {
		String resultado = "";
		if (valor != null) {
			resultado = valor.toString();
		}
		this.map.put(campo, resultado);
	}

}
