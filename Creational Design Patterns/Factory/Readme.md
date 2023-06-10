# Factory

## What is a Factory Method?

- We want to move the object creation logic from our code to a seperate class.

- We use this pattern when we do not know in advance which class we may need to instantiate beforehand & also to allow new classes to be added to our system and handle their creation without affecting client code.

- We let subclasses decide which object to instantiate by overriding the factory method.

## Implement a Factory Method.

- We start by creating a class for our creator.

    - Creator itself can be concrete if it can provide a default object or it can be abstracted.

    - Implementations will override the method and return an object.

## Implementation Considerations.

- The creator can be a concrete class & provide a default implementation for the factory method. In such cases we cab create some 'default' objects as a base creator.

- We can also use the simple factory way of accepting additional arguments to choose between different object types. Subclasses can then override the factory method to selectively create different objects for some criteria.

## Design Considerations

- Creator hierarchy in the factory method pattern reflects the product hierarchy. We typically end up with a concrete creator per object type.

- Template method design pattern often makes use of factory methods.

- Another creational design pattern called "abstract factory" make use of the factory method pattern.

## Pitfalls

- More complex to implement. More classes involved and needs unit testing.

- Have to start with Factory method from the beginning, it's not east to refactor exisiting code into a factory method pattern.

- Sometimes we are forced to use subclasses just to create appropriate instances.

## Summary

- Use factory method pattern when we want to delegate object instantiation to subclasses, we would want to do this when we have a 'product' inheritance hierarchy and a possibility of future additions to this.