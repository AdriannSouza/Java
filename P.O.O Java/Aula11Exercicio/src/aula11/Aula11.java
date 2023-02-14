
package aula11;

public class Aula11 {

    public static void main(String[] args) {
        
        //Pessoa < Visitante
        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(16);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        //Pessoa < Aluno
        Aluno a1 = new Aluno();
        a1.setNome("Fernanda");
        a1.setIdade(20);
        a1.setSexo("F");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        //Pessoa < Aluno < Bolsista
        Bolsista b1 = new Bolsista();
        b1.setNome("Mateus");
        b1.setIdade(17);
        b1.setSexo("M");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        
        //Pessoa < Aluno < Tecnico
        Tecnico t1 = new Tecnico();
        t1.setNome("Joao");
        t1.setIdade(22);
        t1.setSexo("M");
        t1.setRegistroProfissional(1234);
        t1.praticar();
        System.out.println(t1.toString());
        
    }
}
