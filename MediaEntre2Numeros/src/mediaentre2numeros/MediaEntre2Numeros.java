package mediaentre2numeros;

import java.util.Scanner;

public class MediaEntre2Numeros {

    public static void main(String[] args) {
        /*Permite a entrada de dados*/
        Scanner teclado = new Scanner(System.in);
        
        /*Cria duas variáveis float*/
        float n1, n2;
        
        /*Digitar ambos os números e imprimi-los na tela*/
        System.out.print("Digite um numero: ");
        n1 = teclado.nextInt();
        
        System.out.print("Digite outro numero: ");
        n2 = teclado.nextInt();
        
        float media = (n1+n2)/2;
        
        /*Estrutura condional, se a média for maior ou menor a 5*/
        if ((n1 + n2)/2 >= 5)
        {System.out.println("Voce esta APROVADO");} 
        
        else 
        {System.out.println("Voce esta REPROVADO");}
        System.out.println(media);
    }
}
