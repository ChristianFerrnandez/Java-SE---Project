package org.example;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1.1.1 Creation of CLient class
 */
public class Client {
    /**
     * AtomicInteger provides an int value to be updated automatically
     */
    private final static AtomicInteger count = new AtomicInteger();

    private String name;
    private String firstname;
    private int clientNumber;

    public Client(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
        this.clientNumber = count.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    @Override
    public String toString() {
        return "Client{" + "name='" + name + '\'' + ", firstname='" + firstname + '\'' + '}';
    }
}
