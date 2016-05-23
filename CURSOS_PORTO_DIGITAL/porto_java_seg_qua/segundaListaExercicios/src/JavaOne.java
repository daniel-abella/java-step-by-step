public class JavaOne extends free
{ 
    public free go()
    {
        return super.go();
    }
    public static void main(String [] args)
    {
        new JavaOne().go(); // #1
        free ree = new JavaOne().go(); // #2
        three thre = new JavaOne().go(); // #3
        new free().go(); // #4
    }
}

class three
{
    public three go(){return null;}
}

class free extends three
{
    public free go(){return null;}
}
