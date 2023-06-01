import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Combinaciones combinar = new Combinaciones();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1. Combinaciones");
            System.out.println("2. Permutación");
            System.out.println("3. Créditos del Programa");
            System.out.println("Seleccione una opción: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Ingrese la cantidad de elementos en el arreglo: ");
                    int n = scanner.nextInt();
                    int Input_Array[] = new int[n];
                    System.out.println("Ingrese los elementos del arreglo:");
                    for (int i = 0; i < n; i++) {
                        Input_Array[i] = scanner.nextInt();
                    }
                    System.out.print("Ingrese el número de elementos en cada combinación: ");
                    int r = scanner.nextInt();
                    Combinaciones.Print_Combination(Input_Array, n, r);
                    break;
                case 2:
                    System.out.print("Ingrese las letras para permutar: ");
                    scanner.nextLine();
                    String str = scanner.nextLine();
                    Permutacion.findPermutations(str);
                    break;
                case 3:
                    System.out.println("Nombres de los integrantes:\nCamila Sánchez\nMateo Rosero\nSebastián Quito\nGorky Palacios\n\tLe damos agradecimientos especiales a Shakira\nporque ella fue quién nos inspiró a hacer el código <3");
            }
        }
    }
}
