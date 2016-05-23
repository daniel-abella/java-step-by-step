/*
erro de digitação
 */

class Tech {
         public void tech() {
              System.out.println("Tech");
           }

}


class Atech {

        Tech a = new Tech() {
              public void tech() throws RuntimeException {
                 System.out.println("anonymous tech");
              }
           };

           public void dothis() {
                      a.tech();

                   }

public static void main(String... args){
        Atech atech = new Atech();
        atech.dothis();
}
}