import java.util.ArrayList;
import java.util.List;

import Sys.Atividade;
import Sys.Disciplina;

@SuppressWarnings("unused")
public class Fachada {

	private ArrayList<Atividade> atividades;
	private ArrayList<Disciplina> disciplinas;

	private static Fachada instancia = null;

	private Fachada() {
		this.atividades = new ArrayList<Atividade>();
		this.disciplinas = new ArrayList<Disciplina>();
	}

	public static Fachada getInstacia() {
		if (instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}

	public void verDisciplinas() {
		for (Disciplina disciplinas : disciplinas) {
			System.out.println(disciplinas);
		}
	}

	public void verAtividades() {
		for (Atividade atividades : atividades) {
			System.out.println(atividades.toString());
		}

	}

	public void addDisciplinas(int id, String acronimo, String nome, String professor) {
		Disciplina disc = new Disciplina(id, acronimo, nome, professor);
		this.disciplinas.add(disc);

	}

	public void addAtividades(String nome, String tipo, int id) {
		Atividade ativ = new Atividade(nome, tipo, id, null);
		this.atividades.add(ativ);

	}

	
}
