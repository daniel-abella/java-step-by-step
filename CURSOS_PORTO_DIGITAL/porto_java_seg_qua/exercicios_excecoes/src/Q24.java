
24. Which are most typically thrown by an API developer or an application developer as opposed to being thrown by the JVM? (Choose all that apply.)
A. ClassCastException
B. IllegalStateException
C. NumberFormatException
D. IllegalArgumentException
E. ExceptionInInitializerError
Answer:
-> B , C, and D are correct. B is typically used to report an environment problem such as trying to access a resource that’s closed. C is often thrown in API methods that attempt
to convert poorly formed String arguments to numeric values. D is often thrown in API
methods that receive poorly formed arguments.
-> A and E are thrown by the JVM.

























