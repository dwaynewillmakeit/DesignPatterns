package CreationalPatterns.SingletonPattern.EagerEvaulation;

public class TestSingleton {

    public static void main(String[] args){

        Singleton s = Singleton.getInstance();

        s.setData(100);

        System.out.println("First Singleton reference: "+s);
        System.out.println("Singleton data value is: "+s.getData());

        Singleton s2 = Singleton.getInstance();

        System.out.println("Second Singleton reference: "+s2);
        System.out.println("Second reference data is: "+s2.getData());



    }
}
