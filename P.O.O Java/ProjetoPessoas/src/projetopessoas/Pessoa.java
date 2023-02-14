package projetopessoas;

public class Pessoa {
    //Atributos
    private String nome, sexo;
    private int idade;
    
    //Metodos
    public void fazerAniversario() {
        this.idade++;
    }
    
    //Metodos especiais

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "-----------------" + "\nNome: " + getNome() + "\nSexo: " + getSexo() + "\nIdade: " + getIdade();
    }
    
    
    
}
