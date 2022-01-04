package CreationalPatterns.SingletonPattern.DoubleCheckedLockingApproach;

public class Singleton {


    private int data = 0;

    //    No client should be able to instantiate a Singleton Object
    private Singleton() {
    }

    private static class SingletonHelper{
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance() {
            return SingletonHelper.uniqueInstance;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
