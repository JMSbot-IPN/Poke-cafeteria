/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

/**
 *
 * @author jessl
 */
public enum Tamaño {
    CHICO(20.00),
    MEDIANO(24.00),
    GRANDE(28.00);
    private double Precio;
    
    private Tamaño(double a){
        this.Precio = a;
    }

    public double getPrecio() {
        return Precio;
    }
    
}
