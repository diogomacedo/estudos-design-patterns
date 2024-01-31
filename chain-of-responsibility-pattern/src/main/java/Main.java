
public class Main {

	public static void main(String[] args) {

		RequisicaoHandler requisicaoUm = new RequisicaoUmHandler();
		RequisicaoHandler requisicaoDois = new RequisicaoDoisHandler();
		RequisicaoHandler requisicaoTres = new RequisicaoTresHandler();

		requisicaoUm.setProximo(requisicaoDois);
		requisicaoDois.setProximo(requisicaoTres);

		requisicaoUm.processar(TiposDeRequisicaoEnum.REQUISICAO_UM.getCodigo(),
				TiposDeRequisicaoEnum.REQUISICAO_UM.getDescricao());

	}

}
