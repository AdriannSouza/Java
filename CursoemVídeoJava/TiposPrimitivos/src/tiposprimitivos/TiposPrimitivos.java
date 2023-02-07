package tiposprimitivos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        
        String nome = "Adrian";
        float nota = (float)8.5;
        System.out.println("A nota e" + nota);
        
        System.out.printf("A nota de %s e %.2f \n", nome, nota);
        //funciona como .forma t
        System.out.format("A nota de %s e %.2f \n", nome, nota);
        //funciona como .printf
    }
    
}
