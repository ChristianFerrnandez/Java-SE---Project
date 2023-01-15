package org.example;

// 1.1.1 Creation of the client class
public class Client {

    private String name;
    private String  firstname;
    private static int clientNumber = 0;

    public Client(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
        clientNumber++;
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

    public static int getClientNumber() {
        return clientNumber;
    }

    public static void setClientNumber(int clientNumber) {
        Client.clientNumber = clientNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
