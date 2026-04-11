class EstruturasCondicionais {

public static void main(String[] args) {

    String nome; // String é usado para armazenar texto, ideal para o nome do usuário
    char genero; // char é usado para armazenar um único caractere, ideal para o gênero (M, F, N)
    double altura; // double é usado para armazenar números com casas decimais, ideal para altura e peso
    double peso;
    double imc;
    String classificacao = ""; 

    // Entrada de dados 
    nome = IO.readln("Informe o nome: ");
    genero = IO.readln("Informe o gênero (M/F/N): ").charAt(0); // .charAt(0) pega o primeiro caractere da string
    altura = Double.parseDouble(IO.readln("Informe a altura (ex: 1.75): ")); // Double.parseDouble converte a string lida para um número decimal
    peso = Double.parseDouble(IO.readln("Informe o peso (ex: 70.5): "));

        // Fórmula do Cálculo do IMC
        imc = peso / (altura * altura);

        classificacao = switch (genero) {
            case 'M', 'm' -> {
                if (imc >= 40) {
                    yield "Obesidade Mórbida"; // yield é usado para retornar um valor dentro de um bloco de código em um switch expression
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
            case 'F', 'f', 'N', 'n' -> { 
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
        System.out.printf("IMC: %.2f\n", imc); // %.2f formata o número para mostrar apenas 2 casas decimais
        System.out.println("Classificação: " + classificacao);

    }
}