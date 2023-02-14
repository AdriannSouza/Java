package animais;

public class Canguru extends Mamifero {
    //Métodos
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
    
    //Métodos sobrescritos
    @Override
    public void locomover() {
        System.out.println("------------------");
        System.out.println("Saltando");
    }
 
}
