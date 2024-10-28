package java_pratica1;

	import java.util.Scanner;

		public class atividade4 {
	
			public static void main(String[] args) {
				
	Scanner numero = new Scanner(System.in);		
		
		float numero1;
		float numero2;
		float numero3;
		float numero4;
		
	System.out.println("Valor 1: ");
		numero1 = numero.nextFloat();
		
	System.out.println("Valor 2: ");
		numero2 = numero.nextFloat();
		
	System.out.println("Valor 3: ");
		numero3 = numero.nextFloat();
		
	System.out.println("Valor 4: ");
		numero4 = numero.nextFloat();
		
		System.out.println("Diferença: " + ((numero1*numero2)-(numero3*numero4)));
		
        numero.close();
		
	}

}
