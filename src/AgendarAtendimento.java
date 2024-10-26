public class AgendarAtendimento {
private Cliente cliente;
private Servico servico;
private String address;
private String time;

    public AgendarAtendimento(Cliente cliente, Servico servico, String address, String time) {
        this.cliente = cliente;
        this.servico = servico;
        this.address = address;
        this.time = time;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void imprimirAgendamento() {
        System.out.println("Client: ");
        cliente.imprimirCliente();
        System.out.println("Service: ");
        servico.imprimirService();
        System.out.println("Addres: " + address);
        System.out.println("Time: " + time);
        System.out.println("");
    }

}
