package CreationalPatterns.BuilderPattern.Example3;

public class PersonBuilder {
    //Required parameters
    protected final String firstName;
    protected final String lastName;

    //Optional parameters
    protected String phoneNumber;
    protected String address;
    int age;

    public PersonBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonBuilder phone(String phone) {
        this.phoneNumber = phone;

        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return new DefaultPerson(this);
    }
}