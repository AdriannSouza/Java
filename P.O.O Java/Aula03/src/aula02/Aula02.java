package aula02;

public class Aula02 {

    public static void main(String[] args) {
        /*Cria um novo objeto da classe caneta*/
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //privado -> c1.ponta = 0.5f;
        c1.carga = 80;
        //privado -> c1.tampada();
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }  
}
