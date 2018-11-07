package Sys;

public class Disciplina {

	private int id;
	private String acronimo;
	private String nome;
	private String professor;

	public Disciplina(int id, String acronimo, String nome, String professor) {
		this.nome = nome;
		this.acronimo = acronimo;
		this.professor = professor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcronimo() {
		return acronimo;
	}

	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String toString() {
		return "id=" + this.getId() + ", acronimo=" + this.getAcronimo() + ", nome=" + this.getNome() + ", professor="
				+ this.getProfessor();
	}

}
