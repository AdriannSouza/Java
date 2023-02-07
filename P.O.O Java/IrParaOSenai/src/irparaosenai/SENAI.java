package irparaosenai;

public class SENAI {
    //Criando os atributos da minha classe SENAI
    boolean mochila;
    boolean banho;
    boolean roupa;
    
    void transporte() {
        //Se estiver sem mochila
        if (mochila == false) {
            System.out.println("Volte para casa, voce esqueceu sua MOCHILA!");
            mochila = true;
	}
        
        //Se não tiver tomado banho
	else if (banho == false) {
            System.out.println("Volte para casa e tome BANHO!");
            banho = true;
	}
        
        //Caso não estiver com uma roupa apresentável
	else if (roupa == false){
            System.out.println("Volte para casa e ponha uma ROUPA apresentável");
            roupa = true;
	} else {
            System.out.println("BOA AULA!");
        }
      }
    }