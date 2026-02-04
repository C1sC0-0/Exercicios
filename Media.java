import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero");
        double n1 = sc.nextDouble();

        System.out.println("Informe um numero");
        double n2 = sc.nextDouble();

        double media = (n1+n2)/2;
        
        System.out.println("Media: " +media );
        
        sc.close();
    }
}
