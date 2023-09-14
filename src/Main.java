import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;


        System.out.print("1. Dik Kenar Uzunluğu : ");
        a = input.nextInt();

        System.out.print("2. Dik Kenar Uzunluğu : ");
        b = input.nextInt();

        c = (a*a) + (b*b);
        System.out.print(" Hipotenüs Değeri : " + Math.sqrt(c));

    }
}