* The Prototype pattern refers to creating a duplicate object while keeping performance in mind
* It specifies the kinds of objects to create using a prototypical instance and creates new objects by copying this prototype
* It is used when the creation of an object is costly, requires a lot of time and resources and you have a similar object already
  * Creating a new instance is normally treated as an expensive operation
  * The focus of the Prototype Pattern is to reduce the expense of this creational process of a new instance
* It provides a mechanism to copy the original obejct to a new object and then modify it according to our needs
  * Uses Java cloning to create a **shallow** copy of the object or de-serialization when you need **deep** copies
* This pattern mandates that the Object you are copying should provide the copying feature
  * Should not be done by any other class
  * Whether to perform a shallow or deep copy depends on the requirements and design

Example Uses

Suppose we have an Object that loads data from a database and we need to modify this data in our program multiple times.

It is not a good idea to create the Object using the **new** keyword and load all the data again from database

We can instead cache the object and return a clone of the object on the next request. Update the database when needed. Reduce the number of DB calls


Use Cases

* When a system should be independent of how its products are created, composed and represented
  * i.e it doesn't care about the creation mechanism of the products
* This pattern can be used when we need to instantiate classes at run time i.e dynamic loading
* Can be used when a system must create new objects of many types in a complex class hierarchy
  * i.e You want to build a class hierarchy of factories that parrallels the class hierarchy of products
* Used when instancies of a class can have one of only a few different combinations of state.
  * It may be more convenient to install a corresponding numnber of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state.

The main parts of the Prototype Pattern are

1. Prototype - declares an interface for cloning itself
2. Concrete Prototype - Implements an operation for cloning itself
3. Client -  creates a new object by asking a prototype to clone itself
