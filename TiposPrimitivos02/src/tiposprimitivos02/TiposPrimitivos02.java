package tiposprimitivos02;

import java.util.Scanner;

public class TiposPrimitivos02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva seu nome:"); //Imprime uma mensagem na tela.
        String nome = teclado.nextLine(); //Permite que o usuário escreva.
        
        System.out.println("Agora me diga sua nota:"); //Imprime uma mensagem na tela.
        float nota = teclado.nextFloat(); //Permite que o usuário escreva um número float.
        
        System.out.format("A nota de %s e %.2f \n", nome, nota);
    }
    
}
