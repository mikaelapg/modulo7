import java.util.Scanner;

public class PrimeiraClasse {
    public static void main(String[] args) throws Exception {
        try (Scanner ler = new Scanner(System.in)) { //teste
            Caixa caixa = new Caixa();

            System.out.println("Digite 1 para abrir a caixa OU 2 para fechar a caixa:");
            int resposta = ler.nextInt();
            //caixa.abrirCaixa(resposta); //retirar o comentário da linha 10 quando desejar abrir a caixa e comentar a linha 11
            caixa.fecharCaixa(resposta);
        }
    }
}