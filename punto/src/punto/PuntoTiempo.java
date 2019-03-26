/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto;

/**
 *
 * @author CT7-PC18
 */
public class PuntoTiempo extends Punto{
    private int T; 
    public PuntoTiempo PuntoEspacial; 
    public void CargaPE(){ 
        PuntoEspacial = new PuntoTiempo( 
            super.GetX()+2,
            super.GetY()+2,
             T+2      
        );
    } 
    public PuntoTiempo(){this(0,0,0);} 
    public PuntoTiempo(int x, int y, int t){ 
        super(x,y); 
        SetT(t);
    } 
    public void SetT(int t){T = t;} 
    public int GetT(){return T;} 
    public double velocidad(){ 
        return Modulo() / GetT();
    }

   
}
