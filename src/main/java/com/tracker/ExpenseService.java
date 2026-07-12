package com.tracker;

public class ExpenseService {
    
    // Core logic to check if an expense amount is valid
    public boolean validateExpense(double amount) {
        return amount > 0;
    }

    public static void main(String[] args) {
        ExpenseService service = new ExpenseService();
        System.out.println("Is transaction valid? " + service.validateExpense(150.50));
    }
}