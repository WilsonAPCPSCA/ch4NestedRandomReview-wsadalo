import java.util.Scanner;
public class Diamond
{
    public static void main(String args[])
    {
    	Scanner in=new Scanner(System.in);
        System.out.println("Enter side length: ");
        int input=in.nextInt();
        int count=1;
        for(int i=1;i<=2*input-1;i++)
        {
            for(int j=count;j<input;j++)
                System.out.print(" ");
            for(int k=1;k<=count*2-1;k++)
                System.out.print("*");
        if(i<input)
            count++;
        else
            count--;
                System.out.println("");
        }
    }
}
