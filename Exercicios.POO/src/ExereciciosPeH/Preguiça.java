package ExereciciosPeH;

public class Preguiça extends Animal {
	
	private String habitat;

	public Preguiça(String nome, int idade, String som, String acao, String habitat) {
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
		System.out.println("\nO habitat da preguiça é: "+this.getHabitat());
	}

}
