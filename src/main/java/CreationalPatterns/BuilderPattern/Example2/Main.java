package CreationalPatterns.BuilderPattern.Example2;

public class Main {

    public static void main(String... args) {

        User james = new User.UserBuilder("Dwayne", "Williams")
                .address("Jamaica")
                .age(50)
                .phoneNumber("911")
                .build();

        System.out.println(james.toString());

    }
}
