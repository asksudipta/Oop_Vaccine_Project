package se.lexicon.Inherit;

import java.time.LocalDate;

public abstract class Employee {
    public final int baseSalary = 25000;

    private int id;
    private String name;
    private double salary;
    private LocalDate dateHired;

    public Employee() {
        this.id = EmployeeIdSequence.nextId();
    }

    public abstract void calculateSalary();



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + ", dateHired=" + dateHired + '}';
    }
}
