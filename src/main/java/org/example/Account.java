package org.example;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 1.2.1 Creation of the Account class
 */
public abstract class Account {
    /**
     * AtomicInteger provides an int value to be updated automatically
     */
    private final static AtomicInteger count = new AtomicInteger();

    protected String label;
    protected double balance;
    protected int accountNumber;
    protected Client client;

    public Account(String label, Client client) {
        this.label = label;
        this.accountNumber = count.getAndIncrement();
        this.client = client;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(Flow flow) {
        if (flow instanceof Credit) {
            this.balance = balance + flow.getAmount();
        } else if (flow instanceof Debit) {
            this.balance = balance - flow.getAmount();
        } else if (flow instanceof Transfer) {
            if (((Transfer) flow).accountDestination == flow.getAccountNumber()) {
                this.balance = balance + flow.getAmount();
            } else if (((Transfer) flow).accountDestination != flow.getAccountNumber()) {
                // I had some trouble understanding this -"If the account number is equal to the issuing account
                // number, the amount is removed from the balance"-  I though that it was a typo mistake because it would look like
                // the method above, so the way i think it is that if those accounts are different the amount is removed from balance.

                this.balance = balance - flow.getAmount();
            }

        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void updateBalance(Flow[] flows, HashMap<String, Account> accountHashMap) {
        for (int i = 0; i < flows.length; i++) {
            setBalance(flows[i]);
        }
        Predicate<Integer> negativeNumber = balanceNeg -> (getBalance() < 0);

    }


}


