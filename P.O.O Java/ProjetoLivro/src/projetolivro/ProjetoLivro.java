
package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Adrian", 17, "M");
        p[1] = new Pessoa("Bianca", 31, "F");
        
        //titulo, autor, totalpaginas, paginaatual, aberto, leitor
        l[0] = new Livro("Aprendendo Java", "Gustavo Guanabara", 210, 5, true, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Jos? da Silva", 162, 54, false, p[1]);
        l[2] = new Livro("Java Avan?ado", "Maria Candido", 800, 437, false, p[0]);
        
        l[0].abrir();
        l[0].folhear(10);
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());

    }
    
}
