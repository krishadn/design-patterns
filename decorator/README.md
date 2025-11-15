# Decorator Design Pattern

*Codes from Head First Design Patterns 2nd Edition*

> [!IMPORTANT]
> The Decorator Pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

## Underlying OO design principles
- open-closed principle: classes should be open for extension but closed for modification.
  - since codes are tested rigorously, modifying existing codes can make it vulnerable to new bugs and therefore it is ideal to make it closed to modification
  - but since programs change and new requirements pop up, existing codes should be designed so as to allow easy extension of them, utilizing code reuse
  - extension of properties and behavior can be done through inheritance but an alternative way to extend behavior is through **Decorators** 
- favor composition over inheritance for getting behavior: while the Decorator class subclasses the Component it aims to decorate, it is only done for *type matching* not for getting behavior
  - Decorator pattern uses composition and delegation to add new behaviors dynamically (i.e at runtime)
  - the Decorator class is *composed* of a (HAS-A) Component instance variable to hold any object that has the class of the Component
  - it adds new behavior before, after, or in place of the call (delegation) to the component's method

## Examples
- Java I/O API