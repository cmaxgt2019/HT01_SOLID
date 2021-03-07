# HT01_SOLID
Implementa los principios S O L I D 
Carlos Maximino Gómez
UMG 1290-07-13164

Single Responsibility:
A class should only have one responsibility. Furthermore, it should only have one reason to change.
How does this principle help us to build better software? Let's see a few of its benefits:
Testing – A class with one responsibility will have far fewer test cases
Lower coupling – Less functionality in a single class will have fewer dependencies
Organization – Smaller, well-organized classes are easier to search than monolithic ones

Open/Closed:
Simply put, classes should be open for extension, but closed for modification. In doing so, we stop ourselves from modifying existing code and causing potential new bugs in an application.

Liskov Substitution:
Simply put, if class A is a subtype of class B, then we should be able to replace B with A without disrupting the behavior of our program.

Interface Segregation:
Larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

Dependency Inversion:
The principle of Dependency Inversion refers to the decoupling of software modules. This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.
