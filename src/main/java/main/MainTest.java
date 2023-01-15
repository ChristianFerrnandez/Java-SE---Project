package main;

import org.example.Client;

import java.util.ArrayList;
import java.util.List;

//1.1.2 Creation of main class for tests
public class MainTest {
    private ArrayList<Client> clientList = new ArrayList<>();


    public MainTest(ArrayList<Client> clientlist) {
        this.clientList = clientList;
    }

    public MainTest() {

    }

    public List generateClient (int numberClients) {
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
