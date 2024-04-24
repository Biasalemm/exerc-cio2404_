package estruturaRepetição;
import java.util.Scanner;
public class PareseImpares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor=0,somapar=0,somaimpar=0;
		
		for (int i= 1; i<=10; i++) {
		System.out.println("Informe um valor inteiro: ");
		valor = ler.nextInt();
		if(valor % 2 == 0) {
		somapar++;
		}
		else { 
		    somaimpar++;
		   }
		
		}
		System.out.println("Os numeros impares são " +somaimpar);
		ler.close();
		System.out.println("Os numeros pares são " +somapar);
		ler.close();
		
		
		}
	}
		
		
