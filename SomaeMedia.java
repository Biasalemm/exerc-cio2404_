package estruturaRepetição;
import java.util.Scanner;
public class SomaeMedia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor,soma=0,med;
	    
	    
		for (int i= 0; i<=4; i++) {
		System.out.println("Informe um valor: ");
	    valor = ler.nextInt();
	    soma+= valor;
	    
		}
		med = soma/5;
	    System.out.println("A media foi: " + med);
	    ler.close();
	    
	}

}
