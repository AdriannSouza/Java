package exerciciogarrafa;

public class Garrafa {
    //Atributos da classe Garrafa
    String cor;
    String tampa;
    String rotulo;
    boolean agua;
    boolean aberta;
    
    void abrir() {
        if (this.aberta == true) {
            //Garrafa fechada
            System.out.println("Abrindo... Garrafa aberta!");
        } 
        else {
            //Garrafa aberta
            System.out.println("Nada a fazer");
        }
    }
}
