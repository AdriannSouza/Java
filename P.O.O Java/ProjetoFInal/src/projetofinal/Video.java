
package projetofinal;


public class Video implements AcoesVideo{
    
    /*Atributos*/
        private String titulo;
        private int avaliacao;
        private int views, curtidas;
        private boolean reproduzindo;
    
    /*Métodos Sobrescritos*/
        
    @Override
    public void play() {
        setReproduzindo(true);
        System.out.println("Video Iniciado!");
    }

    @Override
    public void pause() {
        setReproduzindo(false);
        System.out.println("Video Pausado!");
    }

    @Override
    public void like() {
        this.curtidas++;
    }
    
    /*Método construtor*/

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    
    /*Métodos modificadores*/
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "\n### Video ###" + "\nTitulo: " + titulo + "\nAvaliacao: " + avaliacao + "\nViews: " + views + "\nCurtidas: " + curtidas + "\nReproduzindo: " + reproduzindo;
    }
    
    
    
}
