### Prototype

## What is a Prototype?

- We have a complex object that is costly to create. To create more instances of such class, we use an existing instance as our prototype.

- Prototype allows us to make copies of existing objects & saves us from having to recreate objects from scratch.

## Implement a Prototype

- We start by creating a class which will be a prototype

     - The class must implement a Cloneable interface.

     - Class should override the clone method and return a copy of itself.

     - The method should declare a 'CloneNotSupportedException' in throws clause to give subclasses a chance to decide on whether to support cloning.

- Clone method should consider the deep & shallow copy and choose whichever is applicable.

## Implementation Considerations

- Important to pay attention to deep and shallow copy references, Immutable fields on clones save the trouble of deep copy.

- Make sure to reset the mutable state of objects before returning the prototype. It's a good idea to implement this in a method to allow our subclasses to initilize themselves.

- clone() method is protected in Object class and must be overrriden to be public to be callable from outside the class.

- Clonable is a "marker" interface, an indication that the class supports cloning.

## Design Considerations

- Useful when we have large objects where the majority of the state is unchanged between instances and we can easily identify the state.

- A prototype registery is a class where you can register various prototypes which other code can access to clone out instances, This solves the issue of getting access to initial instance.

- Prototypes are useful when working with Composite and Decorator Patterns

## Compare & Contrast with Singleton

# Prototype

- We return a copy of an instance, meaning we get a different instance.

- Some or even all of the state of instances created with prototypes can be different.

# Singleton

- We return the same instance every time.

- Since it's the same object that is returned, state is always the same.

## Pitfalls

- Usability depends upon the number if properties in state that are immutable or can be shallow copied. An object where state is comprised of large number of mutable objects is complicated to clone.

- In java the default clone operation will only perform the shallow copy so if we deep copy we need to implement it.

- Subclasses may not be able to support clone so the code becomes complicated as we have to clone for situations where an implementation may not support cloning.

## Summary

- Think of prototype pattern when we have an object where construction of a new instance is costly or not possible (objects is supplied to code).

- In java we typically implement this pattern with the clone method.

- Objects that have a majority of their state sa immutable are good candidates for prototypes.

- When implementing the clone method we need to pay attention to the requirement of deep and shallow copy of an object state.

- Also we have to ensure that clone is 'initialized'; that is appropriate states are reset before returning the copy to the outside world.
