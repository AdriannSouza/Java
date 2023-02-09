
package aula06;

public class ControleRemoto implements Controlador {
    //Atributos
        private int volume;
        private boolean ligado;
        private boolean tocando;
    
    //Métodos Especiais
    
        //Construct - Como o objeto vai estar por padrão.
        public ControleRemoto() {

            this.volume = 50;
            this.ligado = false;
            this.tocando = false;

        }

        //Get e Set --- Volume
        private int getVolume() {
            return volume;
        }

        private void setVolume(int volume) {
            this.volume = volume;
        }

        //Get e Set --- Ligado
        private boolean getLigado() {
            return ligado;
        }

        private void setLigado(boolean ligado) {
            this.ligado = ligado;
        }

        //Get e Set --- Tocando
        private boolean getTocando() {
            return tocando;
        }

        private void setTocando(boolean tocando) {
            this.tocando = tocando;
        }

        
    //Métodos Abstratos --- Veio da interface Java
        @Override
        public void ligar() {
            //Ligado <- true
            this.setLigado(true);        
        }

        @Override
        public void desligar() {
            //Ligado <- false
            this.setLigado(false);
        }

        @Override
        public void abrirMenu() {
            //Escrever se está ligado.
            System.out.println("Ligado: " + this.getLigado());
            
            
            //Escrever se está tocando.
            System.out.println("Tocando: " + this.getTocando());
            
            //Escrever o volume.
            System.out.print("Volume: " + this.getVolume());
            
            //Sinaliza o volume.
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
        }

        @Override
        public void fecharMenu() {
            System.out.println("Fechando Menu...");
        }

        @Override
        public void maisVolume() {
            //O volume só pode aumentar se: Ligado <- true
            if (this.getLigado() == true) {
                
                //Definir o volume para: volume atual + 5.
                this.setVolume(this.getVolume() + 5);
            } else {
                System.out.println("Impossível aumentar o volume");
            }
        }

        @Override
        public void menosVolume() {
            //O volume só pode aumentar se: Ligado <- true
            if (this.getLigado() == true) {
                
                //Definir o volume para: volume atual - 5.
                this.setVolume(this.getVolume() - 5);
            } else {
                System.out.println("Impossível diminuir volume");
            }
        }

        @Override
        public void ligarMudo() {
            //Só vai ligar mudo se não estiver mudo.
            if (this.getLigado() && this.getVolume() > 0) {
                this.setVolume(0);
            }
        }

        @Override
        public void desligarMudo() {
            if (this.getLigado() && this.getVolume() == 0) {
                this.setVolume(50);
            }
        }

        @Override
        public void play() {
            if (this.getLigado() == true && !(this.getTocando())) {
                this.setTocando(true);
            }
        }

        @Override
        public void pause() {
            if (this.getLigado() == true && !(this.getTocando() == true)) {
                this.setTocando(false);
        }
     }
}
