import java.util.Arrays;

public class Pizza {
    private int pizzaNumber;
    private String pizzaName;
    private Ingrediens[] ingrediens;
    private int price;

    //Constructor:
    public Pizza(int pizzaNumber, String pizzaName, Ingrediens[] ingrediens, int price) {
        this.pizzaNumber = pizzaNumber;
        this.pizzaName = pizzaName;
        this.ingrediens = ingrediens;
        this.price = price;
    }

    public Pizza(int pizzaNumber) {
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaNumber=" + pizzaNumber +
                ", pizzaName='" + pizzaName + '\'' +
                ", ingrediens=" + Arrays.toString(ingrediens) +
                ", price=" + price +
                '}';
    }
}


