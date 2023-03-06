package tasks.Task3.Builder;

public interface IPersonBuilder {

    IPersonBuilder setName(String name);

    IPersonBuilder setAge(int age);

    IPersonBuilder setSalary(int salary);

    Person build();
}