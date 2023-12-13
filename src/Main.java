import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables defined
        double height, weight, result;

        //New scanner created.
        Scanner inp = new Scanner(System.in);

        //Data retrieved from user.
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        height = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = inp.nextDouble();

        //Result variable set equal to body mass index.
        result = weight/(height*height);

        //Result printed.
        System.out.println("Vucut kitle indeksiniz : " + result);
    }
}