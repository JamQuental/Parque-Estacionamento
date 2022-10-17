package project;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private String carro;
	private ArrayList<Pagamentos> pagamentos;
	
	public Aluno(String nome, String carro) {
		this.nome = nome;
		this.carro = carro;
		pagamentos = new ArrayList<Pagamentos>();
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the carro
	 */
	public String getCarro() {
		return carro;
	}

	/**
	 * @param carro the carro to set
	 */
	public void setCarro(String carro) {
		this.carro = carro;
	}
	
	public void guardaPagamento(Pagamentos newPag) {
		pagamentos.add(newPag);

	}

	
}
