import java.util.*;
    class CollectionManagementSystem {
    private List<String> list;
    private Set<String> set;

    public CollectionManagementSystem() {
        list = new ArrayList<>();
        set = new HashSet<>();
    }

    public void addToList(String element) {
list.add(element);
System.out.println("Element added to the list.");
    }

    public void removeFromList(String element) {
        if (list.remove(element)) {
System.out.println("Element removed from the list.");
        } else {
System.out.println("Element not found in the list.");
        }
    }

    public void displayList() {
        if (list.isEmpty()) {
System.out.println("The list is empty.");
        } else {
System.out.println("List elements: " + list);
        }
    }

    public void addToSet(String element) {
        if (set.add(element)) {
System.out.println("Element added to the set.");
        } else {
System.out.println("Element already exists in the set.");
        }
    }

    public void removeFromSet(String element) {
        if (set.remove(element)) {
System.out.println("Element removed from the set.");
        } else {
System.out.println("Element not found in the set.");
        }
    }

    public void displaySet() {
        if (set.isEmpty()) {
System.out.println("The set is empty.");
        } else {
System.out.println("Set elements: " + set);
        }
    }

    public static void main(String[] args) {
CollectionManagementSystem cms = new CollectionManagementSystem();
        Scanner scanner = new Scanner(System.in);
        while (true) {
System.out.println("Select an option:");
System.out.println("1. Add element to list");
System.out.println("2. Remove element from list");
System.out.println("3. Display list elements");
System.out.println("4. Add element to set");
System.out.println("5. Remove element from set");
System.out.println("6. Display set elements");
System.out.println("7. Exit");
            int choice = scanner.nextInt();
scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
System.out.println("Enter element to add to the list:");
                    String listAddElement = scanner.nextLine();
cms.addToList(listAddElement);
                    break;
                case 2:
System.out.println("Enter element to remove from the list:");
                    String listRemoveElement = scanner.nextLine();
cms.removeFromList(listRemoveElement);
                    break;
                case 3:
cms.displayList();
                    break;
                case 4:
System.out.println("Enter element to add to the set:");
                    String setAddElement = scanner.nextLine();
cms.addToSet(setAddElement);
                    break;
                case 5:
System.out.println("Enter element to remove from the set:");
                    String setRemoveElement = scanner.nextLine();
cms.removeFromSet(setRemoveElement);
                    break;
                case 6:
cms.displaySet();
                    break;
                case 7:
System.out.println("Exiting...");
scanner.close();
                    return;
                default:
System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
