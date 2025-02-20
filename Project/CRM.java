
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    String name, email, phone;
}

class Product {
    int productId;
    String name;
    double price;
    int quantity;

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println(productId + " | " + name + " | ₹" + price + " | Stock: " + quantity);
    }
}

class Order {
    int orderId;
    List<Product> orderedProducts = new ArrayList<>();
    String status;

    public Order(int orderId, List<Product> products) {
        this.orderId = orderId;
        this.orderedProducts.addAll(products);
        this.status = "Pending";
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId + " | Status: " + status);
        System.out.println("Products Ordered:");
        for (Product p : orderedProducts) {
            System.out.println(" - " + p.name + " (₹" + p.price + ")");
        }
    }
}

interface Authentication {
    void login();
    void logout();
}

class Admin extends Person implements Authentication {
    private String username = "admin";
    private String password = "admin123";

    public void login() {
        System.out.println("Admin logged in successfully.");
    }

    public void logout() {
        System.out.println("Admin logged out.");
    }

    public void addProduct(List<Product> products, Product product) {
        products.add(product);
        System.out.println("Product added successfully.");
    }

    public void removeProduct(List<Product> products, int productId) {
        boolean removed = products.removeIf(p -> p.productId == productId);
        if (removed)
            System.out.println("Product removed successfully.");
        else
            System.out.println("Product not found.");
    }

    public void viewProducts(List<Product> products) {
        System.out.println("\nAvailable Products:");
        for (Product p : products) {
            p.displayProduct();
        }
    }

    public void viewOrders(List<Order> orders) {
        System.out.println("\n--- Orders ---");
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }
        for (Order order : orders) {
            order.displayOrder();
        }
    }
}

class User extends Person implements Authentication {
    String password, address;
    List<Order> orderHistory = new ArrayList<>();

    public User(String name, String email, String phone, String password, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.address = address;
    }

    public void login() {
        System.out.println("User " + name + " logged in.");
    }

    public void logout() {
        System.out.println("User " + name + " logged out.");
    }

    public void viewProducts(List<Product> products) {
        System.out.println("\nAvailable Products:");
        for (Product p : products) {
            p.displayProduct();
        }
    }

    public void placeOrder(List<Product> products, List<Order> orders, List<Integer> productIds) {
        List<Product> selectedProducts = new ArrayList<>();
        for (int id : productIds) {
            for (Product p : products) {
                if (p.productId == id) {
                    selectedProducts.add(p);
                    break;
                }
            }
        }
        if (selectedProducts.isEmpty()) {
            System.out.println("No valid products selected.");
            return;
        }
        Order newOrder = new Order(orders.size() + 1, selectedProducts);
        orders.add(newOrder);
        orderHistory.add(newOrder);
        System.out.println("Order placed successfully. Order ID: " + newOrder.orderId);
    }

    public void viewOrderHistory() {
        System.out.println("\n--- Your Orders ---");
        if (orderHistory.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }
        for (Order order : orderHistory) {
            order.displayOrder();
        }
    }

    public void cancelOrder(List<Order> orders, int orderId) {
        boolean found = false;
        for (Order order : orders) {
            if (order.orderId == orderId && order.status.equals("Pending")) {
                order.status = "Cancelled";
                found = true;
                System.out.println("Order " + orderId + " cancelled successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Order not found or cannot be cancelled.");
        }
    }

    public void updateProfile(Scanner sc) {
        System.out.print("Enter new name: ");
        name = sc.nextLine();
        System.out.print("Enter new email: ");
        email = sc.nextLine();
        System.out.print("Enter new phone: ");
        phone = sc.nextLine();
        System.out.print("Enter new address: ");
        address = sc.nextLine();
        System.out.println("Profile updated successfully!");
    }
}

class Employee extends Person implements Authentication {
    String employeeId;

    public Employee(String name, String email, String phone, String employeeId) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.employeeId = employeeId;
    }

    public void login() {
        System.out.println("Employee " + name + " logged in.");
    }

    public void logout() {
        System.out.println("Employee " + name + " logged out.");
    }

    public void viewPendingOrders(List<Order> orders) {
        System.out.println("\n--- Pending Orders ---");
        boolean found = false;
        for (Order order : orders) {
            if (order.status.equals("Pending")) {
                order.displayOrder();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No pending orders.");
        }
    }

    public void processOrder(List<Order> orders, int orderId) {
        for (Order order : orders) {
            if (order.orderId == orderId) {
                if (order.status.equals("Pending")) {
                    order.status = "Completed";
                    System.out.println("Order " + orderId + " marked as completed.");
                    return;
                } else {
                    System.out.println("Order cannot be processed as it's not pending.");
                    return;
                }
            }
        }
        System.out.println("Order not found.");
    }

    public void viewCustomers(List<User> users) {
        System.out.println("\n--- Customer List ---");
        if (users.isEmpty()) {
            System.out.println("No customers registered.");
            return;
        }
        for (User user : users) {
            System.out.println(user.name + " | " + user.email + " | " + user.phone);
        }
    }
}

public class CRM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        List<Order> orders = new ArrayList<>();
        List<User> users = new ArrayList<>();

