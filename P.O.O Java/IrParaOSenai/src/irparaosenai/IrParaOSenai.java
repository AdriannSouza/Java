package irparaosenai;

import java.util.Scanner;

public class IrParaOSenai {

    public static void main(String[] args) {
        //Permite a entrada de dados.
        Scanner teclado = new Scanner(System.in);
        
        //Cria uma instância da Classe SENAI.
        SENAI senai = new SENAI();
        
        //Pergunta se pegou a mochila.
        System.out.println("(Responda com 'true' para SIM e 'false' para NAO.)");
        System.out.println("Voce esta com sua mochila?: ");
        senai.mochila = teclado.nextBoolean();
        
        //Pergunta se tomou banho.
        System.out.println("Voce tomou banho?");
        senai.banho = teclado.nextBoolean();
        
        System.out.println("Voce esta com uma roupa legal?");
        senai.roupa = teclado.nextBoolean();
        senai.transporte();
    }
}
