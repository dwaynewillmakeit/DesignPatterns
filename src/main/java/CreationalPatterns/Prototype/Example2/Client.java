package CreationalPatterns.Prototype.Example2;

public class Client {

    public static void main(String[] args) {
        Person person = new Person("Jessica",23);
        System.out.println("Person1: "+person);

        Person person1 = (Person) person.clone();
        System.out.println("Person 2:  "+person1);
    }
}
