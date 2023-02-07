package exerciciogarrafa;

import java.util.Scanner;

public class ExercicioGarrafa {

    public static void main(String[] args) {
        //Permite a entrada de dados.
        Scanner data = new Scanner(System.in);
        
        
        //Cria uma nova instância da classe Garrafa
        Garrafa garrafa = new Garrafa();
        
        //Define os atributos da instância garrafa
        garrafa.cor = "Verde";
        garrafa.tampa = "Vermelha";
        garrafa.rotulo = "Branco";
        
        //Pergunta se tem água
        System.out.println("Tem agua? ");
        
        garrafa.aberta = data.nextBoolean();
        
        //Pergunta se a garrafa está fechada.
        System.out.println("A garrafa esta fechada? ");
        garrafa.agua = data.nextBoolean();
        garrafa.abrir();
    }
}
