/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motoca;

/**
 *
 * @author Comunix
 */
public class MotocaE extends Motoca{
    
    private String voltagem;
    
    public MotocaE(){
    
    }
    
     public MotocaE(int cod, String personagem, String voltagem) {
        super(cod, personagem);
        this.voltagem = voltagem;
    }
    
     
      public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return super.toString() + " voltagem=" + voltagem;
    }
    
    @Override
    public double motocaValor(){        
        return super.motocaValor() + super.motocaValor()*50/100; 
    }
  
}
    
    

