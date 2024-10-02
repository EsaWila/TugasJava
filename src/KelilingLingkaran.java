import java.util.Scanner;

public class KelilingLingkaran {
    public static void main(String[] args) {
        double keliling1, keliling2, r;
        Scanner input = new Scanner(System.in);

        System.out.print(" Jari-jarinya: ");
        r = input.nextDouble();
        
        keliling1 = 2*Math.PI*r;
        keliling2 = 2* (22*r/7);
        
        System.out.println(" Keliling nya adalah: " +keliling1);
        System.out.println(" Keliling nya adalah: " +keliling2);
                
        input.close();
    }
    
}
