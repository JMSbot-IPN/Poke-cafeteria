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
public abstract class CafeBase {

    private Tamaño tam;
    private TipoLeche leche;
    private double SaborExtra;
    private double CoffeeShots;
    private double Total;
    
    public CafeBase() {
        
    }

    public Tamaño getTam() {
        return tam;
    }

    public void setTam(Tamaño tam) {
        this.tam = tam;
    }

    public TipoLeche getLeche() {
        return leche;
    }

    public void setLeche(TipoLeche leche) {
        this.leche = leche;
    }

    public double getSaborExtra() {
        return SaborExtra;
    }

    public void setSaborExtra(double SaborExtra) {
        this.SaborExtra = SaborExtra;
    }

    public double getCoffeeShots() {
        return CoffeeShots;
    }

    public void setCoffeeShots(double CoffeeShots) {
        this.CoffeeShots = CoffeeShots;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
}
