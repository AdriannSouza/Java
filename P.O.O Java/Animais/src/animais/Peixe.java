package animais;

public class Peixe extends Animal{
    
    //Atributos
    private String corEscama;
    
    //Metodos
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }
    
    //Métodos Sobrepostos
    @Override
    public void locomover() {
        System.out.println("------------------");
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }
    
    //Getters e Setters

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
