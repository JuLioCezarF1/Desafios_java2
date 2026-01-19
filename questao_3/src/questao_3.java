import java.util.Scanner;
public class questao_3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo, veja se seus números são multiplos!");
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        if(a % b == 0 || b % a == 0){
            System.out.printf("Os números %d e %d são multiplos!", a, b);
        }
        else{
            System.out.printf("Os números %d e %d NÃO são multiplos!", a, b);
        }
        sc.close();
    }
}
