package projetofinal;

public abstract class Pessoa {
    
    /*Atributos*/
    protected String nome, sexo;
    protected  float experiencia;
    protected int idade;
    
    /*Métodos*/
    public void ganharExperiencia() {
        
    }
    
    /*Métodos modificadores*/

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.experiencia = 0;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nPessoa: " +super.toString() + "\nNome: " + nome + "\nSexo: " + sexo + "\nExperiencia: " + experiencia + "\nIdade: " + idade;
    }
    
    
    
}
