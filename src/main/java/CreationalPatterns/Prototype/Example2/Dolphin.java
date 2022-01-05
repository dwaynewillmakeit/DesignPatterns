package CreationalPatterns.Prototype.Example2;

public class Dolphin implements Prototype{

    private String name;
    private String age;

    public Dolphin(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new Dolphin(name,age);
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
