import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        List<Servico> servicos = new ArrayList<>();
        List<AgendarAtendimento> agendarAtendimentos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("");
            System.out.println("SALÃO DE BELEZA");
            System.out.println("(1) - Cadastrar Cliente");
            System.out.println("(2) - Consultar Cliente");
            System.out.println("(3) - Cadastrar Serviço");
            System.out.println("(4) - Consultar Serviço");
            System.out.println("(5) - Agendar Atendimento");
            System.out.println("(6) - Consultar Agendamentos");
            System.out.println("(0) - Sair");
            System.out.println("");
            System.out.printf("Opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (option) {
                case 1:
                    String outroCliente;
                    do {
                        String nome = Verificacao.verificarEntradaTexto(scanner, "Digite o nome do cliente: ");
                        String endereco = Verificacao.verificarEntradaTexto(scanner, "Digite o endereço do cliente: ");
                        String telefone = Verificacao.verificarEntradaTexto(scanner, "Digite o telefone do cliente: ");
                        String email = Verificacao.verificarEntradaTexto(scanner, "Digite o e-mail do cliente: ");

                        clientes.add(new Cliente(nome, endereco, telefone, email));
                        System.out.println("Cliente criado com sucesso!");

                        System.out.printf("Deseja adicionar outro cliente? (s/n): ");
                        outroCliente = scanner.nextLine();

                    } while (outroCliente.equalsIgnoreCase("s"));
                    break;

                case 2:
                    Verificacao.verificarListaVazia(clientes, "Nenhum cliente cadastrado. Por favor, adicione clientes primeiro.");
                    System.out.println("Lista de Clientes Cadastrados:");
                    for (Cliente cliente : clientes) {
                        cliente.imprimirCliente();
                    }
                    break;

                case 3:
                    String outroServico;
                    do {
                        String nomeS = Verificacao.verificarEntradaTexto(scanner, "Digite o nome do Serviço: ");
                        String descS = Verificacao.verificarEntradaTexto(scanner, "Digite a descrição do Serviço: ");
                        double precoS = Verificacao.verificarEntradaDouble(scanner, "Digite o preço do Serviço: ");

                        servicos.add(new Servico(nomeS, descS, precoS));
                        System.out.println("Serviço criado com sucesso!");

                        System.out.printf("Deseja adicionar outro serviço? (s/n): ");
                        outroServico = scanner.nextLine();

                    } while (outroServico.equalsIgnoreCase("s"));
                    break;

                case 4:
                    Verificacao.verificarListaVazia(servicos, "Nenhum serviço cadastrado. Por favor, adicione serviços primeiro.");
                    System.out.println("Lista de Serviços: ");
                    for (Servico servico : servicos) {
                        servico.imprimirService();
                    }
                    break;

                case 5:
                    Verificacao.verificarListaVazia(clientes, "Nenhum cliente cadastrado. Por favor, adicione clientes primeiro.");
                    Verificacao.verificarListaVazia(servicos, "Nenhum serviço cadastrado. Por favor, adicione serviços primeiro.");

                    System.out.println("Selecione um Cliente:");
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println("(" + i + ") " + clientes.get(i).getName());
                    }
                    int clientIndex = Verificacao.verificarEntradaInt(scanner, "Escolha um cliente (pelo índice): ", clientes.size());
                    Cliente selectedClient = clientes.get(clientIndex);

                    System.out.println("Selecione um Serviço:");
                    for (int i = 0; i < servicos.size(); i++) {
                        System.out.println("(" + i + ") " + servicos.get(i).getName());
                    }
                    int serviceIndex = Verificacao.verificarEntradaInt(scanner, "Escolha um serviço (pelo índice): ", servicos.size());
                    Servico selectedService = servicos.get(serviceIndex);

                    String enderecoAtendimento = Verificacao.verificarEntradaTexto(scanner, "Digite o endereço do atendimento: ");
                    String horarioAtendimento = Verificacao.verificarEntradaTexto(scanner, "Digite o horário do atendimento: ");

                    AgendarAtendimento novoAgendamento = new AgendarAtendimento(selectedClient, selectedService, enderecoAtendimento, horarioAtendimento);
                    agendarAtendimentos.add(novoAgendamento);

                    System.out.println("Atendimento agendado com sucesso!");
                    break;

                case 6:
                    Verificacao.verificarListaVazia(agendarAtendimentos, "Nenhum atendimento encontrado. Por favor, agende um atendimento primeiro.");
                    System.out.println("Lista de Atendimentos: ");
                    for (AgendarAtendimento agendamento : agendarAtendimentos) {
                        agendamento.imprimirAgendamento();
                    }
                    break;

                case 0:
                    System.out.println("Saindo....");
                    break;

                default:
                    System.out.println("\n** Opção inválida! **\n");
                    break;
            }
        } while (option != 0);
    }
}
