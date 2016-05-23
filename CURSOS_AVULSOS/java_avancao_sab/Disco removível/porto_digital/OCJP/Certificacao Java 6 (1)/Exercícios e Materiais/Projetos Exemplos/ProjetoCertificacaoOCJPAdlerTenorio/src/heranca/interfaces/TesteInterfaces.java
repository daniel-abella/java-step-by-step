package heranca.interfaces;
public class TesteInterfaces implements InterfaceUm {

    public enum Days {
        MON, TUE, WED
    };

    /**
     * @param args
     */
    public static void main(String[] args) {
        for (Days d : Days.values()) {
            ;
        }

        Days[] d2 = Days.values();
        System.out.println(d2[2]);
    }

    InterfaceUm i = new InterfaceUm() {

        @Override
        public boolean somar() {
            return false;
        }

        @Override
        public boolean contem() {
            return false;
        }

        @Override
        public boolean existe() {
            return false;
        }
    };

    @Override
    public boolean contem() {
        return false;
    }

    @Override
    public boolean somar() {
        return false;
    }

    @Override
    public boolean existe() {
        return false;
    }
}
