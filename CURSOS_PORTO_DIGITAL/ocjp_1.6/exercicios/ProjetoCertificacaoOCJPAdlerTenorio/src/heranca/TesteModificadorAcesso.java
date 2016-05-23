package heranca;

public class TesteModificadorAcesso {

    public void m1() {
        System.out.print("A.m1, ");
    }

    protected void m2() {
        System.out.print("A.m2, ");
    }

    // Não é visível dentro de B por ser private
    private void m3() {
        System.out.print("A.m3, ");
    }

    void m4() {
        System.out.print("A.m4, ");
    }
}

class B {
    public static void main(String[] args) {
        TesteModificadorAcesso a = new TesteModificadorAcesso();
        a.m1(); // 1
        a.m2(); // 2
        // a.m3(); // 3
        a.m4(); // 4
    }
}
