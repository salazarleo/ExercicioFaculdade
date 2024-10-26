public class Servico {
private String name;
private String description;
private double price;

    public Servico(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void imprimirService(){
        System.out.println(" Name: " + this.name);
        System.out.println(" Description: " + this.description);
        System.out.println(" Price:" +  this.price);
        System.out.println("");
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
