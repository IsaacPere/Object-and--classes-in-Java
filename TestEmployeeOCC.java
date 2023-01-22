class ShopEmployee {
    int workers_id_number;
    String name_of_the_employee;
    float their_salary;
    void inserting(int and_the_employee_number,
                String the_name,
                float and_the_salary) {
        workers_id_number = and_the_employee_number;
        name_of_the_employee = the_name;
        their_salary = and_the_salary;
    }

    void displaying_information() {
        System.out.println(
            workers_id_number+""+name_of_the_employee+""+their_salary
        );
    }
}


public class TestEmployeeOCC {
    public static void main(String[] args) {
        ShopEmployee number_one = new ShopEmployee();
        ShopEmployee number_two = new ShopEmployee();
        ShopEmployee number_three = new ShopEmployee();

        number_one.inserting(001,"Mike",45000);
        number_two.inserting(0021,"Smith",50000);
        number_three.inserting(003,"Leo",65000);


        number_one.displaying_information();
        number_two.displaying_information();
        number_three.displaying_information();
    }
}
