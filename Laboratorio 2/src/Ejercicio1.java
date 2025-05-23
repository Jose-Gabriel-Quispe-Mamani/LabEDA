import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ejercicio1 iv = new Ejercicio1();
        
        System.out.print("Ingrese tamaño del vector: ");
        int n = scan.nextInt();
        int[] vector = new int[n];
        
        System.out.println("Ingrese valores:");
        for (int i = 0; i < n; i++) {
            vector[i] = scan.nextInt();
        }
        
        int[] invertido = iv.invertirArray(vector);
        
        System.out.print("Vector invertido: ");
        for (int num : invertido) {
            System.out.print(num + " ");
        }

        scan.close();
    }

    public int[] invertirArray(int[] A) {
        invertirRecursivo(A, 0, A.length - 1);
        return A;
    }

    private void invertirRecursivo(int[] A, int inicio, int fin) {
        if (inicio >= fin) return;
        int temp = A[inicio];
        A[inicio] = A[fin];
        A[fin] = temp;
        invertirRecursivo(A, inicio + 1, fin - 1);
    }
}
    
