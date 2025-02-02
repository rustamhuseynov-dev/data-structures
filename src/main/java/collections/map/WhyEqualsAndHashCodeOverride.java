package collections.map;

import java.util.HashMap;

public class WhyEqualsAndHashCodeOverride {
    public static void main(String[] args) {
        HashMap<Person,String> hashMap = new HashMap<>();
        Person person = new Person();
        person.age = 10;
        person.name = "Salih";

        Person person1 = new Person();
        person1.age = 10;
        person1.name = "Salih";
        hashMap.put(person,"salam");
        hashMap.put(person1,"Aleykum");
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
