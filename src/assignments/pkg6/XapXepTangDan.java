
package assignments.pkg6;

import java.util.Scanner;

public class XapXepTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        System.out.print("Nhap so phan tu: ");
        int size = scanner.nextInt();
   
        int[] array = new int[size];
  
        for (int i = 0; i < size; i++) {
            System.out.print("nhap phan tu thu " + (i + 1)+" : ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {                
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Xap Xep tang dan: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
}
    

