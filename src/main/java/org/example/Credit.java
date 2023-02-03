package org.example;

import java.time.LocalDate;

/**
 * 1.3.3 Creation of the Credit class
 */
public class Credit extends Flow {
    public Credit(String comment, int identifier, double amount, int accountNumber, boolean effect, LocalDate date) {
        super(comment, identifier, amount, accountNumber, effect, date);
    }
}
