package br.com.diogomacedo.exemplos.enums;

public enum SeriesEnsinoPrimarioEnum {

	INFANTIL_BERCARIO(0),
	INFANTIL_G1(1),
	INFANTIL_G2(2),
	INFANTIL_G3(3),
	INFANTIL_G4(4),
	INFANTIL_G5(5);

	private final int serie;

	SeriesEnsinoPrimarioEnum(int serie) {
		this.serie = serie;
	}

}
