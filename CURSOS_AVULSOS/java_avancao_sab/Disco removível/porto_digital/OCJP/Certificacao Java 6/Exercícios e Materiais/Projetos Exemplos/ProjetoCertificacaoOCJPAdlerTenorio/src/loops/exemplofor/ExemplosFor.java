package loops.exemplofor;

public class ExemplosFor {

    public static void main(String[] args) {

        // testandoForSaidasForcadas();
        // testandoForLoopInfinito();
        // testandoForVariasVariaveis();
        testandoForDeclaracaoVariavelForaDoFor();
        // testandoForExpressaoIteracao();
        // testandoForVariosContinues();
    }

    // TODO As 3 condi��es do la�o for (Express�o de inicializa��o, condicional e
    // itera��o) n�o s�o obrigat�rias.

    // Execu��o la�o for passo a passo:
    // 1�) Inicializa a vari�vel
    // 2�) Testa a condi��o
    // 3�) Executa o corpo do for
    // 4�) Executa a express�o de itera��o (incremento)
    // 5�) Come�a a partir do item 2

    // Sa�das for�adas: break, return, new Exception e System.exit();
    // Pular itera��o: Continue
    private static boolean testandoForSaidasForcadas() {
        boolean retorno = false;
        int x = 1;

        for (; x < 10; x++) {

            if (x == 1) {
                continue;
            } else if (x == 7) {
                break;
            } else if (x == 8) {
                return retorno = true;
            } else if (x == 9) {
                System.exit(1);
            } else {
                System.out.println("Imprime: " + x);
            }
        }
        return retorno;
    }

    private static void testandoForLoopInfinito() {

        for (;;) {
            System.out.println("Loop Infinito");
        }
    }

    private static void testandoForVariasVariaveis() {
    	int z =1;
    	
        for (float x = 1, y = 2; (x < 5) && (y < 6); x++, y++, z++) {
            System.out.println("Valor x: " + x);
            System.out.println("Valor y: " + y);
            System.out.println("Valor z: " + z);

        }
    }

    private static void testandoForDeclaracaoVariavelForaDoFor() {
        int x = 10000;

        for (x = 1; x < 5; x++) {
            System.out.println("Valor DENTRO do for x: " + x);
        }
        System.out.println("Valor de x FORA for: " + x);
    }

    private static void testandoForExpressaoIteracao() {

        int b = 5;

        for (int a = 1; b != a; System.out.println("Imprime")) {
            b--;
        }
    }

    private static void testandoForVariosContinues() {

        int[] array = { 1, 3, 5, 7, 9 };

        for (int x : array) {
            for (int j = 0; j < 3; j++) {
                if (x > 4 && x < 8) {
                    continue;
                } else {
                    System.out.print(" " + x);
                }
                if (j == 1) {
                    break;
                } else {
                    continue;
                }
            }
            continue;
        }
    }
}