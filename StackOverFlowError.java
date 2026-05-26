public class StackOverFlowError 
{
    public static void recurse() 
    {
        recurse();
    }

    public static void main(String[] args) 
    {
        recurse();

    }
}
