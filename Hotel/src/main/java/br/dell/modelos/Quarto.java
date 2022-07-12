package br.dell.modelos;
/**
 *
 * @author Iris Mayara
 */
public class Quarto {
    private int numero;
    private Hospede hospede;
    
    public Quarto(int numero, Hospede hospede){
        this.numero = numero;
        this.hospede = hospede;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public Hospede getHospede(){
        return this.hospede;
    }
    
    public void setHospede(Hospede hospede){
        this.hospede = hospede;
    }
}