package estruturaRepetição;
import java.util.Scanner;
public class fatorialteste {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int fat=1;
		
		for (int i= 1; i<=10; i++) {
		fat *= i;		
	    System.out.println("Fatorial de " +i + "=" + fat);
	
			
			
		}
		ler.close();
		
		
	
		
		
		
		
		
		
	}

}
