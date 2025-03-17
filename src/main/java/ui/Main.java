package ui;
import java.util.Scanner;
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println(
                            "--------------------------------------------------------------------------------------------\n" +
                            "|                                       INTEGRANTES                                        |\n" +
                            "|                                Jhon Edwin Escudero Arias                                 |\n" +
                            "|                                Jhon David Copete Viatela                                 |\n" +
                            "|                               William Javier Jimenez Moran                               |\n" +
                            "--------------------------------------------------------------------------------------------\n" +
                            "A que punto del seguimiento desea ingresar?: " +
                            "\n1. Valores Repetidos " +
                            "\n2. Palindromos " +
                            "\n3. Bits" +
                            "\n0. Salir");
            do {
                opcion = sc.nextInt();
                if(opcion < 0 || opcion > 3) {
                    System.out.println("Entrada no valida");
                }
            } while (opcion < 0 || opcion > 3);
            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduzca la cantidad de numeros");
                    int cantidad = sc.nextInt();
                    int[] L = new int[cantidad];
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("Introduzca un numero");
                        L[i] = sc.nextInt();
                    }
                    System.out.println(se3_1(L));
                }
                case 2 -> {
                    System.out.println("Con cuantas palabras desea comprobar?");
                    int comprobar = sc.nextInt();
                    for (int i = 0; i < comprobar; i++) {
                        System.out.println("Introduzca una palabra");
                        sc.next();
                        String palabra = sc.nextLine();
                        System.out.println(se3_2(palabra));
                    }
                }
                case 3 -> {
                    System.out.println("Ingrese la cadena de bits");
                    sc.nextLine();
                    String bits = sc.nextLine();
                    System.out.println(se3_3(bits));

                }
            }
        } while (opcion != 0);
    }

    public static String se3_1(int[] L){
        boolean first = true;
        String msg = "R = [";
        for (int i = 1; i < L.length; i++) {
           if (L[i] == L[i - 1]) {
                if (i == 1 || L[i] != L[i - 2]) {
                    if (!first) {
                        msg += ", ";
                    }
                    msg += L[i];
                    first = false;
                }
            }
        }

        msg += "]";
        return msg;
    }

    public static String se3_2(String palabra){
        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return "No es un palindromo";
            }
        }
        return "Es un palindromo";
    }

    public static int se3_3 (String bits){
        int bit = 0;
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '1') {
                bit++;
            }
        }
        return bit;
    }

}