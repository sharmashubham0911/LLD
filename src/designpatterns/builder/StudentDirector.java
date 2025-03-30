package designpatterns.builder;

class StudentDirector {
    public Student constructFullTimeStudent(StudentBuilder builder, String firstName, String lastName, int age, String major, double gpa) {
        return builder.setFirstName(firstName)
                .setLastName(lastName)
                .setAge(age)
                .setMajor(major)
                .setGpa(gpa)
                .build();
    }

    public Student constructPartTimeStudent(StudentBuilder builder, String firstName, String lastName, int age, String address) {
        return builder.setFirstName(firstName)
                .setLastName(lastName)
                .setAge(age)
                .setAddress(address)
                .build();
    }
}
