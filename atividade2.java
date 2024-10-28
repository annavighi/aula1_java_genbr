package java_pratica1;

	import java.util.Scanner;

		public class atividade2 {

	public static void main(String[] args) {

	Scanner nota = new Scanner(System.in);		
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;

		System.out.println("\nNota 1: ");
		nota1 = nota.nextFloat();

		System.out.println("\nNota 2: ");
		nota2 = nota.nextFloat();
		
		System.out.println("\nNota 3: ");
		nota3 = nota.nextFloat();
		
		System.out.println("\nNota 4: ");
		nota4 = nota.nextFloat();
		
	System.out.println("Média final: " + ((nota1+nota2+nota3+nota4)/4));

    nota.close();
	
	}

}
