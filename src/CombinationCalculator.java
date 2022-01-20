import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        //Combination: C(n,r) = n! / (r! * (n-r)!)
        Scanner scan = new Scanner(System.in);
        System.out.println("------      Combination     ----- ");
        System.out.println("------  C(n,r) = n! / (r! * (n-r)!) ----- ");
        int n, r;
        System.out.print("n = ");
        n = scan.nextInt();
        System.out.print("r = ");
        r = scan.nextInt();
        double nFactorial = 1;
        double rFactorial = 1;
        double nRFactorial = 1;
        double combination;

        for (int i = n; i > 0; i--) {
            nFactorial = nFactorial * i;
        }
        for (int k = r; k > 0 ; k--) {
            rFactorial = rFactorial * k;
        }
        for (int j = (n-r); j > 0 ; j--) {
            nRFactorial = nRFactorial * j;
        }
        combination = (nFactorial / (rFactorial * nRFactorial));
        System.out.println("C(" + n + "," + r + ") = " + combination);
    }
}