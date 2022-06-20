import java.util.Scanner;
// Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        int k, total=0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Bir Sayi Giriniz :");
            k = scan.nextInt();
            if (k % 4 == 0) {
            total += k;
            }
        } while ((k % 2 == 0));
        System.out.println("Toplam :" + total);
    }
}