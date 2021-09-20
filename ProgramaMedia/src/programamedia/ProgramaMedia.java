package programamedia;
import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float n1 = ler.nextFloat();
        float n2 = ler.nextFloat();
        
        float m = (n1+n2)/2;
        
        System.out.println("Média: " +m);
        if(m>9)System.out.println("Parabéns!");
        //Estrutura de controle condicional simples
    }
    
}
