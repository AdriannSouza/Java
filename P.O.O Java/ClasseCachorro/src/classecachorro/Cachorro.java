
package classecachorro;

public class Cachorro {

   /*Atributos*/
        String raca, nome, porte, racao, cor;
        int idade;
        boolean dormindo;
   
   /*M?todos*/
        public void latir() {
            System.out.println("Woof! Woof!"); 
        }
        
        public void dormir() {
           this.setDormindo(true);
            System.out.println("Pronto, c?o dormindo.");
        }
        
        public void acordar() {
            this.setDormindo(false);
            System.out.println("Voc? acordou o cachorro");
        }
        
        public void darComida() {

            if (this.getDormindo() == true) {
                System.out.println("Cachorro dormindo...espere ele acordar!");
            }
            
            //Pequeno <= Ra??o A
            if (this.getPorte() == "Pequeno") {
                setRacao("Ra??o A");
            }
            
            //M?dio <= Ra??o B
            else if (this.getPorte() == "Media") {
                setRacao("Ra??o B");
            }
            
            //Grande <= Ra??o C
            else if (this.getPorte() == "Grande") {
                setRacao("Ra??o A");
            }
            System.out.println("Seu c?o agora est? alimentado");
        }
        
     public void status() {
            System.out.println("--------------");
            System.out.println("Ra?a: " + getRaca());
            System.out.println("Nome: " + getNome());
            System.out.println("Porte: " + getPorte());
            System.out.println("Ra??o: " + getRacao());
            System.out.println("Cor: " + getCor());
            System.out.println("--------------");
     }    
            
    /*M?todos especiais*/

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorte() {
        return porte;
        this.setRacao();
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getDormindo() {
        return dormindo;
    }

    public void setDormindo(boolean dormindo) {
        this.dormindo = dormindo;
    }

    public String getRacao() {
        return racao;
    }

    public void setRacao(String racao) {
        this.racao = racao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
