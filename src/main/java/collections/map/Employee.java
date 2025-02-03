package collections.map;

import java.util.Objects;

public class Employee {
    String name;

    int age;

    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        // Person və Employee obyektləri eyni kimi qəbul edilsin
        if (obj instanceof Person || obj instanceof Employee) {
            Person other = (Person) obj; // Burada Person-a çeviririk, çünki hər ikisində name və age var
            return age == other.age && Objects.equals(name, other.name);
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
