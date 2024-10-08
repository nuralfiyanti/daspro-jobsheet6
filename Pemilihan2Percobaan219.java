import java.util.Scanner;

public class Pemilihan2Percobaan219 {
    
    public static void main(String[] args) {
        
        Scanner input19 = new Scanner(System.in);

        int pilihan_menu;
        String member;
        double diskon, harga, total_bayar;
        double potongan_Qris = 1000;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-----------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
       
        pilihan_menu = input19.nextInt();
        input19.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input19.nextLine();
        System.out.println("Jenis Pembayaran? (1 = QRIS, 2 = lainnya): ");
        int pembayaran = input19.nextInt();
        System.out.println("-----------------------------------------");

           
            if (member.equals("y")) {//Menggunakan equalsIgnoreCase untuk membandingkan string}
                diskon = 0.10;
                System.out.println("Besar diskon = 10%");
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga ricebowl = " + harga);
                    
                } else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga ice tea = " + harga);

                } else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling = " + harga);

                } else {
                    System.out.println("Masukkan pilihan menu dengan benar");
                    return; // Menghentikan eksekusi lebih lanjut jika pilihan salah 
                }

                //Menghitung total bayar setelah dikson
                total_bayar = harga - (harga * diskon);
                System.out.println("Total bayar setelah diskon = " + total_bayar);         

                System.out.println("Total bayar setelah potongan QRIS = " + potongan_Qris);
            }
            else if (member.equals("n")) {//Menggunakan equalsIgnoreCoreCase untuk membandingkan string}
                if (pilihan_menu == 1) {
                    harga = 14000;
                    System.out.println("Harga ricebowl = " + harga);
                
                } else if (pilihan_menu == 2) {
                    harga = 3000;
                    System.out.println("Harga Ice tea = " + harga);
    
                } else if (pilihan_menu == 3) {
                    harga = 15000;
                    System.out.println("Harga bundling =" + harga);

                } else {
                    System.out.println("Masukkan piliahan menu dengan benar");
                    return; // Menghentikan eksekusi lebih lanjut jika pilihan salah 
                }

                //Menghitung total bayar
                total_bayar = harga;
                System.out.println("Total bayar = " + harga);
    
            } else {
                System.out.println("Member tidak valid");
                return;
            }
            
            //Potongan harga jika pakai QRIS
            if(pembayaran == 1) {
                total_bayar -= potongan_Qris;
                System.out.println("Pembayaran melalui QRIS, potongan Rp.1000");
            }

            System.out.println("Total bayar setelah potongan QRIS = " + total_bayar);
            System.out.println("------------------------------------"); 

           
        }
    }