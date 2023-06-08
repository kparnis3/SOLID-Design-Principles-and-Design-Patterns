Builder Design Pattern

What problem does a builder design pattern solve?

Class constructor requires a lot of information.
***
//Product instances are immutable
Class Product{
      public Product(int weight, double price, int shipVolume, int shipCode){
            //initialize
      }
      //other code
}

***

Objects that need other objects or "parts" to construct them.
***
class Address{
      public Address(String houseNumber, String street,...){
            //initialize
      }
}

class User { //We need Address, Locate and list of roles first
      public User(String name, Address address, Locate birthDate, List<Role> roles){
            //initialize
      }
      //other code
}
***

What is a Builder? 

- We have a complex process to construct an object involving multiple steps, then builder design pattern can help us.

- In builder we remove the logic related to object construction from "client" code & abstract it in separate classes.

Implement a Builder

- We start by creating a builder.

      - Identify the "parts" of the product & provide methods to create those parts.

      - It should provide a method to "assemble" or build the product/objects.

      - It must provide a way/method to get fully built objects out. *Optionally* builder can keep reference to a product it has built so the same can be returned again in the future.

- A director can be a separate class or client that can play the role of director.

Implementation Considerations

- Builder2 is a way to design the builder class, this is achieved by creating an immutable class by implementing a builder as an inner static class. This type of implementation is quite often used even if immutability is not a main concern.

- Director is rarely implemented as a separate class, typically the consumer of the object instance or the client handles that role.

Compare & Contrast with Prototype

Builder

- We have a complex constructor and builder allows us to work with that.

- We can creare a builder as a separate class and so it can work with legacy code.

Prototype

- Prototype allows to altogether skip using constructor.

- In java this pattern works using the clone method, and needs to modify existing code so may not work with legacy code.

Pitfalls

- Complex for new compers mainly because of 'method chaining' where builder methods returns the builder object itself. 

- Possibility of partially initialized object; user code can set only a few or none of properties using withXXX methods and call build(). IF required properties are missing, build method should provide suitable defaults or throw exception.


Summary

- Think of builder when a complex constructor or an object is built in multiple steps.

