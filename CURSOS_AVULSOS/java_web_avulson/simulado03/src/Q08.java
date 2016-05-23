class Outer {
        private int a = 7;

           class Inner {
              public void displayValue() {
                 System.out.println("Value of a is " + a);
              }
           }
        }


class Test {

        public static void main(String... args) throws Exception {
                Outer mo = new Outer();
                  Outer.Inner inner = mo.new Inner();
                  inner.displayValue();

        }

}