package function;

public class TryFunctions {
	public static void main(String[] args) {
		Calculator calculator = (x, y) -> {return x + y;};
		System.out.println(calculator.execute(77, 33));
		
		calculator = (x, y) -> x * y;
		System.out.println(calculator.execute(77, 33));
		
	}
}