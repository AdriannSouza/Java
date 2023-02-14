
package projetolivro;

public class Livro implements Publicacao {
    
    /*Atributos*/
    
        private String titulo, autor;
        private int totalPaginas, paginaAtual;
        private boolean aberto;
        private Pessoa leitor;
 
        
    /*M?todos*/

        public String detalhes() {
            return "### LIVRO ###" + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nTotalPaginas: " + totalPaginas + "\nPagina Atual: " + getPaginaAtual() + "\nAberto: " + aberto + "\nLeitor: " + leitor.getNome() + "\nIdade: " + leitor.getIdade() + "\nSexo: " + leitor.getSexo();
    }
        
    
        
    /*M?todos Especiais*/
        //Construtor
            public Livro(String titulo, String autor, int totalPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
                this.titulo = titulo;
                this.autor = autor;
                this.totalPaginas = totalPaginas;
                this.paginaAtual = 0;
                this.aberto = false;
                this.leitor = leitor;
    }
        
    

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public int getTotalPaginas() {
            return totalPaginas;
        }

        public void setTotalPaginas(int totalPaginas) {
            this.totalPaginas = totalPaginas;
        }

        public int getPaginaAtual() {
            return paginaAtual;
        }

        public void setPaginaAtual(int pagAtual) {
            this.paginaAtual = paginaAtual;
        }

        public boolean getAberto() {
            return aberto;
        }

        public void setAberto(boolean aberto) {
            this.aberto = aberto;
        }

    @Override
        public void abrir() {
            
            //Aberto
            setAberto(true);
        }

    @Override
        public void fechar() {
            
            //N?O est? aberto
            setAberto(false);
        }

    @Override
        public void folhear(int pagina) {
            this.paginaAtual = pagina;
        }

    @Override
        public void avancarPagina() {
            paginaAtual++;
        }

    @Override
        public void voltarPagina() {
            paginaAtual--;
        }
        
        
}
