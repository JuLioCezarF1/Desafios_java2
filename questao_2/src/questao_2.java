import java.util.Scanner;
public class questao_2 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número para saber se é impar ou par: ");
    int numero = sc.nextInt();
    if(numero % 2 == 0){
        System.out.println("=============");
        System.out.printf("O %s é Par!", numero);
    }
    else{
        System.out.println("=============");
        System.out.printf("O %s é Impar!", numero);
    }


    sc.close();
    }
}
