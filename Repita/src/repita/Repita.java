package repita;
import javax.swing.JOptionPane;


public class Repita {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Olá, mundo!", "Boas vindas", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Você digitou o valor " +n);
        int n, s = 0;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um valor<br>"
                    + "<em>(valor 0 interrompe)</em>: </html>"));
            s += n;
        } while (n != 0);
        
        JOptionPane.showMessageDialog(null, "A soma dos valores é igual a " +s);
        
    }
    
}
