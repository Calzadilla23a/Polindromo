
import java.util.Scanner;


public class JavaApplication8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una Palabra: ");
        String word = leer.nextLine();

        if (esPalindromo(word)){
            System.out.println("Es Palindromo");

        }else{
            System.out.println("No es Palindromo");
        }
    }

   static boolean esPalindromo(String palabra){

        palabra = palabra.replace(" ", "");
        palabra = palabra.toLowerCase();

        StringBuilder invertida = new StringBuilder();

        for(int i = palabra.length()-1; i >= 0; i--){
            invertida.append(palabra.charAt(i));
        }

        return palabra.equals(invertida.toString());
    }
}