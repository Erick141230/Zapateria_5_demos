
/**
 * Write a description of class work here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class work{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int numZapatos, costos, num, opcionMenu = 0, numList = 0;
        double valorTotal = 0;
        int talla_35 = 0, talla_36 = 0, talla_37 = 0, talla_38 = 0, talla_39 = 0, talla_40 = 0;       
        zapat[] zapa = new zapat[50];
        
        while (opcionMenu != 3){
            System.out.println("\nMenu de opciones: ");
            System.out.println("1. Agregar zapatos");
            System.out.println("2. Calcular el costo total");
            System.out.println("3. Salir");
            System.out.println("Escoja una opcion:");
            opcionMenu = sc.nextInt();
            
            if (opcionMenu == 1){
                    System.out.println("Digite el numero de zapatos adquiridos: ");
                    numZapatos = sc.nextInt();
                    for(int i = 0; i < numZapatos; i++){
                        System.out.println("Digite la talla del par de zapatos");
                        num = sc.nextInt();
                        System.out.println("Digite el costo del par de zapatos");
                        costos = sc.nextInt();
                        // We create a switch statement based on the size number
                        switch (num) {
                            case 35:
                                talla_35 = talla_35 + 1;
                            break;
                            case 36:
                                talla_36 = talla_36 + 1;
                            break;
                            case 37:
                                talla_37 = talla_37 + 1;
                            break;
                            case 38:
                                talla_38 = talla_38 + 1;
                            break;
                            case 39:
                                talla_39 = talla_39 + 1;
                            break;
                            case 40:
                                talla_40 = talla_40 + 1;
                                break;
                            default:
                                System.out.println("La talla ingresada no es valida.");
                                break;
                    }
                    zapat zapatillas = new zapat(numZapatos, costos, num);
                    zapa [numList] = zapatillas;
                    numList ++;
                }
            }
                else if (opcionMenu == 2) {
                    for (int i = 0; i < numList; i++) {
                        // The cost of each shoe entered into the system is added to the variable valorTotal
                        valorTotal += zapa[i].valorTot();
                    }   
            }
            System.out.println("Se compro "+ talla_35 +" pares de zapatos de la talla 35.");
            System.out.println("Se compro "+ talla_36 +" pares de zapatos de la talla 36.");
            System.out.println("Se compro "+ talla_37 +" pares de zapatos de la talla 37.");
            System.out.println("Se compro "+ talla_38 +" pares de zapatos de la talla 38.");
            System.out.println("Se compro "+ talla_39 +" pares de zapatos de la talla 39.");
            System.out.println("Se compro "+ talla_40 +" pares de zapatos de la talla 40.");
            System.out.println("Con un gasto total de: " + valorTotal +" pesos");
        }
    }
}
