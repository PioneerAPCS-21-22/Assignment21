import java.util.Scanner;
public class Testing
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        /* Prints integers 1 to 10 */
        int i = 0;
        while(i < 10)
        {
            i++;
            System.out.println(i);
        }

        /* Keeps printing Hello! until user enters "no" */
        String resp = "";
        while(!resp.equalsIgnoreCase("no"))
        {
            System.out.println("Hello!");
            System.out.print("Continue? ");
            resp = in.next();
        }
    }
}

