#Simple Factory

##What problem does simple factory solve?
Multple types can be instantiated and the choice is based on some simle critera

"""
if(key.equalsIgnoreCase("Pudding")){
      //create pudding object
}else if(key.equalsIgnoreCase("cake")){
      //create cake object
}

"""

- Here we simply move the instantiation logic to a separate class and most commonly to a static method of this class.

- Simple factory is not always considered as a "design pattern", as its simply a method that encapulates object instantiation. 

- Typically used if we have more than one option when instantiating obkect and a simple logic is used to choose a correct class.

##Implementing a Simple Factory

- We start by creating a separate class for our simple factory.

     - Add a method which returns desired object instance.
      
          - This method is typically static and will accept some arguments to decide which class to instantiate.

          - You can also provide additional arguments which will be used to instantiate objects

##Implementation Considerations

- Simple Factory can just be a method in existing class. Adding a separate class however allows other parts of your code to use simple factory more easily.

- Simple factory can in turn use other design patterns such as builder to construct objects.

- In case we want to specialize your simple factory in sub classes, you need a factory method design pattern instead.


##Compare & Contrast with factory method pattern

###Simple Factory

- We simply move our instatiation logic away from client code. Typically in a static method.

- Simple Factory knows about all classes whose objects it can create

###Factory Method

- Factory method is more useful when we want to delegate object creation to subclasses.

- In the factory method, we don't know in advance about all product subclasses.

##Pitfalls

- The criteria used by simple factory to decide which object to instantiate can get more convoluted/complex overtime. In this situation its better to use factory method instead.

