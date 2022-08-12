package Exercicio1;

public class Cliente {
	
	private String nome;
	private String email;
	private int telefone;
	private String cidade;
	
	public Cliente(String nome, String email, int telefone, String cidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cidade = cidade;
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

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void visualizar()
	{
		System.out.println("Nome do cliente: "+this.nome);
		System.out.println("Email do cliente: "+this.email);
		System.out.println("Telefone do cliente: "+this.telefone);
		System.out.println("Cidade do cliente: "+this.cidade);
	}

}
