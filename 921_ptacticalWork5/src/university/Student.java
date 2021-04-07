package university;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private int group;

    public Student(){}
    public Student(String name, String surname, int group){
        this.name=name;
        this.surname=surname;
        this.group=group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
       // if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && student.surname.equals(surname) && student.group == this.group;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group=" + group +
                '}';
    }
}
