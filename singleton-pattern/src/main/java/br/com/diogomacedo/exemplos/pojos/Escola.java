package br.com.diogomacedo.exemplos.pojos;

import java.util.ArrayList;
import java.util.List;

public class Escola {

	private static Escola escola;

	private String nomeEscola;

	private String siglaEscola;

	private boolean ensinoPrimario;

	private boolean ensinoFundamental;

	private boolean ensinoMedio;

	private List<Turma> turmas;

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSiglaEscola() {
		return siglaEscola;
	}

	public void setSiglaEscola(String siglaEscola) {
		this.siglaEscola = siglaEscola;
	}

	public boolean isEnsinoPrimario() {
		return ensinoPrimario;
	}

	public void setEnsinoPrimario(boolean ensinoPrimario) {
		this.ensinoPrimario = ensinoPrimario;
	}

	public boolean isEnsinoFundamental() {
		return ensinoFundamental;
	}

	public void setEnsinoFundamental(boolean ensinoFundamental) {
		this.ensinoFundamental = ensinoFundamental;
	}

	public boolean isEnsinoMedio() {
		return ensinoMedio;
	}

	public void setEnsinoMedio(boolean ensinoMedio) {
		this.ensinoMedio = ensinoMedio;
	}

	public List<Turma> getTurmas() {
		if (this.turmas == null) {
			this.turmas = new ArrayList<Turma>();
		}
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	private Escola() {
	}

	public static Escola getInstance() {
		if (escola == null) {
			escola = new Escola();
		}
		return escola;
	}

}
