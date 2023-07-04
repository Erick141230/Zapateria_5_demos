
/**
 * Write a description of class Zapateria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zapateria
{
    private final String nit;
    private String nombreZapateria;
    private String direccion;
    private ClaseAtri[] atributos;
    private int numZapatoss;

    
    public Zapateria(String nit, String nombreZapateria, String direccion){
        if (nit != null) this.nit = nit;
        else this.nit = "";
        setNombreZapateria (nombreZapateria);
        setDireccion (direccion);
        atributos = new ClaseAtri[50];
        numZapatoss = 0;
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
    
    
    public int getNumZapatos(){
        return numZapatoss;
    }
    
    
    int ValorTotal(){
        int valorTotal = 0;
        for (int i = 0; i < numZapatoss; i++){
           valorTotal += atributos[i].ValorTot();
        }
        return valorTotal;
    }
    
    
    public void adicionarZapa(String materiall, int numZapatos, int num, int costos){
        atributos [numZapatoss] = new MaterialCuero(materiall, numZapatos, num, costos);
        numZapatoss++;
    }
    
    
    public void adicionarZapaSinteticos(String materiall, int numZapatos2, int num, int costos){
        atributos [numZapatoss] = new MaterialSinte(materiall, numZapatos2, num, costos);
        numZapatoss++;
    }
    
    
    public void adicionarZapaCaucho(String materiall, int numZapatos3, int num, int costos){
        atributos [numZapatoss] = new MaterialCaucho(materiall, numZapatos3, num, costos);
        numZapatoss++;
    }
}
