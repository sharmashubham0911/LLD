package designpatterns.creational.builder;

class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String major;
    private String address;
    private double gpa;

    public Student(String firstName, String lastName, int age, String major, String address, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.major = major;
        this.address = address;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public String getAddress() {
        return address;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}