package atribuicoeslogicas;

public class Main {

    public static void main(String[] args) {

        // Inicializar variaveis
//         int x, y, z;
//         System.out.println(x + y + z);

         char b = '\r'; // 2
         char c = '\"'; // 3
         char d = '\b'; // 4
         char e = '\''; // 5
        // char a = '\c'; // 1 // Inválido por conta da unidade C do windowns

        System.out.println("******************************************************************************");
      
         
//         System.out.println(Boolean.valueOf(null));  // Retorna false
//         System.out.println(Boolean.valueOf("asda dasdada")); // Retorna false
//         System.out.println(Boolean.valueOf("false")); // Retorna false
//         System.out.println(Boolean.valueOf("true")); // Retorna true
         
         new Main().go();
         
         
         
         
         
         

    }
    
    int a = 81;
    
    void go() {
    	incr(++a);
    	System.out.println("go " + a);
    }
    
    void incr(int a) {
    	a += 10;
    	System.out.println("incr " + a);
    }
}
