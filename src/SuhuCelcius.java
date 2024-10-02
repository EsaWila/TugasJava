import java.util.Scanner;

public class SuhuCelcius {
    public static void main(String[] args) {
        double c,f ;
        Scanner input = new Scanner (System.in);
        System.out.print("Celcius nya: ");
        c = input.nextDouble();
        f = (c*9/5) +32;
        System.out.println(" Fahrenreit nya: "+ f);
        
        input.close();
    }
}
