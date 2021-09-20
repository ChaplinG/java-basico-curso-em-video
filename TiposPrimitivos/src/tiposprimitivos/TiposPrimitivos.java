package tiposprimitivos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        float nota = 8.5f;
        String nome = "Gabriela";
        
        System.out.println("A nota de " +nome +" é " +nota);
        System.out.printf("A nota é %.2f \n", nota);
        System.out.format("A nota de %s é %.1f \n", nome, nota);
        
        int idade = 22;
        String valor = Integer.toString(idade);
        System.out.print("Idade: " +valor);
        
        String ano = "98";
        int nasc = Integer.parseInt(ano);
        System.out.println("Ano de nascimento: " +nasc);
        
        String altura = "1.75";
        float h = Float.parseFloat(altura);
        System.out.println("Altura (em m): " +h);
        //System.out.println("%.2f", h); NÃO DEU CERTO
        
        
    }
    
}
