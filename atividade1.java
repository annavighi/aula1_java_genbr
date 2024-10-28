	package java_pratica1;

		import java.util.Scanner;
		
	public class atividade1 {

		public static void main(String[] args) {
      
	Scanner valor = new Scanner(System.in);
        
    float salario;
    float abono;
        
        System.out.println("\nDigite o salário: ");
        salario = valor.nextFloat();
                
        System.out.println("\nDigite o abono: ");
        abono = valor.nextFloat();
        
        System.out.println("Novo salário = " + (salario+abono));

        valor.close();
    }
}