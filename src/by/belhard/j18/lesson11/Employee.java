package by.belhard.j18.lesson11;

import java.util.Date;

public class Employee {
    private int id;

    private String name;

    private Date dateOfEmployment;

    private Specialty specialty;

    private int salary;

    public Employee(int id, String name, Date dateOfEmployment, Specialty specialty, int salary) {
        this.id = id;
        this.name = name;
        this.dateOfEmployment = dateOfEmployment;
        this.specialty = specialty;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfEmployment=" + dateOfEmployment +
                ", specialty=" + specialty +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
