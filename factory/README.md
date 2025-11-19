# Factory Method Design Pattern

*Codes from Head First Design Patterns 2nd Edition*

> [!IMPORTANT]
> The Factory Method Pattern defines an interface for creating **an object**, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
> The Abstract Factory Pattern provides an interface for creating **families** of related or dependent objects without specifying their concrete classes.

- Using the **new** operator to **instantiate** a concrete class is programming to an implementation
- Using concrete class => object dependencies => fragile, less flexible code
- All factory pattern encapsulate object creation

## Requirements
- Various subclasses/products (or family of subclasses/products) for a given abstract class/interface that we can select from to instantiate depending on certain conditions
- We don't know until runtime which subclass/product (or family of subclasses/product) to instantiate
- There may be other clients that needs to use an object of an abstract class/interface, the concrete implementation of which is still deferred to runtime

## Components
- Creator classes: provides an interface with a method to create objects ("factory method")
  - contains other methods ("clients") that uses the object created by the factory method
  - factory method is only implemented by the subclasses 
- Product classes: classes that are instantiated and used by clients

## Factory Method Pattern vs Abstract Factory Pattern
- FMP relies on inheritance to implement the factory method
- AFP relies on composition with abstract class to use the implemented factory methods

## Underlying OO design principles
- Dependency inversion: depend upon abstractions not concrete classes; high-level components should not depend on low-level components
  - both components should depend on abstractions
  - high-level components: class defined in terms of other low-level components