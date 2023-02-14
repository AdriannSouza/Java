package aula13;

public class Mamifero extends Animal{
    
    //Atributos
        protected String corPelo;
    
    //Métodos sobrepostos
        @Override
        public void emitirSom() {
            System.out.println("Som de mamifero");
        }
    
    //Métodos modificadores

        public String getCorPelo() {
            return corPelo;
        }

        public void setCorPelo(String corPelo) {
            this.corPelo = corPelo;
    }
    
    
}
