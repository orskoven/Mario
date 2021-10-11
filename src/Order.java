import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Order {
    private Pizza[] pizzas;
    private int orderId;
    private String orderName;
    private String pickupTime;
    private Pizza pizzaNumber;

    public Order(Pizza[] pizzas, int orderId, String orderName) {
        this.pizzas = pizzas;
        this.orderId = orderId;
        this.orderName = orderName;
    }


    //Methods:
    public void showMenuCard(){
        System.out.println("Menu Card Overview:");
        Pizza [] menuCards = {getPizza(1),getPizza(2),getPizza(3),
                getPizza(4),getPizza(5),getPizza(6),getPizza(7),
                getPizza(8),getPizza(9),getPizza(10),getPizza(11),
                getPizza(12),getPizza(13),getPizza(14)};
        for (Pizza menuCard :menuCards) {
            System.out.println(menuCard);
        }

    }

    public Pizza getPizza(int inputPizzaNumber) {
        Pizza whatPizza = (inputPizzaNumber == 1) ? new Pizza(1, "Vesuvio", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.OREGANO}, 57) :
                (inputPizzaNumber == 2) ? new Pizza(2, "Amerikaner", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.OKSEFARS, Ingrediens.OREGANO}, 53) :
                        (inputPizzaNumber == 3) ? new Pizza(3, "Cacciatore", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.PEPPERONI, Ingrediens.OREGANO}, 57) :
                                (inputPizzaNumber == 4) ? new Pizza(4, "Carbona", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.KODSAUCE, Ingrediens.SPAGHETTI, Ingrediens.COCKTAILPOLSER, Ingrediens.OREGANO}, 63) :
                                        (inputPizzaNumber == 5) ? new Pizza(5, "Dennis", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.PEPPERONI, Ingrediens.COCKTAILPOLSER, Ingrediens.OREGANO}, 65) :
                                                (inputPizzaNumber == 6) ? new Pizza(6, "Bertil", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.BACON, Ingrediens.OREGANO}, 57) :
                                                        (inputPizzaNumber == 7) ? new Pizza(7, "Silvia", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.PEPPERONI, Ingrediens.RODPEBERLOG, Ingrediens.OLIVEN, Ingrediens.OREGANO}, 61) :
                                                                (inputPizzaNumber == 8) ? new Pizza(8, "Victoria", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.CHAMPIGNON, Ingrediens.OREGANO}, 61) :
                                                                        (inputPizzaNumber == 9) ? new Pizza(9, "Toronfo", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.BACON, Ingrediens.KEBAB, Ingrediens.CHILI, Ingrediens.OREGANO}, 61) :
                                                                                (inputPizzaNumber == 10) ? new Pizza(10, "Capricciosa", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.CHAMPIGNON, Ingrediens.OREGANO}, 61) :
                                                                                        (inputPizzaNumber == 11) ? new Pizza(11, "Hawai", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.ANANAS, Ingrediens.OREGANO}, 61) :
                                                                                                (inputPizzaNumber == 12) ? new Pizza(12, "Le Blissola", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.REJER, Ingrediens.OREGANO}, 61) :
                                                                                                        (inputPizzaNumber == 13) ? new Pizza(13, "Venezia", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.SKINKE, Ingrediens.BACON, Ingrediens.OREGANO}, 61)
                                                                                                                : new Pizza(14, "Mafia", new Ingrediens[]{Ingrediens.TOMATSAUCE, Ingrediens.OST, Ingrediens.PEPPERONI, Ingrediens.BACON, Ingrediens.LOEG, Ingrediens.OREGANO}, 61);
        return whatPizza;
    }


    /*
    public void getOrderInterface() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Order> allOrders = new ArrayList<>();
        ArrayList<Order> currentOrders = new ArrayList<>();
        ArrayList<Pizza[]> pizzaCounter = new ArrayList<>();
        System.out.println("MARIOS PIZZABAR\n-------------------");
        int orderIdNumber = 0;
        do {
            //Create order choice:
            System.out.println("Create order:\n• Press 1 - Phone Order\n• Press 2 - In House Order");
            int alfonsoOrderChoice = scanner.nextInt();
            if (alfonsoOrderChoice == 1) {
                System.out.println("You choose creating order from phone!");
               // Order.showMenuCard();
                allOrders.add(getOrder(orderIdNumber++));
                pizzaCounter.add(getOrder(orderIdNumber++).pizzas);

            } else if (alfonsoOrderChoice == 2) {
                System.out.println("You choose creating order from disk (inHouse!");
               // Order.showMenuCard();
                allOrders.add(getOrder(orderIdNumber++));
                pizzaCounter.add(getOrder(orderIdNumber++).pizzas);

            } else {
                System.out.println("Please press 1 or 2");
            }


        } while (orderIdNumber < 2);
        System.out.println();
        System.out.println(pizzaCounter);
    }

     */


    @Override
    public String toString() {
        return "Order{" +
                "pizzas=" + Arrays.toString(pizzas) +
                ", orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", pickupTime=" + pickupTime +
                '}';
    }
}
