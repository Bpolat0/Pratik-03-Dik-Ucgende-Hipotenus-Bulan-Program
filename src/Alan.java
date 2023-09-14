import java.util.Scanner;
public class Alan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,u;
        double alan;

        System.out.print("1. Kenarın Uzunluğu : ");
        a = input.nextInt();

        System.out.print("2. Kenarın Uzunluğu : ");
        b = input.nextInt();

        System.out.print("3. Kenarın Uzunluğu : ");
        c = input.nextInt();

        u = a+b+c/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı : " + alan);
    }
}
