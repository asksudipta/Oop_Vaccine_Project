package se.lexicon.Inherit;

import java.time.LocalDate;

public class TestEmployee {
    public static void main(String[] args) {

        SystemDeveloper fullstackDeveloper1=new SystemDeveloper();
        fullstackDeveloper1.setName("developer1");
        fullstackDeveloper1.addCertificateToArray("OCA");

        fullstackDeveloper1.addLanguageToArray("C#");
        fullstackDeveloper1.addLanguageToArray("Java");

        fullstackDeveloper1.setDateHired(LocalDate.parse("2020-06-08"));
        fullstackDeveloper1.calculateSalary();


        SystemDeveloper fullstackDeveloper2=new SystemDeveloper();
        fullstackDeveloper2.setName("developer1");
        fullstackDeveloper2.addCertificateToArray("OCA");
        fullstackDeveloper2.addLanguageToArray("Python");
        fullstackDeveloper2.setDateHired(LocalDate.parse("2022-12-01"));
        fullstackDeveloper2.calculateSalary();

        System.out.println(fullstackDeveloper1);
        System.out.println(fullstackDeveloper2);

   //Salesperson employ ex:
        SalesPerson salesPerson1=new SalesPerson();
        salesPerson1.setName("Sales1");
        int [] arr= {1,2,5,6};
        salesPerson1.setAcquiredClients(arr);

        salesPerson1.addClientsToArrays("Test");

        salesPerson1.calculateSalary();

        System.out.println(salesPerson1);

    }




}
