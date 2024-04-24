package estruturaRepetição;
import java.util.Scanner;
public class JXA {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int func,salfunc=0,medsal=0,sal;;
       
        System.out.print("Informe quantos funcionários possui na empresa: ");
        func = ler.nextInt();

        for (int i=1; i<=func; i++) {	
        System.out.print("Informe o salario de cada funcionário: ");
        sal = ler.nextInt();
        salfunc+= sal;
        }
        medsal= salfunc/func;
        System.out.print("A media salarial da empresa é " + medsal + " reais");
        ler.close(); 
	}

}
