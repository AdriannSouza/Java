
package relacionamentoentreclasses;

public class Lutador {

/*Atributos*/
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
/*Métodos*/
    
    public void apresentar() {
        /*Exibir: nome / nacionalidade / idade / altura /peso / 
        categoria / vitorias / derrotas / empates*/
        System.out.println("------------------------------------");
        System.out.println("Apresentamos o lutador " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura() + " metros");
        System.out.println("Pesando: " + this.getPeso() + " Kg ");
        System.out.println("Peso: " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }
    
    public void status() {
        //Apresentação mais curta.
        System.out.println(this.getNome()+ " é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empate(s)");
    }
    
    public void ganharLuta() {
        //Adiciona +1 na variável vitorias.
        this.setVitorias(vitorias += 1);
    }
    
    public void perderLuta() {
        //Adiciona +1 na variável derrotas.
        this.setVitorias(derrotas += 1);
    }
    
    public void empatarLuta() {
        //Adiciona +1 na variável empates.
        this.setEmpates(empates += 1);
    }
    
    
/*Métodos especiais*/
        
    //Construtor
    
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {

        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        this.categoria = categoria;
        
        //Se tiver menos que 52.2.
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        }
        
        //Peso leve.
        else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }
        
        //Peso médio.
        else if (this.peso <= 83.9){
            this.categoria = "Médio";
        }
        
        //Peso pesado.
        else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        } 
        
        //Se não for nenhuma das alternativas
        else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
        
}

