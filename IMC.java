
public class IMC {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        String nome = IO.readln("Nome: ");

        char genero = IO.readln("Gênero (M/F/N): ").charAt(0);

        double altura = Double.parseDouble(IO.readln("Altura: "));

        double peso = Double.parseDouble(IO.readln("Peso: "));

        double imc = peso / (altura * altura);

        String classificacao = "";

        
        switch (genero) {
            case 'M':
            case 'm':
                if (imc >= 40) classificacao = "Obesidade Mórbida";
                else if (imc >= 30) classificacao = "Obesidade Moderada";
                else if (imc >= 25) classificacao = "Obesidade Leve";
                else if (imc >= 20) classificacao = "Normal";
                else classificacao = "Abaixo do Normal";
                break;

            case 'F':
            case 'f':
            case 'N':
            case 'n':
                if (imc >= 39) classificacao = "Obesidade Mórbida";
                else if (imc >= 29) classificacao = "Obesidade Moderada";
                else if (imc >= 24) classificacao = "Obesidade Leve";
                else if (imc >= 19) classificacao = "Normal";
                else classificacao = "Abaixo do Normal";
                break;

            default:
                classificacao = "Gênero inválido";
        }

        String resultado = """
            --- RESULTADO ---
            Nome: %s
            Gênero: %c
            IMC: %.2f
            Classificação: %s
            """.formatted(nome, genero, imc, classificacao);

        System.out.println(resultado);
    }
}