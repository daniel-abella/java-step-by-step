package exception.exemplo01;

import java.util.ArrayList;
import java.util.List;

public class Gotcha {

    public static void main(String... args) {

        // 1.
        // new Gotcha().go();

        // 2.
        // try {
        // new Gotcha().go();
        // } catch (Error error) {
        // System.out.println("Error");
        // }

        // 3.
        // try {
        // new Gotcha().go();
        // } catch (Exception e) {
        // System.out.println("Exception");
        // }

        // 4
        Gotcha gotcha = new Gotcha();

        ArrayList<String> lista = (ArrayList<String>) gotcha.obterIndex();
        lista.get(10);

    }

    void go() {
        this.go();
    }

    List<String> obterIndex() {
        return new ArrayList<String>();
    }
}
