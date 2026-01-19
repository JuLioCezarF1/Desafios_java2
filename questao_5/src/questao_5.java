import java.util.Scanner;
import java.util.Locale;
public class questao_5 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    System.out.println("Lista de produtos:");
    System.out.println("Produto 1: Cachorro quente // Valor: R$4.00");
    System.out.println("Produto 2: X-Salada // Valor: R$4.50");
    System.out.println("Produto 3: X-Bacon // Valor: R$5.00");
    System.out.println("Produto 4: Torrada simples // Valor: R$2.00");
    System.out.println("Produto 5: Refrigerante // Valor: R$1.50");
    
    System.out.print("Digite o produto desejado: ");
    int codigo_produto = sc.nextInt();
    System.out.println("Digite a quantidade: ");
    int quantidade_produto = sc.nextInt();
    double quantidade_produto_double = quantidade_produto; 
    double soma_valor;
    if(codigo_produto == 1){
        soma_valor = 4.00 * quantidade_produto_double;
        System.out.printf("O preço a pagar é: %.2f%n", soma_valor);
    }
    else{
        if(codigo_produto == 2){
            soma_valor = 4.50 * quantidade_produto_double;
            System.out.printf("O preço a pagar é: %.2f%n", soma_valor);
        }
        else{
            if(codigo_produto == 3){
                soma_valor = 5.00 * quantidade_produto_double;
                 System.out.printf("O preço a pagar é: %.2f%n", soma_valor);
            }
            else{
                if(codigo_produto == 4){
                    soma_valor = 2.00 * quantidade_produto_double;
                    System.out.printf("O preço a pagar é: %.2f%n", soma_valor);
                }
                else{
                    if (codigo_produto == 5) {
                        soma_valor = 1.50 * quantidade_produto_double;
                        System.out.printf("O preço a pagar é: %.2f%n", soma_valor);
                    }
                    else{
                        System.out.println("Resposta inválida, finalizando o programa");
                    }
                }
            }
        }
    }
    sc.close();
    }
}
