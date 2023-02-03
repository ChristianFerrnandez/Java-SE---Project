package org.example;

import java.time.LocalDate;

/**
 * 1.3.3 Creation of the Transfer class
 */
public class Transfer extends Flow {
    protected int accountDestination;

    public Transfer(String comment, int identifier, double amount, int accountNumber, boolean effect, LocalDate date, int accountDestination) {
        super(comment, identifier, amount, accountNumber, effect, date);
        this.accountDestination = accountDestination;
    }

}
