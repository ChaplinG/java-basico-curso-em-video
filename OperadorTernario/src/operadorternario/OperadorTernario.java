package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {
        
        int n1 = 2, n2 = 4;
        
        String res = (n1>n2)?"maior":"menor";        
        System.out.println(res);
        
        int resS = (n1>n2)?n1+n2:n1-n2;
        System.out.println(resS);
        
    }
    
}
