import java.util.Scanner;

/**
 * PemilihanLat120
 */
public class PemilihanLat120 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

    int bilangan1 = 28, bilangan2 = 54, bilangan3 = 15;

    if (bilangan1 > bilangan2 ) {
        if (bilangan3 < bilangan1) {
            System.out.println(bilangan1);
        } else {
            System.out.println(bilangan3);
        } 
    } else {
        if (bilangan2 > bilangan3) {
            System.out.println(bilangan2);
        } else {
            System.out.println(bilangan3);
        
        }
    }
    }
}
