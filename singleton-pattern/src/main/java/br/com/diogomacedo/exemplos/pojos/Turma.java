package br.com.diogomacedo.exemplos.pojos;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private String tipoSerie;

	private int serie;

	private String letra;

	private List<Aluno> alunos;

	public String getTipoSerie() {
		return tipoSerie;
	}

	public void setTipoSerie(String tipoSerie) {
		this.tipoSerie = tipoSerie;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public List<Aluno> getAlunos() {
		if (this.alunos == null) {
			this.alunos = new ArrayList<Aluno>();
		}
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return "Turma [tipoSerie=" + tipoSerie + ", serie=" + serie + ", letra=" + letra + ", alunos=" + alunos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alunos == null) ? 0 : alunos.hashCode());
		result = prime * result + ((letra == null) ? 0 : letra.hashCode());
		result = prime * result + serie;
		result = prime * result + ((tipoSerie == null) ? 0 : tipoSerie.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		if (alunos == null) {
			if (other.alunos != null)
				return false;
		} else if (!alunos.equals(other.alunos))
			return false;
		if (letra == null) {
			if (other.letra != null)
				return false;
		} else if (!letra.equals(other.letra))
			return false;
		if (serie != other.serie)
			return false;
		if (tipoSerie == null) {
			if (other.tipoSerie != null)
				return false;
		} else if (!tipoSerie.equals(other.tipoSerie))
			return false;
		return true;
	}

}
