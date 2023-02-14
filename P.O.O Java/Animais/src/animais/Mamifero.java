package animais;

public class Mamifero extends Animal{
    
    /*Atributos*/
    private String corPelo;
    
    /*Métodos Especiais*/
    @Override
    public void locomover() {
        System.out.println("------------------");
        System.out.println("Correndo!");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamamando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
    
    //Getters e Setters
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    
}
