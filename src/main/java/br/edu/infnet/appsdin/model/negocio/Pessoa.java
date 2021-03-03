package br.edu.infnet.appsdin.model.negocio;

public class Pessoa {

	private int id;
	private String nome;
	private String email;
	private float salario;
	private int qtdeMeses;

	public Pessoa() {
		
	}
	public Pessoa(String nome, String email) {
		this();
		this.nome = nome;
		this.email = email;
	}
	public Pessoa(String nome, String email, float salario, int qtdeMeses) {
		this(nome, email);
		this.salario = salario;
		this.qtdeMeses = qtdeMeses;
	}
	
	public float calcularSalarioAnual() {
		return this.salario * this.qtdeMeses;
	}
	
	@Override
	public String toString() {
		return this.nome + " - " + 
	           this.email + " - " + 
			   this.salario + " - " + 
	           this.qtdeMeses + " = " +
			   this.calcularSalarioAnual();
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getQtdeMeses() {
		return qtdeMeses;
	}
	public void setQtdeMeses(int qtdeMeses) {
		this.qtdeMeses = qtdeMeses;
	}
}