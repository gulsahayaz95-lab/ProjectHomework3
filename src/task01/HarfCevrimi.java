package task01;

import java.util.Scanner;

public class HarfCevrimi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        System.out.println("Büyük harf formatı: " + buyukHarfFormati(cumle));
        System.out.println("Küçük harf formatı: " + kucukHarfFormati(cumle));
    }

    public static String buyukHarfFormati(String str) {
        return str.toUpperCase();
    }

    public static String kucukHarfFormati(String str) {
        return str.toLowerCase();
    }
}
