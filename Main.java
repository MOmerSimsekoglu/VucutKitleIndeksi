import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner inp =new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        double Boy= inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        int Kilo= inp.nextInt();


        double Indeks= Kilo/(Boy*Boy);

        System.out.println("Vucut kitle indeksiniz : "+Indeks);


    }
}