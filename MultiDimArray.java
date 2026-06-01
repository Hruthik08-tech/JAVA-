

public class MultiDimArray 
{
    public static void main(String[] args)
    {
        int mat[][] = new int[3][4];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                mat[i][j] = (int) (Math.random() * 10);
                System.out.print(" " +  mat[i][j]);
            }
            System.out.println();
        }

        // Different ways of looping 
        for (int n[] : mat)
        {
            System.out.println(n);
        }


    }
}
