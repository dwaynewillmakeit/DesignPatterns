package CreationalPatterns.BuilderPattern.Example3;

public class DefaultPerson implements Person{

    //Required parameters
    private final String firstName;
    private final String lastName;

    //Optional parameters
    protected String phoneNumber;
    protected String address;
    int age;


    private DefaultPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    protected DefaultPerson(PersonBuilder personBuilder) {
//
        this(personBuilder.firstName, personBuilder.lastName);
        this.phoneNumber = personBuilder.phoneNumber;
        this.address = personBuilder.address;
        this.age = personBuilder.age;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }


    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "DefaultPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
