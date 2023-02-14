
package projetofinal;

import java.util.Arrays;


public class ProjetoFInal {

    public static void main(String[] args) {
        
        Video v[] = new Video[3];
            v[0] = new Video("Aula 1 de POO");
            v[1] = new Video("Aula 12 de POO");
            v[2] = new Video("Aula 10 de HTML5");
        
        Aluno a[] = new Aluno[2];
        
        //Nome, sexo, idade, login
            a[0] = new Aluno("Adrian", "M", 17, "adrianfds");
            a[1] = new Aluno("Bianca", "F", 31, "mabifaria");
                
        /*System.out.println(v[0].toString());
        System.out.println(a[0].toString());*/
        
        Visualizacao vis[] = new Visualizacao[5];
        
        vis[0] = new Visualizacao(a[0], v[0]); //Adrian assiste Aula 1 POO
        vis[0].avaliar(87.0f);
        System.out.println(Arrays.toString(vis));
        
        vis[1] = new Visualizacao(a[1], v[1]); //Bianca assiste Aula 12 POO
        System.out.println(vis[1]);
    }
}
