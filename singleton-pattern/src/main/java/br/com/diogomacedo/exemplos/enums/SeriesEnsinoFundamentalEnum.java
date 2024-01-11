package br.com.diogomacedo.exemplos.enums;

public enum SeriesEnsinoFundamentalEnum {

	PRIMEIRO_ANO(1),
	SEGUNDO_ANO(2),
	TERCEIRO_ANO(3),
	QUARTO_ANO(4),
	QUINTO_ANO(5),
	SEXTO_ANO(6),
	SETIMO_ANO(7),
	OITAVO_ANO(8),
	NONO_ANO(9);

	private final int serie;

	SeriesEnsinoFundamentalEnum(int serie) {
		this.serie = serie;
	}

	public int getSerie() {
		return serie;
	}

}
