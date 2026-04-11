import java.util.Scanner;

public class IO {
    // Cria um objeto Scanner para leitura de entrada do usuário
    private static Scanner scanner = new Scanner(System.in); 

    // Método para ler uma linha de entrada do usuário com um prompt
    // Mostra na tela e retorna o que o usuário digitar como uma String
    public static String readln(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}