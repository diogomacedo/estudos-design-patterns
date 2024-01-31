public enum TiposDeRequisicaoEnum {

	REQUISICAO_UM("REQUISICAO UM", 1),
	REQUISICAO_DOIS("REQUISICAO DOIS", 2),
	REQUISICAO_TRES("REQUISICAO TRES", 3);

	private String descricao;
	private Integer codigo;

	private TiposDeRequisicaoEnum(String descricao, Integer codigo) {
		this.descricao = descricao;
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	

}
