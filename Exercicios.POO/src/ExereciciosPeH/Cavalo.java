package ExereciciosPeH;

public class Cavalo extends Animal{
	
	private String tipo;

	public Cavalo(String nome, int idade, String som, String acao, String tipo) {
		super(nome, idade, som, acao);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar()
	{
		super.visualizar();
		System.out.println("\nO tipo do cavalo é de: "+this.getTipo());
	}
}
