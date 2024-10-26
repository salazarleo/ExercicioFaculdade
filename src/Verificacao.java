import java.util.List;
import java.util.Scanner;

class Verificacao {
    public static String verificarEntradaTexto(Scanner scanner, String mensagem) {
        String input;
        do {
            System.out.printf(mensagem);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("** Entrada inválida! Por favor, preencha o campo. **");
            }
        } while (input.isEmpty());
        return input;
    }

    public static double verificarEntradaDouble(Scanner scanner, String mensagem) {
        Double valor = null;
        do {
            System.out.printf(mensagem);
            try {
                valor = Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("** Entrada inválida! Digite um número válido. **");
            }
        } while (valor == null);
        return valor;
    }

    public static void verificarListaVazia(List<?> lista, String mensagem) {
        if (lista.isEmpty()) {
            System.out.println(mensagem);
        }
    }

    public static int verificarEntradaInt(Scanner scanner, String mensagem, int limite) {
        int valor;
        while (true) {
            System.out.printf(mensagem);
            try {
                valor = Integer.parseInt(scanner.nextLine().trim());
                if (valor >= 0 && valor < limite) {
                    break;
                } else {
                    System.out.println("** Índice inválido! Por favor, escolha um índice válido. **");
                }
            } catch (NumberFormatException e) {
                System.out.println("** Entrada inválida! Digite um número inteiro válido. **");
            }
        }
        return valor;
    }
}