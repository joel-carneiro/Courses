public class TestaCondicoes {
	public static void main(String[] args) {
		System.out.println("Testando condicionais!");
		
		int idade = 16;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
		}
		
		else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 mas pode entrar!");
			}
			
			else {
			System.out.println("Você é menor de idade!");
			}
		}
	}
}
