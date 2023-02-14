package projetopessoas;

public class Funcionario extends Pessoa {
    
    //Atributos
    private boolean trabalhando;
    private String setor;
    
    //M?todos
    public void mudarTrabalho() {
        setTrabalhando(!this.getTrabalhando());
    }
    
    //M?todos Especiais
    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    
}
