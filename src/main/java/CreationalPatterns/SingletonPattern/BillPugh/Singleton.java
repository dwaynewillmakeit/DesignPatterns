package CreationalPatterns.SingletonPattern.BillPugh;

public class Singleton {

    //Adding the volatile keyword ensures that the changes made to this variable by one thread
    // is immediately visible to the other threads
    private volatile static Singleton uniqueInstance = null;

    private int data = 0;

    //    No client should be able to instantiate a Singleton Object
    private Singleton() {
    }

    public static Singleton getInstance() {

        if (uniqueInstance == null) {

            synchronized (Singleton.class) { //This ensures we only synchronize the first time through
                //Check again if the instance is null while in the synchronize mode
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }

            }
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
