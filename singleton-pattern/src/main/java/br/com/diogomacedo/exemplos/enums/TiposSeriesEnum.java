package br.com.diogomacedo.exemplos.enums;

public enum TiposSeriesEnum {

	ENSINO_PRIMARIO("Ensino Primário"),
	ENSINO_FUNDAMENTAL("Ensino Fundamental"),
	ENSINO_MEDIO("Ensino Médio");

	private final String tipoSerie;

	TiposSeriesEnum(String tipoSerie) {
		this.tipoSerie = tipoSerie;
	}

	public String getTipoSerie() {
		return tipoSerie;
	}

}
