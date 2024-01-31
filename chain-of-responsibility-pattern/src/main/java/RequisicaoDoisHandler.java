
public class RequisicaoDoisHandler extends RequisicaoHandler {

	@Override
	public void processar(Integer codigoDaRequisicao, String nome) {

		System.out.println("-----------------------------------");
		System.out.println("Requisição dois...");

		if (TiposDeRequisicaoEnum.REQUISICAO_DOIS.getCodigo() == codigoDaRequisicao) {
			super.printDados(codigoDaRequisicao, nome);
		}

		System.out.println("-----------------------------------");

		super.executarProximo(codigoDaRequisicao, nome);

	}

}
