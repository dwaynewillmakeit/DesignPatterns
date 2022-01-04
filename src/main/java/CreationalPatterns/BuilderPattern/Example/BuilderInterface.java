package CreationalPatterns.BuilderPattern.Example;

public interface BuilderInterface {

    void buildBody();
    void insertWheels();
    void addHeadLights();

    Product getVehicle();
}
