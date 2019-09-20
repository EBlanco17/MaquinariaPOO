
package maquinaria;

import javax.swing.JOptionPane;

/**
 *
 * @author eblanco
 */
public class Maquina{
    private String tiempo;
    private int valorHr;
    //Metodo Constructor

    public Maquina() {
    }
    
    public Maquina(String tiempo, int valorHr) {
        this.tiempo = tiempo;
        this.valorHr = valorHr;
    }
 

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getValorHr() {
        return valorHr;
    }

    public void setValorHr(int valorHr) {
        this.valorHr = valorHr;
    }
    
    
   
    public void calcularPrecio(int valorHr,int tiempo){
        JOptionPane.showMessageDialog(null,"El precio por Hora de la máquina es de: "+valorHr);
        precio=valorHr*tiempo;
        JOptionPane.showMessageDialog(null,"El precio del alquiler de las "+tiempo+" Horas"+"\nes de: "+precio);
        
    }
    public double calcularPromedioDia(int contador){
   costo+=precio;
    double prom=costo/contador;
    return prom;
    }
   int precio=0;
   int costo=0;
}
