
package aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p) {
        /*Método Construtor, recebe o mesmo nome que a classe.
          Não deve haver void, apenas public Classe()
        */
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        this.cor = "Azul";
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
    public void status() {
        System.out.println("Sobre a caneta: " + this);
       // System.out.println("Modelo: " + this.modelo);
       // System.out.println("Ponta: " + this.ponta);
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
