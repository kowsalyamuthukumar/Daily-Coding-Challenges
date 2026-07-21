import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>= -32768 && x<=32767 )System.out.println("* short");
                if(x>=-2147483648  && x<=2147483647)System.out.println("* int");
                if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
                //if(x>=-Float.MIN_VALUE && x<=Float.MAX_VALUE)System.out.println("* float");
                //if(x>=Character.MIN_VALUE && x<=Character.MAX_VALUE)System.out.println("* char");
                //if(x>=-Double.MIN_VALUE && x<=Double.MAX_VALUE)System.out.println ("* double");
                //if(x>=Boolean.MIN_VALUE && x<=Boolean.MAX_VALUE)System.out.println("* boolean");
            
            
            }
           
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



