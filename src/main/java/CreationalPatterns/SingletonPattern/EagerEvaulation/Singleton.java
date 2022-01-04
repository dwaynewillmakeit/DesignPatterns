package CreationalPatterns.SingletonPattern.EagerEvaulation;

public class Singleton {

    private  static Singleton uniqueInstance = new Singleton();

    private int data = 0;

    //    No client should be able to instantiate a Singleton Object
    private Singleton() {
    }

    public static Singleton getInstance() {
            return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
