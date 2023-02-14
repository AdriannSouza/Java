package animais;

public class Animais {

    public static void main(String[] args) {
        
        //Animal < Mamifero
        Mamifero m = new Mamifero();
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
            //Animal < Mamifero < Canguru
            Canguru canguru = new Canguru();
            canguru.setPeso(55.40f);
            canguru.setIdade(3);
            canguru.setMembros(4);
            canguru.locomover();
            canguru.alimentar();
            canguru.emitirSom();
            canguru.usarBolsa();
            
            //Animal < Mamifero < Cachorro
            Cachorro cachorro = new Cachorro();
            cachorro.setPeso(3.94f);
            cachorro.setIdade(5);
            cachorro.setMembros(4);
            cachorro.locomover();
            cachorro.alimentar();
            cachorro.emitirSom();
            cachorro.abanarRabo();
            cachorro.latir();
            cachorro.enterrarOsso();
            
        //Animal < Peixe
        Peixe p = new Peixe();
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        
        //Animal < Ave
        Ave a = new Ave();
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        
        //Animal < Reptil
        Reptil r = new Reptil();
        r.setPeso(0.89f);
        r.setIdade(2);
        r.setMembros(2);
        r.locomover();
        r.alimentar();
        r.emitirSom();
        
    }
    
}
