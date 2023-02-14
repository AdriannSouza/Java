
package projetofinal;

public class Visualizacao {
    /*Atributos*/
    
        private Aluno espectador;
        private Video filme;

    /*Construtor*/
        
        public Visualizacao(Aluno espectador, Video filme) {
            this.espectador = espectador;
            this.filme = filme;
            this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
            this.filme.setViews(this.filme.getViews() + 1);
    }
    
    /*Métodos sobrecarregados*/
        public void avaliar() {
            this.filme.setAvaliacao(5);
        }
        
        public void avaliar(int nota) {
            this.filme.setAvaliacao(nota);
        }
        
        public void avaliar(float porcentagem) {
            int tot;
            if (porcentagem <= 20) {
                tot = 3;
            } else if (porcentagem <= 50) {
                tot = 5;
            } else if (porcentagem <= 90) {
                tot = 8;
            } else {
                tot = 10;
            }
            this.filme.setAvaliacao(tot);
        }
    
    /*Getters e Setters*/
        public Aluno getEspectador() {
            return espectador;
    }

        public void setEspectador(Aluno espectador) {
            this.espectador = espectador;
    }

        public Video getFilme() {
            return filme;
    }

        public void setFilme(Video filme) {
            this.filme = filme;
    }

    /*toString*/
    @Override
        public String toString() {
            return "\n### Visualizacao ###" + "\nEspectador: " + "\nTotal assistido: " + this.espectador.getTotalAssistido() + espectador + filme;
    }
    
    
    
}
