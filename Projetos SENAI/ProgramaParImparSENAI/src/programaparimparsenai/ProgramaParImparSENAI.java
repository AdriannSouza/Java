package programaparimparsenai;

import java.util.Scanner;

public class ProgramaParImparSENAI {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva um numero: ");
        
        int n = teclado.nextInt();
        if (n % 2 == 0) {
            System.out.println("Seu numero e par");
        } else {
            System.out.println("Seu numero e impar");
        }
    }
}
