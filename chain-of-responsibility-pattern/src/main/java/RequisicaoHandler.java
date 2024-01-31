public abstract class RequisicaoHandler {

	private RequisicaoHandler proximo;

	public abstract void processar(Integer codigoDaRequisicao, String nome);

	public void setProximo(RequisicaoHandler requisicaoHandler) {
		this.proximo = requisicaoHandler;
	}

	protected void executarProximo(Integer codigoDaRequisicao, String nome) {
		if (this.proximo != null) {
			this.proximo.processar(codigoDaRequisicao, nome);
		}
	}

	protected void printDados(Integer codigoDaRequisicao, String nome) {
		System.out.println("Código da requisição:" + codigoDaRequisicao);
		System.out.println("Nome:" + nome);
	}

}
