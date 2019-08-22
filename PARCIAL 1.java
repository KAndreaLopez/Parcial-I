import java.util.Scanner;
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //DECLARACION DE VARIABLES A UTILIZAR
        int CA1,CA2,CA3,CA4;
        int NO1,NO2,NO3,NO4;
        int AUX1=0;
        int PROM;
        Scanner sc=new Scanner(System.in);
        
        //INGRESO DE DATOS
        System.out.println("\tIngreso de datos\n");
        System.out.println("Ingrese Carnet No.1:");
        CA1=sc.nextInt();
        System.out.println("Ingrese Carnet No.2:");
        CA2=sc.nextInt();
        System.out.println("Ingrese Carnet No.3:");
        CA3=sc.nextInt();
        System.out.println("Ingrese Carnet No.4:");
        CA4=sc.nextInt();
        
        System.out.println("\n");
        System.out.println("Ingrese Nota 1:");
        NO1=sc.nextInt();
        System.out.println("Ingrese Nota 2:");
        NO2=sc.nextInt();
        System.out.println("Ingrese Nota 3:");
        NO3=sc.nextInt();
        System.out.println("Ingrese Nota 4:");
        NO4=sc.nextInt();
        
        
        System.out.println("M O S T R A N D O  DATOS");
        System.out.println("Carnet: "+ CA1 +  "Nota:" + NO1);
        System.out.println("Carnet: "+ CA2 +  "Nota:" + NO2);
       System.out.println("Carnet: "+ CA3 +  "Nota:" + NO3);
       System.out.println("Carnet: "+ CA4 +  "Nota:" + NO4);
       
        //REALIZAR EL PROMEDIO DE LAS NOTAS
        PROM=(NO1+NO2+NO3+NO4)/4;
        System.out.println("El promedio de las notas es: "+PROM);
  }
}