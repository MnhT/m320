package Q3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CSVtoHashMap {
    private HashMap<String, String> map = new HashMap<>();

    public void readCSVtoHashMap(String csvFile) {
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                map.put(data[0], data[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printHashMap() {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key : " + entry.getKey() + " , Value : " + entry.getValue());
        }
    }

    public void search(String key) {
        if (map.containsKey(key)) {
            System.out.println("The key exists in the map, value: " + map.get(key));
        } else {
            System.out.println("The key does not exist in the map");
        }
    }

    public void remove(String key) {
        if (map.containsKey(key)) {
            System.out.println("Removed the key from the map, value was: " + map.get(key));
            map.remove(key);
        } else {
            System.out.println("The key does not exist in the map");
        }
    }

    public static void main(String[] args) {
        CSVtoHashMap obj = new CSVtoHashMap();
        obj.readCSVtoHashMap("C:\\Users\\acimovics\\IdeaProjects\\m320\\Q3\\airports.csv"); // Replace with your CSV file path
        Scanner scanner = new Scanner(System.in);
        String option = "";

        while (!option.equals("4")) {
            System.out.println("\n1. Print HashMap");
            System.out.println("2. Search Key");
            System.out.println("3. Remove Key");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    obj.printHashMap();
                    break;
                case "2":
                    System.out.print("Enter key to search: ");
                    String keyToSearch = scanner.nextLine();
                    obj.search(keyToSearch);
                    break;
                case "3":
                    System.out.print("Enter key to remove: ");
                    String keyToRemove = scanner.nextLine();
                    obj.remove(keyToRemove);
                    break;
                case "4":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option! Please enter a valid option.");
                    break;
            }
        }
        scanner.close();
    }
}
