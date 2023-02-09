
package objetosbanco;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Especiais (get, set, construct).

    /**
     *
     * @param numConta
     * @param tipo
     * @param dono
     * @param saldo
     * @param status
     * @return 
     */
    
    
    /*public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        /*Método construtor, sempre que criar um novo objeto,
        o mesmo receberá os seguintes valores.
        saldo = 0;
        status = false;
    */
    

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    //Métodos 
    
    public void estadoAtual() {
        System.out.println("-------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        
        //Se for Conta Corrente.
        if (tipo == "CC") 
        {
            this.setSaldo(50);
        }
        //Se for Conta Poupança.
        else if (tipo == "CP") 
        {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    
    public void fecharConta() {
        //Se a conta tiver dinheiro
            if (this.getSaldo() > 0) {
                System.out.println("Conta não pode ser fechada porque ainda tem dinheiro!");   
            }
        
        //Se a conta estiver negativa.
            else if (saldo < 0){
                System.out.println("Conta em débito");
            }

        /*Ou seja, se não for maior, nem menor que 0, logo, for 0.
        Conta fechada*/
            else {
                setStatus(false);
            }

            this.status = false;
    }
    
    public void depositar(float valor) {
        //Para depositar a conta deve estar aberta, o que representa isso é a variavel status.
            if (status = true) {
                saldo = saldo + valor;
            }
            else {
            //Não posso depositar caso a conta estiver fechada.
            System.out.println("Impossível depositar. Conta fechada");
        }
    }
    
    public void sacar(float valor) {
        //Para retirar um valor, o saldo
        if (status = true && saldo >= valor){
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void pagarMensal() {
        int v = 0;
        //Se for Conta Corrente
            if (this.getTipo() == "CC")  {
                v = 12;
            } 
        
        //Se for Conta Poupança
            else if (this.getTipo() == "CP") {
                v = 20;
            }
            if (this.status){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            }
    }
}
