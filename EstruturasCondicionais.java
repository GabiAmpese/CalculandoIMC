import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome;
        char genero;
        double altura;
        double peso;
double imc;
String classificacao = "";

System.out.print("Informe o nome: ");
        nome = ler.nextLine();

        System.out.print("Informe o gênero (M/F/N): ");
        genero = ler.next().charAt(0);

        System.out.print("Informe a altura (ex: 1.75): ");
        altura = ler.nextDouble();

        System.out.print("Informe o peso (ex: 70.5): ");
        peso = ler.nextDouble();

        // Cálculo do IMC
        imc = peso / (altura * altura);

        // Switch para gênero
        classificacao = switch (genero) {
            case 'M', 'm' -> {
                if (imc >= 40) {
                    yield "Obesidade Mórbida";
                } else if (imc >= 30) {
                    yield "Obesidade Moderada";
                } else if (imc >= 25) {
                    yield "Obesidade Leve";
                } else if (imc >= 20) {
                    yield "Normal";
                } else {
                    yield "Abaixo do Normal";
                }
            }
            case 'F', 'f', 'N', 'n' -> { // usa tabela feminina
                if (imc >= 39) {
                    yield "Obesidade Mórbida";
                } else if (imc >= 29) {
                    yield "Obesidade Moderada";
                } else if (imc >= 24) {
                    yield "Obesidade Leve";
                } else if (imc >= 19) {
                    yield "Normal";
                } else {
                    yield "Abaixo do Normal";
                }
            }
            default -> "Gênero inválido";
        };

        // Saída
        System.out.println("\nNome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);

        System.out.println("\nAtitus Educação - O lado certo da força!!!");

        ler.close();
    }
}