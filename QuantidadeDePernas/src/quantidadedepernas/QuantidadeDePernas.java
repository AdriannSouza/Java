package quantidadedepernas;

import java.util.Scanner;

public class QuantidadeDePernas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva quantas pernas: ");
        int pernas = teclado.nextInt();
        String tipo; //Define uma variável para atribuir um valor após.
        
        //Define um parâmetro para analizar, e depois passa para um processo para ver aonde a condição se satisfaz.
        switch (pernas) {
            case 1: tipo = "Saci";
            break;
            case 2: tipo = "Bipede";
            break;
            case 4: tipo = "Quadrupede";
            break;
            case 6, 8: tipo = "Aracnideo";
            break;
            default: tipo = "Desconhecido";         
        }
        System.out.println(tipo);
    }
    
}
