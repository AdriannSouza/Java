package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2023 - nasc;
        System.out.println("Voce tem " + idade + " anos");
        
        if (idade >= 18) {
            //Se for maior ou igual a 18.
            System.out.println("Maior de idade");
        } else {
            //Se for menor que 18.
            System.out.println("Menor de idade");
        }
    }
}
