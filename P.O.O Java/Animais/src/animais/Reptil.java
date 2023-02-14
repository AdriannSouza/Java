package animais;

public class Reptil extends Animal {
    /*Atributos*/
    private String corEscama;

    /*Métodos Especiais*/
    @Override
    public void locomover() {
        System.out.println("------------------");
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
    
    //Getters e Setters
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}
