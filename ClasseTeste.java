public class ClasseTeste {

	public static void main(String[] args) {
		// criando uma inst�ncia do sistema
		Fachada sistema = Fachada.getInstacia();
		// cadastrando disciplinas
		sistema.addDisciplinas(0, null, "APS", "Danielle");
		sistema.addDisciplinas(0, "Programa��o Web", "WEB", "Francisco");
		// vendo se o cadastro est� ok
		sistema.verDisciplinas();
		// cadastrando atividades
		sistema.addAtividades("Projeto de APS", "#projeto", 0);
		sistema.addAtividades("Review de Processos �geis", "#resumo", 0);
		sistema.addAtividades("Prova Final", "#prova", 1);
		// vendo se o cadastro de atividades est� ok
		sistema.verAtividades();
	}
}