## Adapter Pattern

* The Adapter Pattern convert an interface of a Class into another interface that client expect
  * It basically works as a bridge between to incompatible interfaces
    * "Adapter" does the conversion
  * It lets classes work together the could not otherwise
  * It is also known as a **Wrapper**
* The Adapter Pattern can be implemented using **Composition(Object Approach)** or **Inheritance(Class Approach)**
  * The class approach to the Adapter Pattern is less focused on in Java because we need multiple inheritance to implement it and this is not possible in Java.
    * Interfaces are used as a workaround to this
  * ![image.png](assetsmage.png)

### Real World Example

* Simple AC Adapter
  * Only changes the shape of the outlet, so it matches your plug
  * pass the AC current straight through
* Complex AC Adapter
  * may need to step the power up or down to match your devices' needs
* Card Reader
  * Acts as an adapter between the memory card and a laptop
    * Plug the memory card ito the card reader
    * Plug the card reader into the laptop
    * the memory card can now be read via the laptop
* A Translator
  * Translating a language for one person to another

### Software Example

* We have an existing software system
  * We need to add a new vendor class library
  * The new vendor designed their interfaces differently that the last vendor
* We don't want to solve this problem by changing our existing code, and we cannot change the vendor's code
* We would have to write a Class that adapts the new vendor interface into the object you are expecting
* Adapter acts as the middleman by receiving requests from the client and converting them into requests that make sense in the vendor classes

### When to use the Adapter Pattern

* When we want to use an existing class but its interface doesn't match the one we need
* When we want to create a reusable class that cooperates with unrelated or unforeseen classes
  * i.e. classes that do not necessarily have compatible interfaces
* When we need to use several existing subclasses, but it is impractical to adapt their interface by sub-classing everyone
  * An Object adapter can adapt the interface of its parent class

#### Participants of the Adapter Pattern

**Target** -  Defines the domain specific interface that the Client uses

**Client** -  collaborates with objects conforming to the Target Interface

**Adaptee** - defines an existing interface that needs adapting

**Adapter** :

* adapts the interface of the Adaptee to the Target Interface.
* involves a single class which is responsible to join functionalities of independent or incompatible interfaces

#### How it works

##### Object Approach

* The **Client** makes a request to the adapter by calling a method on it using the target interface
* The **Adapter** translate the request into one or more calls on the adaptee using the Adaptee Interface
* The **Client** receives the result of the call and never knows there is an Adapter doing the translation
* Essentially the **Client** calls operations on an Adapter instance, and the Adapter in turns, calls Adaptee operations that carry out the request

##### Class Approach

* A Class Adapter is very similar to the Object Adapter i.e.
  * The Class Adapter will subclass the Target and the Adaptee
  * The Object Adapter will use composition to pass request to an Adaptee
    * Composition VS Inheritance
* A Class Adapter works by creating a new class which subclasses publicly from an abstract class to define its interface
  * Subclasses privately from our existing class to access its implementation
  * each wrapped method calls its associated, privately inherited method
* A Class Adapter adapts Adaptee to Target by committing to a concrete Adaptee class
  * This approach will not work when we want to adapt a class and all is subclasses
