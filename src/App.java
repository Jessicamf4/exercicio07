import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double lado, area, dobro;
        System.out.println("Digite o lado de um quadrado: ");
        lado = sc.nextInt();
        sc.close();
        area = Math.pow(lado, 2);
        dobro = 2*area;
        System.out.println("O dobro da área do quadrado é " + dobro);
    }
}

