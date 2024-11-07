package assignments.pkg6;
import java.util.Scanner;
public class DemSoLanXH {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
   
        System.out.print("Nhap so phan tu: ");
        int size = scanner.nextInt();
   
        int[] array = new int[size];
  
        for (int i = 0; i < size; i++) {
            System.out.print("nhap phan tu thu " + (i + 1)+" : ");
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Nhap phan tu can dem: ");
        int PhanTu = scanner.nextInt();

      
        int Dem = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == PhanTu) {
                Dem++;
            }
        }

       
        System.out.println("Phan tu " + PhanTu + " xuat hien " + Dem + " lan");

    }
    
}
