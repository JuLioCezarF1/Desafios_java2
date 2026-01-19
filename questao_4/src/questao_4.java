import java.util.Scanner;
public class questao_4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o horário(apenas os 2 primeiros digitos) do inicio do jogo: ");
        int hora_inicio = sc.nextInt();
        System.out.print("Digite o horário(apenas os 2 primeiros digitos) do fim do jogo: ");
        int hora_fim = sc.nextInt();
        int duracao;
        if (hora_inicio < hora_fim){
            duracao = hora_fim - hora_inicio;
        }else{
            duracao = 24 - hora_inicio - hora_fim;
        }       
        System.out.println("O jogo durou o total de : " + duracao + " horas.");
        sc.close();
    }
}
