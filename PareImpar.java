package estruturaRepetição;
import java.util.Scanner;
public class PareImpar {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.print("Informe um valor: ");
		num = ler.nextInt();
		
        for(int i=num; i<=num; i++) {
        	if (num % 2 == 0)
        		System.out.println("O numero é par");
        	else 
        		System.out.println("O numero é impar");
        }
		ler.close();
	}

}
