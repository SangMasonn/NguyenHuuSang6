
package assignments.pkg6;
import java.util.Scanner;
public class Sum_TBC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int size = scanner.nextInt();
     
        int[] array = new int[size];

        
        for (int i = 0; i < size; i++) {
            System.out.print("nhap phan tu thu "+(i+1)+ ": ");
            array[i] = scanner.nextInt();
        }
     
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
       
        double TBC = (double) sum / size;

        System.out.println("Tong: " + sum);
        System.out.println("Trung Binh Cong: " + TBC);

    }
}