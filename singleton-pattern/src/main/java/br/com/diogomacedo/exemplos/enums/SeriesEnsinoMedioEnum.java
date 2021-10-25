package br.com.diogomacedo.exemplos.enums;

public enum SeriesEnsinoMedioEnum {

	PRIMEIRO_ANO(1),
	SEGUNDO_ANO(2),
	TERCEIRO_ANO(3);

	private final int serie;

	SeriesEnsinoMedioEnum(int serie) {
		this.serie = serie;
	}

}
