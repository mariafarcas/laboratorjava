public class Person {
    private String name;
    private String email;
    private int[] grades;
    private String[] courses;

    public Person(String name, String email, int[] grades, String[] courses) {
        this.name = name;
        this.email = email;
        this.grades = grades;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public static void main(String[] args) {
        int[] studentGrades = {90, 85, 78};
        String[] professorCourses = {"Mathematics", "Physics"};

        Person person = new Person("John Doe", "john.doe@example.com", null, null);
        Person student = new Person("Alice Smith", "alice.smith@example.com", studentGrades, null);
        Person professor = new Person("Dr. Smith", "dr.smith@example.com", null, professorCourses);

        System.out.println("Datele person: " + person.getName() + ", " + person.getEmail());
        System.out.println("Notele studentului: " + student.getName() + ", " + student.getEmail());
        if (student.getGrades() != null) {
            for (int grade : student.getGrades()) {
                System.out.print(grade + " ");
            }
            System.out.println();
        }
        System.out.println("Cursurile profesorului: " + professor.getName() + ", " + professor.getEmail());
        if (professor.getCourses() != null) {
            for (String course : professor.getCourses()) {
                System.out.print(course + " ");
            }
            System.out.println();
        }
    }
}
