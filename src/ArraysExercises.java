import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        Person person1 = new Person("Robert");
        Person person2 = new Person("Mary");
        Person person3 = new Person("Brittany");
        Person person4 = new Person("Katy");


        Person[] people = {person1, person2, person3, person4};

        Person person5 = new Person("Amanda");
        people = addPerson(people, person5);

        for (Person person : people) {

            System.out.println(person.getName());
        }

    }
       public static Person[] addPerson(Person[] people, Person anotherPerson) {
           Person[] newPeople = new Person[people.length + 1];
           newPeople[0] = people[0];
           newPeople[1] = people[1];
           newPeople[2] = people[2];
           newPeople[3] = people[3];
           newPeople[4] = anotherPerson;

           return newPeople;


        }


    }

