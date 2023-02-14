package aula11;

public class Bolsista extends Aluno {
    /*Atributos*/
    private float bolsa;
    
    /*Métodos*/
    public void RenovarBolsa(){
        System.out.println("Bolsa renovada!");
    }

    /*Métodos Especiais*/
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
    
}
