package CreationalPatterns.SingletonPattern.SynchronizedApproach;

public class Singleton {

    private static Singleton uniqueInstance = null;

    private int data = 0;

//    No client should be able to instantiate a Singleton Object
    private Singleton(){}

// By adding synchronized keyword to the getInstance(),
// We force every thread to wait its turn before it can enter the method
    public static synchronized Singleton getInstance( ){
        if(uniqueInstance == null){
                uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
