package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        //Pessoa
        p1.setNome("Pedro");
        p1.setSexo("M");
        p1.setIdade(21);
        
        //Aluno
        p2.setNome("Maria");
        p2.setSexo("F");
        p2.setIdade(16);
        p2.setCurso("Inform?tica");
        p2.cancelarMatricula();
        
        //Professor
        p3.setNome("Claudio");
        p3.setSexo("M");
        p3.setIdade(38);
        p3.setSalario(2500.75f);
        p3.receberAumento(550.20f);
        
        //Funcionario
        p4.setNome("Fabiana");
        p4.setSexo("F");
        p4.setIdade(33);
        p4.setSetor("Estoque");
        p4.mudarTrabalho();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
        /*p2.setCurso("Inform?tica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        p1.receberAumento(550.20f);
        p2.mudarTrabalho();
        p4.cancelarMatricula();*/
        
    }
    
}
