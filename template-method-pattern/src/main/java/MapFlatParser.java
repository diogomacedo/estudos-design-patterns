import java.util.LinkedHashMap;
import java.util.Map;

public class MapFlatParser extends AbstractFlatParser<Map<String, String>> {

	private Map<String, String> map;

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
		String valorStr = "";
		if (valor != null) {
			valorStr = valor.toString();
		}
		this.map.put(campo, valorStr);
	}

//	@Override
//	public void adicionarElemento(String campo, Object valor) {
//		// TODO Auto-generated method stub
//
//	}

	@Override
	public Map<String, String> innerParse(String texto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
