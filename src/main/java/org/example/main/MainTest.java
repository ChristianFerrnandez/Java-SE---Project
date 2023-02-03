package org.example.main;



import org.example.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 1.1.2 Creation of main class for tests
 */
public class MainTest {

    private ArrayList<Client> clientList = new ArrayList<>();    //Creation of array of Clients
    private ArrayList<Account> accountList = new ArrayList<>();       //Creation of array of Accounts
    private HashMap<Integer, Account> accountHashMap = new HashMap<Integer, Account>();   //Creation Hashmap of Accounts
    Flow[] arrayflows = new Flow[4];

    /**
     * Method to generate multiple clients
     *
     * @param numberClients
     * @return arraylist of clients
     */
    public List generateClient(int numberClients) {
        for (int i = 0; i < numberClients; i++) {
            clientList.add(new Client("name" + i, "firstname" + i));

        }
        return clientList;
    }


    /**
     * Method to display the collection of Clients
     *
     * @return
     */

    @Override
    public String toString() {
        return "MainTest{" +
                "clientList=" + clientList +
                '}';
    }

    /**
     * 1.2.3 Method to create CurrentAcount and SavingAccount per client
     *
     * @param clientList
     * @return accountList
     */

    public ArrayList loadAccounts(ArrayList<Client> clientList) {
        Iterator iterator1 = clientList.iterator();

        for (int i = 0; i < clientList.size(); i++) {
            accountList.add(new CurrentAccount("Current Account", clientList.get(i)));
            accountList.add(new SavingsAccount("Saving Account", clientList.get(i)));

        }

        return accountList;
    }

    /**
     * Method to display the collection of Accounts
     *
     * @return
     */
    public String printAccountsList() {
        return accountList.toString();
    }


    /**
     * 1.3.1 Method of the adaptation of the collection of Accounts
     *
     * @param accountsList
     * @return accountHashMap
     */
    public HashMap loadMap(ArrayList<Account> accountsList) {
        for (int i = 0; i < accountsList.size(); i++) {
            accountHashMap.put(accountsList.get(i).getAccountNumber(), accountsList.get(i));
        }
        return accountHashMap;
    }


    /**
     * 1.3.1 Method to display and sort the map in ascending order acording to the balance.
     */
    public String toStringMap() {
        return "HashMap of accounts" + accountHashMap.entrySet().stream().sorted(Comparator.comparingDouble(e -> e.getValue().getBalance())).
                collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (left, right) -> left,
                        LinkedHashMap::new));
    }

    /**
     * 1.3.4 Creation of the flow array
     */
    public Flow[] creationFlows(Flow[] flows) {
        LocalDate localDate = LocalDate.now().plusDays(2);

        flows[0] = new Debit("Debit to account 1", 1, 50.00, 1, true, localDate);

        for (int i = 0; i < accountList.size(); i++) {
            flows[1] = new Credit("Credit to all", 2, 100.50, i, true, localDate);

            flows[2] = new Credit("Credit to all", 3, 100.50, i, true, localDate);
        }

        flows[3] = new Transfer(
                "Trasfer fromm account 1 to 2", 4, 50.00, 1, true, localDate, 2);
        return flows;
    }

    /**
     * Method to load Json
     */
    public void loadJson() {
        Path path = Paths.get("C:\\Users\\34678\\Downloads\\IdeaProjects\\CFBank\\src\\main\\resources");

    }


}
