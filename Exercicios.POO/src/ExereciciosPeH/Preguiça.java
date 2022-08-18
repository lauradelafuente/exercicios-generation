package ExereciciosPeH;

public class Pregui�a extends Animal {
	
	private String habitat;

	public Pregui�a(String nome, int idade, String som, String acao, String habitat) {
		super(nome, idade, som, acao);
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public void visualizar()
	{
		super.visualizar();
		System.out.println("\nO habitat da pregui�a �: "+this.getHabitat());
	}

}
