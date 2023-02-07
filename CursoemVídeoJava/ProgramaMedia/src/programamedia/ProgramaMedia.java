package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner teclado = new Scanner(System.in); //Permite a entrada de dados.
        System.out.print("Digite sua primeira nota: "); //Imprime a mensagem.
       float n1 = teclado.nextFloat();
        System.out.print("Digite sua segunda nota: ");
       float n2 = teclado.nextFloat();
       float m = (n1 + n2)/2;
        System.out.println("Sua media foi " + m);
        if (m>9) {
            //Se o aluno tirar mais que 9.
            System.out.println("Parabens!");
        }
        if (m <= 4){
            //Se o aluno tirar menos que 4
            System.out.println("Reprovado!");
        }
    }
}
