import java.util.Random;
import java.util.Scanner;

public class primerEjercicio {
    public static void main(String[] args) {

        Scanner scanNumero = new Scanner(System.in);
        int numero =  new Random().nextInt(100);
        System.out.println("Ingresa un numero del 1 al 100");
        int intentos = 5;

        for (int i = 1; i <= intentos ; i++) {
            int userGuest = scanNumero.nextInt();
            if(userGuest == numero){
                System.out.println("Adivinaste el número!");
            } else if (userGuest > numero) {
                System.out.println("El número es menor. Te quedan: "+(intentos-i) + " intentos");
            }else{
                System.out.println("El número es mayor. Te quedan: "+(intentos-i) + " intentos");
            }
        }
        System.out.println("El numero era: "+numero);
        System.out.println("Se acabo el juego");



    }
}
