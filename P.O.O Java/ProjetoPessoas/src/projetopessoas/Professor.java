package projetopessoas;

public class Professor extends Pessoa {
    
    //Atributos
        private float salario;
        private String especialidade;
    
    //Metodos
        public void receberAumento(float aumento) {
        setSalario(salario + aumento);
    }
    
    //Metodos Especiais
        public float getSalario() {
            return salario;
        }

        public void setSalario(float salario) {
            this.salario = salario;
        }

        public String getEspecialidade() {
            return especialidade;
        }

        public void setEspecialidade(String especialidade) {
            this.especialidade = especialidade;
            
    }
    
    
}
