package project;
//new
public class Pagamentos {
	
	private int tempo;
	private double pagamento;
	private String nome;
	
	public Pagamentos(int tempo, double pagamento, String nome) {
		this.tempo = tempo;
		this.pagamento = pagamento;
		this.nome = nome;
	}

	/**
	 * @return the tempo
	 */
	public int getTempo() {
		return tempo;
	}

	/**
	 * @param tempo the tempo to set
	 */
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	/**
	 * @return the pagamento
	 */
	public double getPagamento() {
		return pagamento;
	}

	/**
	 * @param pagamento the pagamento to set
	 */
	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
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
	
	

}
