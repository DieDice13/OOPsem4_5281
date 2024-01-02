package Services;

import java.util.List;

import Domain.PersonComparator;
import Domain.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private List<Teacher> teachers; // Список учителей

    public TeacherService(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void printSortedTeachers() {
        teachers.sort(new PersonComparator());
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age);
        teachers.add(teacher);
    }
}
