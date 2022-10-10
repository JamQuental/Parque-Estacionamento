package project;

public class Aluno {
	private String nome;
	private String carro;
	
	public Aluno(String nome, String carro) {
		this.nome = nome;
		this.carro = carro;
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

	
}
