import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GFG {
    public static void main(String[] args) {
        // Khai báo mảng Customers;
        Customer[] arr = new Customer[3];
        arr[0] = new Customer(1, "tuanna", "tuanna@gmail.com");
        arr[1] = new Customer(2, "tuanna2", "tuanna2@gmail.com");
        arr[2] = new Customer(3, "tuanna3", "tuanna3@gmail.com");

        // Khai báo mảng Orders;
        Order[] orderArr = new Order[5];
        orderArr[0] = new Order(1001, "name_1001", 1);
        orderArr[1] = new Order(1002, "name_1002", 1);
        orderArr[2] = new Order(1003, "name_1003", 2);
        orderArr[3] = new Order(1004, "name_1004", 3);
        orderArr[4] = new Order(1005, "name_1005", 3);

        // Create a HashMap to store Customers by customer_id
        Map<Integer, Customer> customerMap = new HashMap<>();
        for (Customer customer : arr) {
            customerMap.put(customer.customer_id, customer);
        }

        // Create a list to store merged data
        List<MergedData> mergedList = new ArrayList<>();

        // Iterate through orders and merge with customers
      for (Order order : orderArr) {
          Customer customer = customerMap.get(order.customer_id);
          // If a matching customer is found, use their details; otherwise, use "N/A"
          String customerName = (customer != null) ? customer.customer_name : "N/A";
          String customerEmail = (customer != null) ? customer.customer_email : "N/A";

         mergedList.add(new MergedData(order.order_id, order.order_name, order.customer_id,
                 customerName, customerEmail));
      
        }

        // Print the table header
        System.out.printf("%-10s %-20s %-12s %-20s %-20s%n", "order_id", "order_name", "customer_id", "customer_name", "customer_email");

        // Print each row of merged data
        for (MergedData md : mergedList) {
            System.out.printf("%-10d %-20s %-12d %-20s %-20s%n",
                    md.order_id, md.order_name, md.customer_id, md.customer_name, md.customer_email);
        }
    }
}

class Customer {
    public int customer_id;
    public String customer_name;
    public String customer_email;

    public Customer(int customer_id, String customer_name, String customer_email) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
    }
}

class Order {
    public int order_id;
    public String order_name;
    public int customer_id;

    public Order(int order_id, String order_name, int customer_id) {
        this.order_id = order_id;
        this.order_name = order_name;
        this.customer_id = customer_id;
    }
}

class MergedData {
    public int order_id;
    public String order_name;
    public int customer_id;
    public String customer_name;
    public String customer_email;

    public MergedData(int order_id, String order_name, int customer_id,
                      String customer_name, String customer_email) {
        this.order_id = order_id;
        this.order_name = order_name;
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
    }
}






