package ExercicioCollections;
import java.util.*;
import java.util.Collections;
public class Estoque {

	public static void main (String args[])
	{
		List<String> estoque = new ArrayList<>();
		estoque.add("Camista PP");
		estoque.add("Camisa P");
		estoque.add("Camisa M");
		estoque.add("Camisa G");
		estoque.add("Camisa GG");
		
		System.out.println(estoque);
		estoque.set(estoque.indexOf("Camisa P"),"Camisa PP");
		estoque.remove((estoque.get(2)));
		System.out.println(estoque);
		System.out.println(Collections.max(estoque));
	}
}
