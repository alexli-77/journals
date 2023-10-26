### AutomaticTest Factoring for Java

[AutomaticTest Factoring for Java](https://www.ase-conferences.org/olbib/p114-saff-430.pdf)

This paper talked about how to provide the benefits of focused tests to a developer who has only written system tests. The authors described the automated test factoring in detail.

In their previous work, they proposed dynamic test factoring. The authors performed practical dynamic test factoring for a Java program in this paper. They presented the dynamic capture-replay technique to construct mock objects to replace the real objects environment. This paper was published in 2004, but it provided an excellent solution to optimize the running time of the system test suite.

### Capture and replay technique

The capture phrase : 

It executes the tests (which should pass) in the context of the original system T|E, and records all interactions between T and E. The resulting transcript contains the procedure name, arguments, and return value for each call.

The replay phrase : 

It occurs during execution of the factored tests, that is, T'|Em. The system is run as before,but with real objects E replaced by mock objects Em; the original environment is never executed during the factored test.


### Notes

4. Instrumenting Java classes

This section describes our approach to replacing classes and objects in a Java program with alternative implementations. The capture phase uses a wrapper class that records behavior to a transcript, and the replay phase uses a mock class that reads from the transcript.
Our approach proceeds in two steps. The first, behaviorpreserving step introduces a new interface for every class in the program, retrofits each class to implement its interface, and replaces references to the class by references to the interface. These interfaces separate type inheritance from implementation inheritance (which is useful for purposes other than test factoring). The second step introduces new classes that implement the interface, and therefore can be used in place of the original (retrofitted) ones.
