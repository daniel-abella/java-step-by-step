/*
 * RESPOSTA
 * B
 *
 *
 A) 100 1 1 1 1
 B) 100 100 1 1 1
 C) 100 100 100 1 1
 D) 100 100 100 100 1
 E) 100 100 100 100 100

 */
class Hotel {
    private int roomNr;

    public Hotel(int roomNr) {
        this.roomNr = roomNr;
    }

    public int getRoomNr() {
        return this.roomNr;
    }

    static Hotel doStuff(Hotel hotel) {
        hotel = new Hotel(1);
        return hotel;
    }

    public static void main(String args[]) {
        Hotel h1 = new Hotel(100);
        System.out.print(h1.getRoomNr() + " ");
        Hotel h2 = doStuff(h1);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
        h1 = doStuff(h2);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
    }
}