// package Assignment3;

import java.util.Scanner;

class Customer {
    private String custNo;
    private String custName;
    private String category;

    Customer(String custNo, String custName, String category) throws InvalidInputException {
        if (!custNo.toLowerCase().startsWith("c"))
            throw new InvalidInputException("Customer number should start with C");

        if (custName.length() < 4)
            throw new InvalidInputException("Customer name should have a minimum of 4 characters");

        if (!category.equalsIgnoreCase("Gold") && !category.equalsIgnoreCase("Silver")
                && !category.equalsIgnoreCase("Platinum"))
            throw new InvalidInputException("Category should be either Gold, Silver or Platinum");

        this.custNo = custNo;
        this.custName = custName;
        this.category = category;
    }

    void getDetails() {
        System.out.println("Customer Number: " + custNo + "\nCustomer Name: " + custName + "\nCategory: " + category);
    }
}

class InvalidInputException extends Exception {
    InvalidInputException(String message) {
        super(message);
    }
}

public class TestCustomer {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter customer number: ");
            String custNo = sc.nextLine();
            System.out.print("Enter customer name: ");
            String custName = sc.nextLine();
            System.out.print("Enter category: ");
            String category = sc.nextLine();
            sc.close();
            Customer c = new Customer(custNo, custName, category);
            c.getDetails();
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }
}
