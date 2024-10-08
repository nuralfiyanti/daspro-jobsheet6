//import inputan
import java.util.Scanner;

public class Sepatu19 {

    public static void main(String[] args) {
        
        //deklarasai inputan
        Scanner input19 = new Scanner(System.in);

        //deklarasi variable
        String merk, kategori;
        int ukuran, harga = 0;

        //judul
        System.out.println("==============================================");
        System.out.println("================ TOKO SEPATU =================");
        System.out.println("==============================================\n");

        //daftar
        System.out.println("Daftar Sepatu: ");
        System.out.println("1. Converse"); //converse
        System.out.println("Kategori dan Ukuran: ");
        System.out.println("- Slip On (36 - 40)");
        System.out.println("- High Top (40 - 44) ");
        System.out.println("2. Sketcher"); //sketcher
        System.out.println("Kategori dan Ukuran: ");
        System.out.println("- Woman (36 - 41)");
        System.out.println("- Man (41 - 44)");
        System.out.println("3. Nike"); // nike
        System.out.println("Kategori dan Ukuran: ");
        System.out.println("- Kids (36 - 40)");
        System.out.println("- Adult (40 - 44)");

        //inputan
        System.out.println("");
        System.out.println("-----------------------------------------------\n");

        System.out.print("Masukkan Merk Sepatu");
        merk = input19.nextLine();

        System.out.print("Masukkan Kategori");
        kategori = input19.nextLine();

        System.out.print("Masukkan Ukuran Sepatu");
        ukuran = input19.nextInt();
        
        //logic
        if (merk.equalsIgnoreCase("coverse")) {
            if (kategori.equalsIgnoreCase("Slip On")) {
                harga = 800000;
            }
            else if (kategori.equalsIgnoreCase("Hight Top")) {
                harga = 1200000; 
            }
        }
        else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Women")) {
                harga = 1000000;
            }
            else if (kategori.equalsIgnoreCase("Men")) {
                harga = 1800000;
            }
        }
        else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                harga = 1000000;
            }
            else if (kategori.equalsIgnoreCase("Man")) {
                harga = 1800000;
            }
        }   
        else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                harga = 750000;
            }
            else if (kategori.equalsIgnoreCase("Adult")) {
                harga = 1500000;
            }
        }
        else {
            System.out.println("Merk Tidak Valid !!!");
        }    
        
        //output
        System.out.println("");
        System.out.println("----------------------------------------------------\n");

        System.out.println(" Total Bayar: " + harga);

        }   
    }

 