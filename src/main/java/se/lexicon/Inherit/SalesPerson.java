package se.lexicon.Inherit;

import java.sql.Array;
import java.util.Arrays;

public class SalesPerson extends Employee {

    private final int extraSalaryForClient = 500;
    private final int extraSalaryForNewClient = 1000;

    private String[] clients;
    private int[] acquiredClients;

    public SalesPerson() {
        clients = new String[0];
        acquiredClients = new int[0];
    }

    @Override
    public void calculateSalary() {
        double salesResult = baseSalary + (extraSalaryForClient * clients.length) +
                (extraSalaryForNewClient * acquiredClients.length);
        setSalary(salesResult);
    }

    public void addClientsToArrays(String client) {
        String[] newArray1 = Arrays.copyOf(clients, clients.length+1);
        newArray1[newArray1.length - 1] = client;
        setClients(newArray1);
    }

    public void addAcquiredClientToArrays(int acquiredClient) {
        int[] newArray = Arrays.copyOf(acquiredClients, acquiredClients.length+1);
        newArray[newArray.length - 1] = acquiredClient;
        setAcquiredClients(newArray);

    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int[] getAcquiredClients() {
        return acquiredClients;
    }

    public void setAcquiredClients(int[] acquiredClients) {
        this.acquiredClients = acquiredClients;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "extraSalaryForClient=" + extraSalaryForClient +
                ", extraSalaryForNewClient=" + extraSalaryForNewClient +
                ", clients=" + Arrays.toString(clients) +
                ", acquiredClients=" + Arrays.toString(acquiredClients) +
                 super.toString() +
                '}';
    }
}
