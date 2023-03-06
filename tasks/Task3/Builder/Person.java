package tasks.Task3.Builder;

public class Person {

    private String name;
    private int age;
    private int salary;

    @Override
    public String toString() {
        return "Person {name='" + name + "', age=" + age +", salary=" + salary + '}';
    }

    static class PersonBuilder implements IPersonBuilder{

        private final Person person = new Person();

        @Override
        public IPersonBuilder setName(String name) {
            person.name = name;
            return this;
        }

        @Override
        public IPersonBuilder setAge(int age) {
            person.age = age;
            return this;
        }

        @Override
        public IPersonBuilder setSalary(int salary) {
            person.salary = salary;
            return this;
        }

        @Override
        public Person build() {
            return person;
        }
    }
}