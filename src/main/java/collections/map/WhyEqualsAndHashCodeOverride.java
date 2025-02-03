package collections.map;

import java.util.HashMap;

public class WhyEqualsAndHashCodeOverride {
    public static void main(String[] args) {
        HashMap<Object,String> hashMap = new HashMap<>();
        Person person = new Person("Salih",10);
        Employee employee = new Employee("Salih",10);
        Person person1 = new Person("Salih",10);
        hashMap.put(person,"salam");
        hashMap.put(employee,"Aleykum");
        System.out.println("employee : " + employee.hashCode());
        System.out.println("person : " + person.hashCode());
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(person1));
        System.out.println(hashMap.get(person));

        HashMap<String,String> stringHashMap = new HashMap<>();
        String s = new String("al");
        String b = new String("al");
        System.out.println("hashcode s " + s.hashCode());
        System.out.println("hashcode b "+b.hashCode());
        stringHashMap.put(s,"sa");
        stringHashMap.put(b,"sass");
        System.out.println(stringHashMap.size());
        System.out.println(stringHashMap.get(s));
    }
}
