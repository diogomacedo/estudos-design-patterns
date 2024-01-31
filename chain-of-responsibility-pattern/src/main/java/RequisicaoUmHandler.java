
public class RequisicaoUmHandler extends RequisicaoHandler {

	@Override
	public void processar(Integer codigoDaRequisicao, String nome) {

		System.out.println("-----------------------------------");
		System.out.println("Requisição um...");

		if (TiposDeRequisicaoEnum.REQUISICAO_UM.getCodigo() == codigoDaRequisicao) {
			super.printDados(codigoDaRequisicao, nome);
		}

		System.out.println("-----------------------------------");

		super.executarProximo(codigoDaRequisicao, nome);

		
	}

}
