class SchoolStudents {
    int school_id_number;
    String students_name;
}

public class TestStudents2 {
    public static void main(String[] args) {
        SchoolStudents second_students = new SchoolStudents();
        second_students.school_id_number = 101;
        second_students.students_name = "Isaac";
        System.out.println(second_students.school_id_number+""
        +second_students.students_name);
    }
}
