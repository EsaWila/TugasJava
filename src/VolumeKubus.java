import java.util.Scanner;

public class VolumeKubus {
    public static void main(String[] args) {
        int s,volume;

        Scanner input = new Scanner (System.in);

        
        System.out.print(" Sisinya: ");
        
        s = input.nextInt();
        volume = s*s*s;

        System.out.println(" Volumenya: "+volume);

        input.close();
    }
    
}
