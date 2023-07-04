
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
    private MaterialCuero[] cuer;
    private MaterialSinteticos[] sinte;
    private MaterialCaucho[] cauch;
    private int numZapatoss;
    private int numZapatoss2;
    private int numZapatoss3;
    
    
    public Zapateria(String nit, String nombreZapateria, String direccion){
        if (nit != null) this.nit = nit;
        else this.nit = "";
        setNombreZapateria (nombreZapateria);
        setDireccion (direccion);
        cuer = new MaterialCuero[50];
        sinte = new MaterialSinteticos[50];
        cauch = new MaterialCaucho[50];
        numZapatoss = 0;
        numZapatoss2 = 0;
        numZapatoss3 = 0;
    }
    
    
    public String getNit(){
        return nit;
    }
    
    
    public String getNombreZapateria(){
        return nombreZapateria;
    }
    public void setNombreZapateria(String nombreZapateria){
        if (nombreZapateria != null){this.nombreZapateria = nombreZapateria;}
        else {this.nombreZapateria = "";}
    }
    
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if (direccion != null){this.direccion = direccion;}
        else {this.direccion = "";}
    }
    
    
    public int getNumZapatos(){
        return numZapatoss;
    }
    
    public int getNumZapatos2(){
        return numZapatoss2;
    }
    
    public int getNumZapatos3(){
        return numZapatoss3;
    }
    
    
    int ValorTotal(){
        int valorTotal = 0;
        for (int i = 0; i < numZapatoss; i++){
           valorTotal += cuer[i].ValorTot();
        }
        for (int i = 0; i < numZapatoss2; i++){
            valorTotal += sinte[i].ValorTot();
        }
        for (int i = 0; i < numZapatoss3; i++){
            valorTotal += cauch[i].ValorTot();
        }
        return valorTotal;
    }
    
    
    public void adicionarZapa(String materiall, int numZapatos, int num, int costos){
        cuer [numZapatoss] = new MaterialCuero(materiall, numZapatos, num, costos);
        numZapatoss++;
    }
    
    
    public void adicionarZapaSinteticos(String materiall, int numZapatos2, int num, int costos){
        sinte [numZapatoss2] = new MaterialSinteticos(materiall, numZapatos2, num, costos);
        numZapatoss2++;
    }
    
    
    public void adicionarZapaCaucho(String materiall, int numZapatos3, int num, int costos){
        cauch [numZapatoss3] = new MaterialCaucho(materiall, numZapatos3, num, costos);
        numZapatoss3++;
    }
}
