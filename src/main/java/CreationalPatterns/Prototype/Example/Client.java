package CreationalPatterns.Prototype.Example;

public class Client {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape = ShapeCache.getShape("1");

        System.out.println("Copied Shape: "+cloneShape);
    }
}
