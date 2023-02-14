package projetopessoas;

public class Aluno extends Pessoa {
    //Atributos
    private String curso;
    private boolean matricula;
    
    //Metodos
    public void cancelarMatricula() {
        System.out.println("Matricula cancelada");
        setMatricula(false);
    }
    
    //Metodos Especiais

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean getMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }
    
}
