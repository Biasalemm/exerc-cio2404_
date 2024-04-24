package estruturaRepetição;
import java.util.Scanner;
public class fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int fat=1;
		
		System.out.print("Informe um numero: ");
		int num = ler.nextInt();
		System.out.println(" ");
		
		for (int i = 1; i <= num; i++) {
		fat *=i;	
		System.out.println( i + "!= " + fat);	
			
		}
		ler.close();
		
	}

}
