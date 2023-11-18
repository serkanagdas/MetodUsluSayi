import java.util.Scanner;

public class Main {

    static void power(int a, int b) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
         a = scn.nextInt();
        System.out.print("Üs değerini giriniz: ");
         b = scn.nextInt();

        int result = 1;

        for (int i=1; i<b; i++){
            result*=a;
        }
        System.out.println("Sonuç: "+ result);
    }

    public static void main(String[] args) {


        int c, v;

        power(2,4);
    }
}
/*static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }*/