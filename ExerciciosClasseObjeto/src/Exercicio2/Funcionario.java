package Exercicio2;

public class Funcionario {
	
	private String empresa;
	private String nome;
	private String funcao;
	private int salario;
	
	public Funcionario(String empresa, String nome, String funcao, int salario) {
		super();
		this.empresa = empresa;
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
	}
	
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public void visualizar()
	{
		System.out.println("Nome da empresa: "+this.empresa);
		System.out.println("Nome do(a) funcnionário(a): "+this.nome);
		System.out.println("Função do(a) funcnionário(a): "+this.funcao);
		System.out.println("Salário do(a) funcnionário(a): R$"+this.salario);
	}
}
