import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> valores = new LinkedList<String>();

		valores.add("Química na abordagem do cotidiano - Volume único   Francisco M. Peruzzo (tito) e Eduardo L. do Canto ");
		valores.add("Matemática Contexto e Aplicações Volume Único      Luiz Roberto Dante                                ");
		valores.add("Gramática: Texto, Reflexão e Uso                   William Roberto Cereja / Thereza Cochar Magalhães ");
		valores.add("Cozinha Prática                                    Rita Lobo                                         ");
		valores.add("O que tem na geladeira?                            Rita Lobo                                         ");

		Estrutura estrutura = EstruturaBuilder
				.builder()
				.addCampo(CampoBuilder.builder().setNome("titulo").setTamanho(50).get())
				.addCampo(CampoBuilder.builder().setNome("autor").setTamanho(50).get())
				.get();

		FlatParse<Livro> livroFlatParse = new FlatParse<Livro>(estrutura, Livro.class);

		List<Livro> livros = livroFlatParse.parse(valores);

	}

}
