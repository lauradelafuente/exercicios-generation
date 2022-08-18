	package ExereciciosPeH;

public class TestaAnimal {
	
	public static void main (String args[])
	{
		Cachorro chorro = new Cachorro ("Cachorro", 2,"AuAu","Correr","Dar a pata");
		chorro.visualizar();
		
		Cavalo valo = new Cavalo ("Cavalo",6,"IIIHIIHI","Correr","Corrida");
		valo.visualizar();
		
		Preguiça iça = new Preguiça ("Preguiça", 8, "ZzzzzZzz","Subir em árvores","Floresta");
		iça.visualizar();
		
	}

}
