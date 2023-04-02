import model.Order;
import util.JSONSaver;
import util.Saver;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        ConsoleView consoleView = new ConsoleView();
        Order order = consoleView.inputFromConsole();
        Saver orderSaver = new JSONSaver(order);
        orderSaver.save();
    }
}