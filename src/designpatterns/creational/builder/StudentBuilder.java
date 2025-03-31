package designpatterns.creational.builder;

public class StudentBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String major;
    private String address;
    private double gpa;

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setMajor(String major) {
        this.major = major;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setGpa(double gpa) {
        this.gpa = gpa;
        return this;
    }

    public Student build() {
        return new Student(firstName, lastName, age, major, address, gpa);
    }
}
