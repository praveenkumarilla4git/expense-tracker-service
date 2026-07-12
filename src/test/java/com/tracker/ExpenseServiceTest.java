package com.tracker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExpenseServiceTest {

    @Test
    public void testValidExpense() {
        ExpenseService service = new ExpenseService();
        assertTrue(service.validateExpense(50.00));
    }

    @Test
    public void testInvalidExpense() {
        ExpenseService service = new ExpenseService();
        assertFalse(service.validateExpense(-10.00));
    }
}