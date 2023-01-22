class SchoolStudent{
    int students_roll_number;
    String name_of_the_students;

    void insert_record(int the_roll_number, String students_name) {
        students_roll_number = the_roll_number;
        name_of_the_students = students_name;
    }

    void displaying_information () {
        System.out.println(students_roll_number+""+name_of_the_students);
    }

}

public class TestStudents4 {
    public static void main(String[] args) {
        SchoolStudent students_number_one = new SchoolStudent();
        SchoolStudent students_number_two = new SchoolStudent();
        students_number_one.insert_record(111,"Air Spider");
        students_number_two.insert_record(222, "Nick Furry");
        students_number_one.displaying_information();
        students_number_two.displaying_information();
    }
}
