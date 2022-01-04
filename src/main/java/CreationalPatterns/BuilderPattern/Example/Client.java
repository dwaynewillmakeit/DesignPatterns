package CreationalPatterns.BuilderPattern.Example;

public class Client {

    public static void main(String... args){

        Director director = new Director();

        BuilderInterface carBuilder = new Car();

        director.construct(carBuilder);

        Product car = carBuilder.getVehicle();

        car.show();

        BuilderInterface motorCycleBuilder = new MotoCycle();
        director.construct(motorCycleBuilder);
        Product motoCycle = director.myBuilder.getVehicle();
        motoCycle.show();
    }
}
