package comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Chaplin";
        String nome2 = "Chaplin";
        String nome3 = new String("Chaplin");
        
        String res = (nome1==nome2)?"igual":"diferente";
        
        String resO = (nome1==nome3)?"igual":"diferente";
        //Compara o elemento, mas não o conteúdo. A estrutura da instância de objetos com new é diferente
        
        String resC = (nome1.equals(nome3))?"igual":"diferente";
        //Compara o conteúdo dos objetos e não a estrutura da instância, "Chaplin" e "Chaplin" são iguais
        
        System.out.println(res);
        System.out.println(resO);
        System.out.println(resC);
        
    }
    
}
