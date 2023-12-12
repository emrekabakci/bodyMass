import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double height, weight, result;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        height = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = inp.nextDouble();

        result = weight/(height*height);

        System.out.println("Vucut kitle indeksiniz : " + result);
    }
}