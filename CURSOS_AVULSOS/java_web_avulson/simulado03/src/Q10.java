class Outer1 {
         private String x = "Outer variable";
           void doStuff() {
             final String z = "local variable";
             class Inner {
               public void seeOuter() {
                 System.out.println("Outer x is " + x);
                 System.out.println("Local variable z is " + z);
               }
             }
           }


}