public class Main implements Room , Boy
{
    public static void main(String[] args)
    {
        Room room = new Main(); 
        room.say();
        Boy boy = new Main();
        boy.say();
        Main main = new Main(); 
        main.say();
    }

    public void say()
    {System.out.print("Oh no !");}
}
