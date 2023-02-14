package relacionamentoentreclasses;

import java.util.Random;

public class Luta {
    /*Atributos*/
    
       //As variáveis "desafiado" e "desafiante" agora são uma instância da classe Lutador.
        private Lutador desafiado, desafiante;
        private int rounds;
        private boolean aprovada;
    
    /*Métodos*/
        /*Só pode acontecer se estiver aprovada*/
        /*Só pode ter como resultado => Vitória de um lutador ou empate*/
        
        public void marcarLuta(Lutador l1, Lutador l2){
            
            /*Apenas se forem lutadores de mesma categoria*/
            /*Desafiado e desafiante não podem ser o mesmo lutador*/
            
            if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
                this.setAprovada(true);
                this.setDesafiado(l1);
                this.setDesafiante(l2);
            } 
            
            //Senão forem da mesma categoria e sejam lutadores diferentes.
            else {
                this.aprovada = false;
                this.desafiado = null;
                this.desafiante = null;
            }
                
    }
        public void lutar(){
            
          //Só acontece se a luta for aprovada.
            if (getAprovada() == true) {
                
                System.out.println("### DESAFIO ###");
                
          /*Desafiado e Desafiante são objetos da classe Lutador, logo podem utilizar
          os métodos de sua respectiva classe*/
                System.out.println("### DESAFIADO ###");
                this.getDesafiado().apresentar();
                
                System.out.println("### DESAFIANTE ###");
                this.getDesafiante().apresentar();
                
          //Ele aleatoriza o resultado de 0 a 2      
                Random aleatorio = new Random();
                
                int vencedor = aleatorio.nextInt(3); // 0 1 2
                    System.out.println("===== RESULTADO DA LUTA");
                    switch(vencedor) {
                        case 0: //Empate
                            System.out.println("Empatou!");
                            this.getDesafiante().empatarLuta();
                            this.getDesafiado().empatarLuta();
                            break;

                        case 1: //Desafiado vence
                            System.out.println("Vitoria de: " + this.getDesafiado().getNome());
                            this.getDesafiado().ganharLuta();
                            this.getDesafiante().perderLuta();
                            break;

                        case 2: //Desafiante vence
                            System.out.println("Perdeu para " + this.getDesafiante().getNome());
                            this.getDesafiante().ganharLuta();
                            this.getDesafiado().perderLuta();
                            break;
                    }
                
            } else {
                System.out.println("A luta não pode acontecer");
                
        }
    }
    
    /*Métodos Especiais*/

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
        
    }


