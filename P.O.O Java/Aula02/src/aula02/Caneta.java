
package aula02;

public class Caneta {
    //Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //Métodos
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Esta tampada? " + this.tampada);
    }
    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Nao posso rabiscar");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
}
