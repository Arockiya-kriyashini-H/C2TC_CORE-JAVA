package com.tns.ifet.exercise1;



//Custom Exception for Invalid Input
class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) throws InvalidInputException {
        if (id <= 0) throw new InvalidInputException("ID must be positive.");
        if (name == null || name.isEmpty()) throw new InvalidInputException("Name cannot be empty.");
        if (salary <= 0) throw new InvalidInputException("Salary must be positive.");

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}