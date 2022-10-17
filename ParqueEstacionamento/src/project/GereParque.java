package project;

import java.util.ArrayList;

public class GereParque {
	private ArrayList<Aluno> alunos;
	public GereParque() {
		alunos = new ArrayList<Aluno>();
	}
	
	public void criarAluno(String nome, String carro) 
	{
		int encontra = 0;
		for(int i=0;i<alunos.size();i++) 
		{
			if(!nome.equalsIgnoreCase(alunos.get(i).getNome())) 
			{
				encontra = 1;
			}
				
				
		}
		if(encontra == 1) 
		{
			Aluno a = new Aluno(nome,carro);
			encontra = 0;
		}
	}
	
	public void adicionarPagamento(int tempo, String nome) 
	{
		
	}
	
	public void calcularDescontro() {
		
	}

}
