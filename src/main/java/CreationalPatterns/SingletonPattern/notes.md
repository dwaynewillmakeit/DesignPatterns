This ensures a class has only one instance and provide a global access point to it.

It's import for some class to have only one instance
Eg:

1) Although there can be many printers in a system there should only be one printer spooler.
2) There should only be one file system and one window manager
3) An accounting system will be dedicated to serving one company
4) ThreadPool, Logging, driver caching etc.

There are 5 ways to Implement the Singleton Pattern

1) **Lazy Evaluation Approach**

   * This is not multi-thread safe
   * use this approach if you are not worried about multiple threads
   * This approach is NOT recommended
2) **Synchronized Approach**

   * thread safe
   * use when performance is not critical to you application, but, it is multi threaded
   * this approach is straightforward and effective
3) **Double-Checked Locking Principle Approach**

   * thread safe
   * increases performance from the synchronized approach
4) **Eager Evaluation Approach**

   * if your application always creates and uses an instance of the Singleton
   * does not use a lot of resources
   * thread safe
   * the instance is created even though client application might not be using it
5) **Bill Pugh Approach (RECOMMENDED)**

   * thread safe
   * high performance
   * ensures that the instance is only created if the client needs it
   * creates the Singleton class using a inner static helper class
   * regarded as the **standard method to implement singletons in Java**

### Lazy Evaluation Problems

* Not Thread Safe
  * Eg. If two calls to getInstance are made virtually at the sametime, the first thread will check to see whether the instance exists. Being that it doesn't exist it will be created.
  * However before it has done that, the second thread would have done the same check and also go into to creating the instance resulting into two Singleton Objects
  * If the Singleton is stateless, then thread safety may not be a problem
  * If the Singleton has state, and if you expect that when one object changes the state, all other objects should see the change, then this could become a serious problem
    * i.e the first thread will be interacting with a different object that all the other threads
* Inconsistent state between threas using different Sigleton objects
* If the objects creates a connection, there will actually be two connections i.e one for each connection
* If a counter is used, you will have two counters.
* It may be very dificul to find these problems
  * dual creation is very intermittent


### Synchronized Approach Problems

* The synchronized approach can lead to severe bottleneck
  * This is due to the fact that all the threads will have to wait their turn to access the the check to whether the Single to exist or no
  * Reduces performance as a result of the cost associated with the synchronized method
* The only time synchronization is relevant is the first time through the getInstance().
  * Once we have set a unique instance variable to an instance og Singleton, we jave no further need to synchronize this method
  * Therefore after the first time throuh,synchronization is totally unneeded overhead
* For most Java application, we need to ensure that the Singleton works in the presence of multiple threads and does not have performance issues
  * For this we can use the** Double Checked Locking Principle Approach**


### Double Checked Locking Principle

* This approach uses synchronized blocks instead of the if condition with an additional check to ensure that only one instance of the singleton class is created.
  * The intent is to optimize away unnecessary locking thus increasing performance.
  * The synchronize check happens at most one time, so it will not be a bottleneck
* uses double-checked locking to reduce the use of synchronization in getInstance()
* With Double-Checked Locking, we first check to see if the instance is created and if not THEN we synchronize
  * The synchronization will only happen once for the creation of the object.
* This doesnt work in Java 1.4 and earlier


### Eager Evaluation Approach

* In this approach the instance is created at the time of loading the class
  * This is the easiest method to create a singleton class
  * It has a drawback that the instance is created even though the Client might not use it
* Using this approach we rely on the JVM to create the unique instance of the Singleton when the class is loaded
  * The JVM gaurantees that the instance will be ceated before any thread accesses the static uniqueInstance variable (THREAD SAFE)
* Use this approach if your Singleton class is not using a lot of resources
* In most cases, Singleton classes are created for resources such as File Systems, Database connections etc
  * In these cases we should avoid instantiation until the Client calls the getInstance method

### Bill Pugh Approach

* This is the most widely used approach for Singleton class
* It does not require synchronization
* It is thread safe
* It only creates the instance when the client needs it
* It is regarded as the standard method to implement Singletons in Java