        products.add(new Product(1, "Laptop", 50000, 5));
        products.add(new Product(2, "Smartphone", 20000, 10));
        products.add(new Product(3, "Headphones", 1500, 20));

        Admin admin = new Admin();
        User user = new User("Aryan", "aryan@example.com", "9876543210", "pass123", "Dehradun, India");
        users.add(user);
        Employee employee = new Employee("Aryan", "aryanempl@example.com", "8765432109", "EMP101");

        while (true) {
            System.out.println("\nWelcome! Choose Your Role:");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Employee");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            char roleChoice = sc.next().charAt(0);
            sc.nextLine();

            switch (roleChoice) {
                case '1': 
                    admin.login();
                    boolean adminExit = false;
                    while (!adminExit) {
                        System.out.println("\nAdmin Menu:");
                        System.out.println("1. View Products");
                        System.out.println("2. Add Product");
                        System.out.println("3. Remove Product");
                        System.out.println("4. View Orders");
                        System.out.println("5. Logout");
                        System.out.print("Enter choice: ");
                        char adminChoice = sc.next().charAt(0);
                        sc.nextLine(); 
                        switch (adminChoice) {
                            case '1':
                                admin.viewProducts(products);
                                break;
                            case '2':
                                System.out.print("Enter Product Name: ");
                                String prodName = sc.nextLine();
                                System.out.print("Enter Price: ");
                                double prodPrice = sc.nextDouble();
                                System.out.print("Enter Quantity: ");
                                int prodQty = sc.nextInt();
                                sc.nextLine();
                                int newProductId = products.size() + 1;
                                admin.addProduct(products, new Product(newProductId, prodName, prodPrice, prodQty));
                                break;
                            case '3':
                                System.out.print("Enter Product ID to remove: ");
                                int removeId = sc.nextInt();
                                sc.nextLine();
                                admin.removeProduct(products, removeId);
                                break;
                            case '4':
                                admin.viewOrders(orders);
                                break;
                            case '5':
                                admin.logout();
                                adminExit = true;
                                break;
                            default:
                                System.out.println("Invalid Choice.");
                        }
                    }
                    break;
                case '2': 
                    System.out.println("Logging in as user...");
                    user.login();
                    boolean userExit = false;
                    while (!userExit) {
                        System.out.println("\nUser Menu:");
                        System.out.println("1. View Products");
                        System.out.println("2. Place Order");
                        System.out.println("3. View Order History");
                        System.out.println("4. Cancel Order");
                        System.out.println("5. Update Profile");
                        System.out.println("6. Logout");
                        System.out.print("Enter choice: ");
                        char userChoice = sc.next().charAt(0);
                        sc.nextLine(); 
                        switch (userChoice) {
                            case '1':
                                user.viewProducts(products);
                                break;
                            case '2':
                                System.out.print("Enter Product IDs to order (comma-separated): ");
                                String input = sc.nextLine();
                                String[] parts = input.split(",");
                                List<Integer> productIds = new ArrayList<>();
                                for (String part : parts) {
                                    try {
                                        productIds.add(Integer.parseInt(part.trim()));
                                    } catch (NumberFormatException e) {
                                        System.out.println("Invalid product id: " + part);
                                    }
                                }
                                user.placeOrder(products, orders, productIds);
                                break;
                            case '3':
                                user.viewOrderHistory();
                                break;
                            case '4':
                                System.out.print("Enter Order ID to cancel: ");
                                int orderIdToCancel = sc.nextInt();
                                sc.nextLine();
                                user.cancelOrder(orders, orderIdToCancel);
                                break;
                            case '5':
                                user.updateProfile(sc);
                                break;
                            case '6':
                                user.logout();
                                userExit = true;
                                break;
                            default:
                                System.out.println("Invalid Choice.");
                        }
                    }
                    break;
                case '3': 
                    System.out.println("Logging in as employee...");
                    employee.login();
                    boolean empExit = false;
                    while (!empExit) {
                        System.out.println("\nEmployee Menu:");
                        System.out.println("1. View Pending Orders");
                        System.out.println("2. Process Order");
                        System.out.println("3. View Customers");
                        System.out.println("4. Logout");
                        System.out.print("Enter choice: ");
                        char empChoice = sc.next().charAt(0);
                        sc.nextLine();  
                        switch (empChoice) {
                            case '1':
                                employee.viewPendingOrders(orders);
                                break;
                            case '2':
                                System.out.print("Enter Order ID to process: ");
                                int processOrderId = sc.nextInt();
                                sc.nextLine();
                                employee.processOrder(orders, processOrderId);
                                break;
                            case '3':
                                employee.viewCustomers(users);
                                break;
                            case '4':
                                employee.logout();
                                empExit = true;
                                break;
                            default:
                                System.out.println("Invalid Choice.");
                        }
                    }
                    break;
                case '4':
                    System.out.println("Exiting system. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}
