# Builder Design Pattern

* This pattern separates the construction of a complex object from its representation
* This pattern was introduced to solve the problem of working with Objects that contains a lot of attributes
* **Advantage**
  * It encapsulates the way a complex object is constructed
    * Separates the code of assembling from its representation
    * hides the complex construction process and represents it as a simple process
  * Allows object to be constructed in a multiple and varying process (as opposed to one-step factories)
  * Hides the internal representation of the product from the Client
  * Product Implementation can be swapped in and out because the Client only sees  an abstract interface
  * Focus on **"how the product will be made"**
* **Disadvantage**
  * Often used to build composite structures
  * Contracting object requires more domain knowledge of the client than when using a Factory
  * Requires some amount of **code duplication**

#### Summary

* Use the Builder Pattern when:
  1. The algorithm for creating a complex object should be independent of he parts that make up the object and how the are assembled
  2. The construction process must allow different representation for the object that is constructed
* We should **NOT** use this pattern if we want a mutable object
  * an object which can be modified after the creation process is over

#### Builder Implementation

The main parts when implementing the Builder Pattern are the following:

* Builder
  * This specifies an abstract interface for creating parts of a Product object
  * Defines an operation for each component that a Director may ask it to create
  * Must be general enough to allow the construction of products for all kinds of concrete builders
* **Concrete Builder**
  * Constructs and assembles parts of the product by implement the Builder Interface
    * Overrides operations for components it is interested in
  * Defines and keeps track of the representation it creates
    * Usually appended to the product via some type of list
    * Sometimes you might need access to parts of the product constructed earlier
      * The personBuilder would return child nodes to the Director, which then would pass them back to the personBuilder to build the parent nodes
    * Provides an Interface for retrieving the product (**getProduct**)
* **Director**
  * constructs an object using the Guilder Interface
* **Product**
  * Represents the complex object under construction
  * Concrete Builder builds the product's internal representation and defines the process by which it is assembled
  * Includes classes that define the constituent parts, including interfaces for assembling the parts into the final result
* Steps
  * The **Client** creates the Director Object and configures it with the desired Builder Object
  * The **Director** notifies the personBuilder whenever a part of the product should be built
  * The **Builder** handles requests from the Director and adds parts to the Product
  * The **Client** Retrieves the Product from the Builder.
