package project;

import java.util.ArrayList;

public class GereParque {
	private ArrayList<Aluno> alunos;
	private final double pag = 0.15;

	public GereParque() {
		alunos = new ArrayList<Aluno>();
	}

	/**
	 * 
	 * @param nome
	 * @param carro
	 * 
	 *              metodo para criar aluno
	 */
	public void criarAluno(String nome, String carro) {
		int encontra = 0;
		for (int i = 0; i < alunos.size(); i++) {
			if (!nome.equalsIgnoreCase(alunos.get(i).getNome())) {
				encontra = 1;
			}

		}
		if (encontra == 1) {
			Aluno a = new Aluno(nome, carro);
			encontra = 0;
		}
	}

	public void adicionarPagamento(int tempo, String nome) {
		for (Aluno a : alunos) {
			if (a.getNome().equalsIgnoreCase(nome)) {
				double value = (tempo * pag) / 15;
				a.guardaPagamento(new Pagamentos(tempo,value,nome));
			}
		}
	}

	public void calcularDescontro() {

	}

}
