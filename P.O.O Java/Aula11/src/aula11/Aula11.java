package aula11;

public class Aula11 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(16);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Fernanda");
        a1.setIdade(20);
        a1.setSexo("F");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Mateus");
        b1.setIdade(17);
        b1.setSexo("M");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
    
    }
}
