
public class RequisicaoTresHandler extends RequisicaoHandler {

	@Override
	public void processar(Integer codigoDaRequisicao, String nome) {

		System.out.println("-----------------------------------");
		System.out.println("Requisição três...");

		if (TiposDeRequisicaoEnum.REQUISICAO_TRES.getCodigo() == codigoDaRequisicao) {
			super.printDados(codigoDaRequisicao, nome);
		}


		System.out.println("-----------------------------------");

		super.executarProximo(codigoDaRequisicao, nome);

	}

}
