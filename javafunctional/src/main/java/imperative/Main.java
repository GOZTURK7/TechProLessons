package imperative;

import java.util.ArrayList;
import java.util.List;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person ("John", MALE),
                new Person ("Maria", FEMALE),
                new Person ("Aisha", FEMALE),
                new Person ("Alex", MALE),
                new Person ("Alice", FEMALE)

        );

        // Imperative approach
        List<Person> females = new ArrayList<>();

        for(Person person : people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for(Person female : females){
            System.out.println(female);
        }
        System.out.println("*********************");



        // Declarative Approach
        people.stream().filter(person->FEMALE.equals(person.gender)).forEach(System.out::println);

    }

    public static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    public enum Gender {
        MALE, FEMALE
    }
}
