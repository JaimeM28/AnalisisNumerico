import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodosCerrados metodo = new MetodosCerrados();
        Boolean ciclo = true;
        while(ciclo == true){
            System.out.println("\n[------Bienvenido-------]");
            System.out.println("1. Bisección");
            System.out.println("2. Interpolación lineal");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    metodo.Biseccion(2, 3, 100);
                    break;
                
                case 2:
                    metodo.InterpolacionLineal(2, 3, 100);
                    break; 

                case 3:
                    ciclo = false;
                    break;

                default:
                    System.out.print("Introduce una opcion correcta");
                    break;
            }
          
        }
    }
}
