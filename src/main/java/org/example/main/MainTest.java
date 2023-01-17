package org.example.main;


import org.example.Account;
import org.example.Client;
import org.example.CurrentAccount;
import org.example.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

//1.1.2 Creation of main class for tests
public class MainTest  {
    private ArrayList<Client> clientList = new ArrayList<>();
    private ArrayList<Account> accountsList = new ArrayList<>();


    public ArrayList loadAccounts(ArrayList<Client>clientList) {
        return accountsList;

    }
    
    public ArrayList generateClient (int numberClients) {
        for (int i = 0; i<numberClients; i++) {
            clientList.add(new Client("name" + i, "firstname" + i));

        }
        return clientList;
    }



    @Override
    public String toString() {
        return "The clist " + clientList;
    }
}
