# Strategy Design Pattern

*Codes from Head First Design Patterns 2nd Edition*

> [!IMPORTANT]
> The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

## Underlying OO design principles
- separate/encapsulate the parts that change/vary from the parts that stays the same
  - to apply this using Strategy Pattern, the behaviors for the same class that vary from different types of object is encapsulated into a **family of algorithms** that performs the same thing, differently (i.e. a family of sorting algorithms). The members of this family implements the same interface.
- program to an interface, not an implementation
  - for parts that vary, setting behavior to an interface (interface represents a behavior) rather than relying on implementation lets us be more flexible and dynamic in assigning behaviors to objects
  - one way to do this is to declare the variables to a supertype, rather than defining specific implementation in an object, so that these variables can contain any implementation of that supertype
- favor composition over inheritance (HAS-A >>> IS-A)
  - instead of implementing behavior that can be inherited or overriden, a superclass can be **composed** with behavior objects
