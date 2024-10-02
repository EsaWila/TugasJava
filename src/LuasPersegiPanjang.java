import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        int p,l,luas;

        Scanner input = new Scanner (System.in);

        System.out.print(" Panjangnya: ");
        p = input.nextInt();
        System.out.print(" Lebarnya: ");
        l = input.nextInt();

        luas = p*l;
        System.out.println(" Luasnya: " +luas);

        input.close();



    

    }
    
}
