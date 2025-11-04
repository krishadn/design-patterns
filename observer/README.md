# Observer Design Pattern

*Codes from Head First Design Patterns 2nd Edition*

> [!IMPORTANT]
> The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

## Underlying OO design principles
- loose coupling: strive for loosely coupled designs for objects that interact (i.e. they have very little knowledge of each other)
  - as long as these objects abide to their obligation TO BE a certain thing or TO DO certain tasks, they are free to make changes in other aspects or in their implementations
  - this minimizes interdependency between objects, making the system more flexible to change and easier to maintain
  - User: "Ganito yung kailangan ko. Wala akong pakialam kung pano mo gagawin yan, basta makuha ko yung kailangan ko" (not too involved in the implementation, just reaps what they need)
- encapsulate what varies: the observers vary in the way that they use the data from the subject and what data they use
  - observers are encapsulated into a class that implements an interface with an `update()` method
  - since the data that the subject hold can also change, we encapsulate the way to access these data within the subject itself by providing public getter methods, thereby enabling the observers to only *pull* what data they need and eliminating the need to update all `update()` methods whenever there is a new data in the subject.
- program to interfaces, not implementation: the only thing that the subject needs to know about observer classes is that they implement the observer interface.
  - the subject can then use the `update()` method, which is programming to an interface, instead of an implementation
- favor composition over inheritance: the subject HAS-A list of observer objects it needs to give access to its data to
  - the subject is composed to have observers
  - an observer is composed to have a subject to which it listens to for any update 

## Examples
- Event listeners in GUI frameworks
  - for a certain component (subject), you add listeners (observers) to perform a task when a specified event is fired
  - Java Swing, Javascript events
