
package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 0.5f, "Azul");
        c1.setModelo("Bic");
        //Funciona mesmo com método privado.
        
        /*c1.modelo = "Bic";
            *Funciona se o método for público.*/
        
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
        
        c1.status();
        
        
        Caneta c2 = new Caneta("NIC",0.7f,"Ama relo");
        c2.status();
    }
    
}
