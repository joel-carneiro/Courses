package function;

import java.util.Arrays;
import java.util.List;

public class TryForEach {
	public static void main(String[] args) {
		List<String> emplooyers = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		// Forma tradicional
		for (String emplooyer : emplooyers) {
			System.out.println(emplooyer);
		}
		
		// Forma abreviada
		emplooyers.forEach((name) -> System.out.println(name));
		
		// Forma simplificada
		emplooyers.forEach(System.out::println);
	}
}