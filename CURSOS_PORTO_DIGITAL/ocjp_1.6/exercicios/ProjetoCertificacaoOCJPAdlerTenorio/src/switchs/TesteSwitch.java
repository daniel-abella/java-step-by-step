package switchs;

public class TesteSwitch {

	
	short s = 'U';
	

    private void testeSwitch01() {

        final int a = 20;
        byte x = 2;

        // Tipos aceitos no switchs: char, byte, short, int e enum.
        switch (x) {

        case a: // Só compila se a variável for FINAL e estiver INICIALIZADA
            break;

        case 10:
            break;

        // Não compila pois tem o mesmo valor
//        case 10:
//            break;

        // Não compila pois 128 é maior que um byte
        case 128:
            break;

        default:
            break;
        }
    }

    private void testeSwitch02() {
        String palavra = "palavra";

        switch (palavra.length()) { // Aceito pois o método length() retorna um
                                    // int.

        case 7: { // O uso de chaves nos cases é opcional e válido
            System.out.println("Quantidade de letras: " + 7);
            break;
        }
        default:
            break;
        }
    }

    private void testeSwitch03() {

        switch (new Integer(10)) { // Aceito pois o java faz o uso de boxing.
        case 10:
            System.out.println("boxing");
            break;

        default:
            break;
        }
    }

    private void testeSwitch04() {

        char a = 'A';

        switch (a) {

        case 'A':
            System.out.println("Aceita CHAR");
            break;

        default:
            break;
        }
    }

    private static void testeAleatorio() {

        float a = 'A';
        double b = 'B';
        System.out.println(a + " " + b);
        float aaaaaa = 10;
        double bbbbb = 20;

        switch (bbbbb) { // O tipo double n é aceito no switch

        case 'A':
            System.out.println("Aceita CHAR");
            break;

        default:
            break;
        }
    }

    static int x = 7;

}
