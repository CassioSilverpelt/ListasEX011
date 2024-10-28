package model;

public class Cadastro {
	
	private String cpf;
	private String nome;
	private int idade;
	private double limiteCredito;
	
	public Cadastro(String cpf, String nome, int idade, double limiteCredito) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.limiteCredito = limiteCredito;
	}
	
	public Cadastro() {
		this("","",0,0);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double d) {
		this.limiteCredito = d;
	}
	
	public String toString() {
		String cadastro = cpf+";"+nome+";"+limiteCredito;
		return cadastro;
	}
	
}
