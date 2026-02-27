public class MainObject {

    // ---------------- PERSON ----------------
    static class Person {
        String firstName;
        String lastName;
        String gender;

        public Person(String firstName, String lastName, String gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
        }

        public String toString() {
            return firstName + " " + lastName + " (" + gender + ")";
        }

        public boolean equals(Person p) {
            return firstName.equals(p.firstName) &&
                   lastName.equals(p.lastName) &&
                   gender.equals(p.gender);
        }
    }

    // ---------------- TEACHER ----------------
    static class Teacher extends Person {
        String department;
        String courses;

        public Teacher(String firstName, String lastName, String gender,
                       String department, String courses) {
            super(firstName, lastName, gender);
            this.department = department;
            this.courses = courses;
        }

        public String toString() {
            return super.toString() +
                   " Department: " + department +
                   " Courses: " + courses;
        }

        public boolean equals(Teacher t) {
            return super.equals(t) &&
                   department.equals(t.department) &&
                   courses.equals(t.courses);
        }
    }

    // ---------------- STUDENT ----------------
    static class Student extends Person {
        String studentId;

        public Student(String firstName, String lastName, String gender,
                       String studentId) {
            super(firstName, lastName, gender);
            this.studentId = studentId;
        }

        public String toString() {
            return super.toString() +
                   " ID: " + studentId;
        }

        public boolean equals(Student s) {
            return super.equals(s) &&
                   studentId.equals(s.studentId);
        }
    }

    // ---------------- PHD STUDENT ----------------
    static class PhdStudent extends Student {
        String department;
        String courses;

        public PhdStudent(String firstName, String lastName, String gender,
                          String studentId, String department, String courses) {
            super(firstName, lastName, gender, studentId);
            this.department = department;
            this.courses = courses;
        }

        public String toString() {
            return super.toString() +
                   " Department: " + department +
                   " Courses: " + courses;
        }

        public boolean equals(PhdStudent p) {
            return super.equals(p) &&
                   department.equals(p.department) &&
                   courses.equals(p.courses);
        }
    }

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        Person p = new Person("Ali", "Karimov", "Male");
        Teacher t = new Teacher("Aysel", "Aliyeva", "Female",
                "Computer Science", "OOP");
        Student s = new Student("Farid", "Mammadov", "Male",
                "12345");
        PhdStudent phd = new PhdStudent("Nigar", "Huseynova", "Female",
                "54321", "Math", "Algorithms");

        System.out.println(p);
        System.out.println(t);
        System.out.println(s);
        System.out.println(phd);

        // test equals
        Person p2 = new Person("Ali", "Karimov", "Male");
        System.out.println("Person equal: " + p.equals(p2));
    }
}
