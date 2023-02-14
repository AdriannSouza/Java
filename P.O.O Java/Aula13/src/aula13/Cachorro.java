
package aula13;

public class Cachorro extends Lobo {
    
    @Override
    public void emitirSom() {
        System.out.println("Woof! Woof!");
    }
    
    public void reagir(String frase) {
        
        if (frase == "Toma comida" || frase == "Olá")
            
        //Se for uma frase agradável.
        {System.out.println("Abanar e Latir");} 
        
        //Se for uma frase agressiva.
        else {System.out.println("Grrr, cachorro bravo");}
    }
    
    public void reagir(int hora, int min) {
        
        //Se for cedo
        if (hora < 12) 
        {System.out.println("Abanar");} 
        
        //Se for noite
        else if (hora >= 18)
        {System.out.println("Ignorar");} 
        
        //Se não for cedo e nem noite (tarde).
        else
        {System.out.println("Abanar e latir");}
        
    }
    
    public void reagir(boolean dono) {
        
        //Se for o dono.
        if (dono == true) 
        {System.out.println("Dono ->");
         System.out.println("Abanar");
         this.emitirSom();}
        
        //Se não for o dono.
        else
        {System.out.println("Nao e dono ->");
         System.out.println("Rosnar e latir");}
    }
    
    public void reagir(int idade, float peso) {
        
        //Se for novo.
        if (idade < 5) {
            
            //Se for leve.
            if (peso < 10) {System.out.println("Abanar");}
            //Se for pesado.
            else {System.out.println("Latir");}
            
        }
        
        //Se for velho.
        else {
            //Se for leve.
            if (peso < 10)
            {System.out.println("Rosnar");}
            //Se for pesado.
            else {System.out.println("Ignorar");}
    }
  }
 }
