package util;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt(String message){
        System.out.println(message + ": ");
        while (!scanner.hasNextInt()){
            System.out.println("Lütfen geçerli bir sayı giriniz.");
            scanner.next(); // geçersiz girdiyi temizler!
            System.out.println((message + ": "));
        }
        return scanner.nextInt();
    }

    public static double getDouble(String message) {
        System.out.print(message + ": ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Lütfen geçerli bir ondalıklı sayı giriniz.");
            scanner.next();
            System.out.print(message + ": ");
        }
        return scanner.nextDouble();
    }

    public static String getString(String message) {
        System.out.print(message + ": ");
        return scanner.next(); // sadece ilk kelimeyi alır
    }

    public static String getLine(String message) {
        System.out.print(message + ": ");
        scanner.nextLine(); // buffer temizlemesi için
        return scanner.nextLine(); // tüm satırı alır
    }
}
