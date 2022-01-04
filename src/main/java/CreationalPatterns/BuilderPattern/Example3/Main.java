package CreationalPatterns.BuilderPattern.Example3;

public class Main {

    public static void main(String... args){

        Person james = new PersonBuilder("James","Bond").address("USA").phone("007").age(55).build();

        System.out.println(james);
    }
}
