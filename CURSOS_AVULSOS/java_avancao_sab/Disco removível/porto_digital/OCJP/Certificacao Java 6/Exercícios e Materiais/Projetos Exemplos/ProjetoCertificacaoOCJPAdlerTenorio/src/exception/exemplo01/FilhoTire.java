package exception.exemplo01;

public class FilhoTire extends Tire {

    public static void main(String[] args) {
        new FilhoTire().doStuff(); // N�o precisa de try/cach pois a exception que levanta � UnChecked

    }

    // 1. Compila pois � UnChecked
    @Override
    void doStuff() throws RuntimeException {
        System.out.println(7 / 0);
    }

    // 2. Compila pois � UnChecked
    // @Override
    // void doStuff() throws ArithmeticException {
    // System.out.println(7 / 0);
    // }

    // 3. N�o Compila, pois o m�todo n�o pode ser sobrescrito levantando uma
    // Exception pois o seu pai n�o possui
    // @Override
    // void doStuff() throws Exception {
    // System.out.println(7 / 0);
    // }

}
