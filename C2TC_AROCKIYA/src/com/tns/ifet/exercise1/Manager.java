package com.tns.ifet.exercise1;

class Manager extends Employee {
    private String department;

    public Manager(int id, String name, double salary, String department) throws InvalidInputException {
        super(id, name, salary);
        if (department == null || department.isEmpty()) throw new InvalidInputException("Department cannot be empty.");
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department=" + department;
    }
}