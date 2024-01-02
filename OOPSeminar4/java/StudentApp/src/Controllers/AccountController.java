package Controllers;

import java.util.List;

import Domain.Person;
import Domain.Teacher;

public class AccountController {

    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    //Загатовка для метода averageAge
    // public static <T extends Person> double averageAge(List<T> persons)
    // {
    //     return 0.0;
    // }

    public static <T extends Person> double averageAge(List<T> people) {
        double sum = 0;
        for (T person : people) {
            sum += person.getAge();
        }
        return sum / people.size();
    }
}
