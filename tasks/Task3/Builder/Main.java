package tasks.Task3.Builder;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder().setName("John").setAge(25).setSalary(1000000).build();
        System.out.println(person);
        Person person2 = new Person.PersonBuilder().setName("James").setSalary(123123).setAge(44).build();
        System.out.println(person2);
    }
}