import java.util.Scanner;

public class Telur {
    public static void main(String[] args) throws Exception {
       double jumlah;
       int uangDiberikan;
       int harga = 28000;
       int totalHarga;
       int kembalian;

       Scanner input = new Scanner(System.in);

       System.out.print("Masukkan jumlah telur: ");
       jumlah = input.nextDouble();

       totalHarga = (int) (harga*jumlah);
       System.out.println("Totalnya : " + totalHarga);

       System.out.print("Uangnya: ");
       uangDiberikan = input.nextInt();
    
       kembalian = uangDiberikan - totalHarga;
       System.out.println("Kembaliannya : "+ kembalian);
       input.close();

    }
}
