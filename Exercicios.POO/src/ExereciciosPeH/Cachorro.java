package ExereciciosPeH;

public class Cachorro extends Animal{
	
	private String darPata;

	public Cachorro(String nome, int idade, String som, String acao, String darPata) {
		super(nome, idade, som, acao);
		this.darPata = darPata;
	}

	public String getDarPata() {
		return darPata;
	}

	public void setDarPata(String darPata) {
		this.darPata = darPata;
	}

	public void visualizar()
	{
		super.visualizar();
		System.out.println("\nA ordem do cachorro é: "+this.getDarPata());
	}
	
	
}
