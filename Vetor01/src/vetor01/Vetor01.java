/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author Usuário
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //int n[] = new int[4];
        int n[] = {1,2,3,4}; //ainda cria um objeto dessa forma, mesmo sem "new"
        
        System.out.println(n[2]);
        
        System.out.println("Total de casas do vetor: " +n.length);
        
        //for (int c=0; c<=3; c++){}
        for(int c=0; c<=n.length-1; c++){
            System.out.println(n[c]);
        }
        
        
        
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        String tot[] = {"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
        
        for(int c=0; c<mes.length; c++){
            System.out.println("O mês de " +mes[c] +" tem o total de " +tot[c] +" dias.");
        }
        
        
        //for(int valor:num){} Declara uma variável dentro, do mesmo tipo que o objeto a ser mostrado
        double num[] = {3,5,2.75,9,-4.5};
        int pos = Arrays.binarySearch(num, 9);
        System.out.println("Valor encontrado na posição " +pos);
        //Se não tiver o valor, ele transforma o número procurado em negativo, pois não existe índice negativo
        
        for(double valor:num){
            System.out.println(valor);
        }
        
        Arrays.sort(num);
        
        for(double valor:num){
            System.out.println(valor);
        }
        
        
        Arrays.fill(num, 9);
        for(double valor:num){
            System.out.println(valor);
        }
    }
    
}
