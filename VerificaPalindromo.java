package palavrapalindroma;

import java.util.Scanner;

public class VerificaPalindromo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a palavra a ser verificada: ");
		String palavra = ler.nextLine();
		String palindromo = "";
		
		for(int i = palavra.length() -1; i >= 0; i--){
			
			palindromo += palavra.charAt(i);

		}
		if(palindromo.equals(palavra)) {
			System.out.print("A palavra inserida é um palíndromo!" + "\n" + palindromo);
		}
		else {
			System.out.print("A palavra inserida não é um palíndromo!" + "\n" + palindromo);
			
		}
		ler.close();
	}

}