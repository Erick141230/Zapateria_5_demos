/**
 * Write a description of class Zapateria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Zapateria
{
    private final String nit;
    private String nombreZapateria;
    private String direccion;
    private ArrayList Zapatos;
    
    public Zapateria(String nit, String nombreZapateria, String direccion){
        if (nit != null) this.nit = nit;
        else this.nit = "";
        setNombreZapateria (nombreZapateria);
        setDireccion (direccion);
        Zapatos = new ArrayList();
    }
    
    public String getNit(){
        return nit;
    }
    
    
    public String getNombreZapateria (){
        return nombreZapateria;
    }
    public void setNombreZapateria (String nombreZapateria){
        if(nombreZapateria != null) this.nombreZapateria = nombreZapateria; 
        else this.nombreZapateria = "";    
    }
    
    
    public String getDireccion (){
        return direccion;
    }
    public void setDireccion (String direccion){
        if(direccion != null) this.direccion = direccion; 
        else this.direccion = "";
    }
    
    
    public int valorTotal(){
        int valorTotal = 0;
        for (int i = 0; i < Zapatos.size(); i++){
            valorTotal += ((ClaseAtri)Zapatos.get(i)).ValorTot();
        }
        return valorTotal;
    }
    
    
    public void adicionarZapa(String materiall1, int numZapatos, int num, int costos)throws Exception{
        Zapatos.add (new MaterialCuero(materiall1, numZapatos, num, costos));
    }
    
    
    public void adicionarZapa(int numZapatos2 ,String materiall2, int num, int costos)throws Exception{
        Zapatos.add (new MaterialSinte(numZapatos2, materiall2, num, costos));
    }
    
    
    public void adicionarZapa(int numZapatos3, int num, String materiall3, int costos)throws Exception{
        Zapatos.add (new MaterialCaucho(numZapatos3, num, materiall3, costos));
    }
}
