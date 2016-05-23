package exception.exemplo01;

public class FilhoTire extends Tire {

    public static void main(String[] args) {
        new FilhoTire().doStuff(); // Não precisa de try/cach pois a exception que levanta é UnChecked

    }

    // 1. Compila pois é UnChecked
    @Override
    void doStuff() throws RuntimeException {
        System.out.println(7 / 0);
    }

    // 2. Compila pois é UnChecked
    // @Override
    // void doStuff() throws ArithmeticException {
    // System.out.println(7 / 0);
    // }

    // 3. Não Compila, pois o método não pode ser sobrescrito levantando uma
    // Exception pois o seu pai não possui
    // @Override
    // void doStuff() throws Exception {
    // System.out.println(7 / 0);
    // }

}
