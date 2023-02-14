
package projetofinal;

public class Aluno extends Pessoa{
    
    /*Atributos*/
        private String login;
        private int totalAssistido;

    /*Métodos*/
        public void viuMaisUm() {
        
    }
    
    /*Getters e Setters*/

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getTotalAssistido() {
            return totalAssistido;
        }

        public void setTotalAssistido(int totalAssistido) {
            this.totalAssistido = totalAssistido;
        }
    
    /*Construtor*/
        public Aluno(String nome, String sexo, int idade, String login) {
            super(nome, sexo, idade);
            this.login = login;
            this.totalAssistido = 0;
    }

    @Override
    public String toString() {
        return "Aluno{" + "login=" + login + ", totalAssistido=" + totalAssistido + '}';
    }
        
        
    
    
}
