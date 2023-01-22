class SchoolStudents{
    int the_students_id_number;
    String students_name;
}


public class TestStudent3 {
    public static void main(String[] args) {
        SchoolStudents first_students_details = new SchoolStudents();
        SchoolStudents second_students_details = new SchoolStudents();
        first_students_details.the_students_id_number = 101;
        first_students_details.students_name = "Mike Smith";
        second_students_details.the_students_id_number = 102;
        second_students_details.students_name = "Urban Scala";
        System.out.println(first_students_details.the_students_id_number+ " "
        +first_students_details.students_name);
        System.out.println(second_students_details.the_students_id_number+ " "
        +second_students_details.students_name);
    }
}
