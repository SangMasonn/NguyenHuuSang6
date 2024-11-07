
package assignments.pkg6;
import java.util.Scanner;
public class PTNN_PTLN {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        System.out.print("Nhap so phan tu: ");
        int size = scanner.nextInt();
   
        int[] array = new int[size];
  
        for (int i = 0; i < size; i++) {
            System.out.print("nhap phan tu thu " + (i + 1)+" : ");
            array[i] = scanner.nextInt();
        }

        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
  
        System.out.println("phan tu lon nhat: " + largest);
        System.out.println("phan tu nho nhat: " + smallest);
  
    }
}
    
    

