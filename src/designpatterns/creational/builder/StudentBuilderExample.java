package designpatterns.creational.builder;

public class StudentBuilderExample {
    public static void main(String[] args) {
        // Using the builder directly
        Student student1 = new StudentBuilder()
                .setFirstName("Alice")
                .setLastName("Smith")
                .setAge(20)
                .setMajor("Computer Science")
                .setGpa(3.8)
                .build();

        System.out.println(student1);

        // Using the director
        StudentDirector director = new StudentDirector();
        Student student2 = director.constructFullTimeStudent(new StudentBuilder(), "Bob", "Johnson", 22, "Mathematics", 3.5);
        System.out.println(student2);

        Student student3 = director.constructPartTimeStudent(new StudentBuilder(), "Charlie", "Brown", 25, "123 Main St");
        System.out.println(student3);
    }
}
