import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> phoneList = new HashMap<>();

        phoneList.put("Greta", "543 3431 1433");
        phoneList.put("Karin", "634 2341 2344");
        phoneList.put("Kevin", "324 5430 1222");



        while (true) {
            System.out.println("""
                    Contact list. Select an action:\s
                     1. Find number
                     2. Add a number
                     3. Quit program""");
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                findNumber(sc, phoneList);
            }

            if (choice.equals("2")) {
                addNumber(sc, phoneList);
            }

            if (choice.equals("3")) break;
        }

    }

    public static void findNumber(Scanner sc, Map phoneList) {
        System.out.println("Please enter the selected person's name:");
        String name = sc.nextLine();
        System.out.println("Phone number found: " + phoneList.get(name));
    }

    public static void addNumber(Scanner sc, Map phoneList) {
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter number:");
        String num = sc.nextLine();
        phoneList.put(name, num);
    }
}