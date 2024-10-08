//import inputan
import java.util.Scanner;

public class Buku19 {
    
    public static void main(String[] args) {

        //deklarasi inputan
        Scanner input19 = new Scanner(System.in);
        
        //deklarasi variable
        String jenisBuku;
        int jumlahBuku = 5, diskonJenis = 0, diskonJumlah = 0;

        //judul
        System.out.println("==================================================");
        System.out.println("================ TOKO BUKU =======================");
        System.out.println("==================================================\n");

        //inputan
        System.out.print("Masukkan Jenis Buku: ");
        jenisBuku = input19.nextLine();

        System.out.print("Masukkan Jumlah Buku: ");
        jumlahBuku = input19.nextInt();

        //logic
        //diskon kamus
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskonJenis = 10;
            if (jumlahBuku > 2) {
                diskonJumlah = 2;
            }
        
        //diskon novel
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskonJenis = 7;
            if (jumlahBuku > 3) {
                diskonJumlah = 2;
            } else if (jumlahBuku <= 3) {
                diskonJumlah = 1;
            }

         } 
        //diskon selain kamus dan novel
         else {
            if (jumlahBuku > 3) {
                diskonJumlah = 5;
            }          
        } 

        //output
        System.out.println("");
        System.out.println("--------------------------------------------------\n");

        System.out.println("Total diskon yang didapat : " + diskonJumlah + diskonJenis+ "diskon");

    }
}