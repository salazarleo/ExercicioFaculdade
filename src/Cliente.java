public class Cliente {
    private String name;
    private String email;
    private String phone;
    private String address;


public Cliente (String name, String email, String phone, String address) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.address = address;
}

public void imprimirCliente() {
    System.out.println("Name: " + this.name);
    System.out.println("Email: " +this.email);
    System.out.println("Phone: " +this.phone);
    System.out.println("Address: " +this.address);
    System.out.println("");
}

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }


}

