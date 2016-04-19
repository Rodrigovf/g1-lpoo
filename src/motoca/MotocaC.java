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
public class MotocaC extends Motoca{
    
    private String cor;
    
    public MotocaC(){
        
    }
    
    public MotocaC(int cod, String personagem, String cor){
        super(cod, personagem);
        this.cor = cor;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + " cor=" + cor;
    }
    
    @Override
    public double motocaValor(){        
        return super.motocaValor() + super.motocaValor()*20/100; 
    }
    
}
