import java.util.Scanner;
public class questao_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para identificar o seu tipo: ");
        int numero = sc.nextInt();
        if (numero < 0){
            System.out.println("Número negativo");
        }
        else{
            System.out.println("Número Positivo");
        }
        sc.close();
    }
}
