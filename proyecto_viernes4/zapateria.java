
/**
 * Write a description of class zapateria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zapateria
{
    private final String nit;
    private String nombreZapateria;
    private String direccion;
    private materoalCuero[] material;
    private int numZapatoss = 0;
    
    
    public zapateria(String nit, String nombreZapateria, String direccion){
        if (nit != null) this.nit = nit;
        else this.nit = "";
        setNombreZapateria (nombreZapateria);
        setDireccion (direccion);
        material = new materoalCuero[50];
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
    
    int ValorTotal(){
        int valorTotal = 0;
        for (int i = 0; i < numZapatoss; i++){
            valorTotal += material[i].ValorTot();
        }
        return valorTotal;
    }
    
    public void adicionarZapa(String materiall, int numZapatos, int num, int costos){
        materoalCuero c = new materoalCuero(materiall, numZapatos, num, costos);
        material[numZapatoss] = c;
        numZapatoss++;
    }
}
