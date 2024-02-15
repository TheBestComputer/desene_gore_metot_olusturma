
import java.util.Scanner;


public class Main {
    static void dongu(int a){
        System.out.print(a + " ");
        if(a <= 0){
            return;
        }
        dongu(a - 5);
        System.out.print(a + " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("N sayisini giriniz : ");
        int n = scanner.nextInt();
        System.out.print("Ciktisi : ");
        dongu(n);
        
    }
}
