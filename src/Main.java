import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Order> allOrders = new ArrayList<>();
        ArrayList<Order> currentOrders = new ArrayList<>();
        int[] pizzaCounter = new int[14];
        System.out.println("MARIOS PIZZABAR\n-------------------");
        Order orders = new Order(null, 0, "");
        int orderIdNumber = 0;
        do {
            System.out.println("How many pizzas would you like? - please type a number:");
            int pizzaNumbersInOrder = scanner.nextInt();
            Pizza[] pizzasInOrder = new Pizza[pizzaNumbersInOrder];
            int i = 0;
            do {
                System.out.println("Please type the pizza number of choice:");
                int pizzaNumberChoice = scanner.nextInt();
                pizzasInOrder[i] = orders.getPizza(pizzaNumberChoice);
                pizzaCounter[i++] = pizzaNumberChoice;
            } while (i < pizzaNumbersInOrder);
            System.out.println("What is the order name?");
            String orderName = scanner.next();
            Order order = new Order(pizzasInOrder, 2, orderName);
            System.out.println("These are the ordered pizza's:");
            for (Pizza pizza : pizzasInOrder) {
                System.out.println(pizza);
            }
            orderIdNumber++;

        } while (orderIdNumber < 2);
        System.out.println("Den mest populære pizza for i dag er: " + orders.getPizza(largestNumber(pizzaCounter)));
    }
    public static int largestNumber(int[] arrayInput) {
        OptionalInt theLargestNumber = Arrays.stream(arrayInput).max();
        return theLargestNumber.getAsInt();

    }
}

