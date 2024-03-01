import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
       // Jogadores Objeto = new Jogadores();
       // Vamos inserir um sistema de vida dos jogadores
        
        System.out.println("Informe a quantidade de jogadores: ");
        int qtdJogadores = sc.nextInt();
        
        Jogadores.MetodoTeste(qtdJogadores);

        qtdJogadores Objeto = new qtdJogadores();
        System.out.println(Objeto.nomeTeste);
        System.out.println(Objeto.testeIdade);
        
    }
}


