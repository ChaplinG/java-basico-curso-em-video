/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testenovo;

/**
 *
 * @author Usuário
 */
public class TesteNovo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double d = Math.pow(8,2);
        
        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        //v2 += --v1;
        //System.out.println("Olá " +v0 +" " +v1 +" " +v2);
        
        //Object[] str = {“a”, “ab”, “abc”};
        //System.out.println("Olá " +v0 +" " +v1 +" " +v2);
        
        int x, y;
        double z;

        x = 5;
        y = 2;
        z = x / y;
        System.out.print(z);
        
    }
    
}
