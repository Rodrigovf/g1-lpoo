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
public class Motoca {
    
    private int cod;
    private String personagem;
    static private double pBasico;
    
    public Motoca() {
    }

    public Motoca(int cod, String personagem) {
        this.cod = cod;
        this.personagem = personagem;
        
    }
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

   
    public static double getpBasico() {
        return pBasico;
    }

    public static void setpBasico(double pBasico) {
        Motoca.pBasico = pBasico;
    }

    @Override
    public String toString() {
        return "\ncod=" + cod + ", personagem=" + personagem + ", preço=" + pBasico;
    }

   public double motocaValor(){
        return pBasico;
    }
  
    
}
