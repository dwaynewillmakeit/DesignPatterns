package CreationalPatterns.SingletonPattern.LazyInitialization;

public class Singleton {

    private static Singleton uniqueInstance = null;

    private int data = 0;

//    No client should be able to instantiate a Singleton Object
    private Singleton(){}

    public static Singleton getInstance( ){
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
