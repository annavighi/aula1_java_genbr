package java_pratica1;

	import java.util.Scanner;

		public class atividade3 {
	
			public static void main(String[] args) {
				
	Scanner salario = new Scanner(System.in);		
		
		float bruto;
		float noturno;
		float extra;
		float desconto;

			System.out.println("Salário bruto: ");
				bruto = salario.nextFloat();
	
			System.out.println("Adicional noturno: ");
				noturno = salario.nextFloat();
		
			System.out.println("Horas extras: ");
				extra = salario.nextFloat();
		
			System.out.println("Descontos: ");
				desconto = salario.nextFloat();
		
	System.out.println("Salário líquido: " + (bruto+noturno+(extra*5)-desconto));	
	
    salario.close();
			
	}

}
