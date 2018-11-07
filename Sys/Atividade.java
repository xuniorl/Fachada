package Sys;

public class Atividade {

	private int id;
	private String nome;
	private String tipo;
	private Disciplina disciplina;

	public Atividade(String nome, String tipo, int id, Disciplina disciplina) {
		this.setId(id);
		this.setNome(nome);
		this.setTipo(tipo);
		this.setDisciplina(disciplina);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String toString() {
		return "id=" + this.getId() + ", nome=" + this.getNome() + ", tipo=" + this.getTipo();

	}

}