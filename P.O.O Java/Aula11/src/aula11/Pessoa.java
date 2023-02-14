package aula11;



public abstract class Pessoa {
    //Por ser uma classe abstrata, a mesma não pode ser instaciada.
    
    /*Atributos*/
        private String nome;
        private String sexo;
        private int idade;
    
    /*Métodos*/
        public final void fazerAniversario() {
        this.idade++;
    }
    
    /*Métodos Especiais*/

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

    @Override
        public String toString() {
        return "\n### Pessoa ###" + "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade;
    }
        
        
    
}
