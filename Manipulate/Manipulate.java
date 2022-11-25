import java.util.Scanner;
public class Manipulate
{//class
    String inputstr;
    String newstr;

    public void accept()
    {//accept
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        inputstr=sc.nextLine();
    }//accept
    public void arrange()
    {//arrange
        inputstr=inputstr.toLowerCase();
        char s[]=new char[inputstr.length()];
        for (int i=0;i<inputstr.length();i++)
        {
            s[i]=inputstr.charAt(i);

            for (int j=0;j<s.length-1;j++)
            {
                for (int k=0;k<s.length-1;k++)
                {    if(s[k]>s[k+1])
                    {   char temp=s[k];
                        s[k]=s[k+1];
                        s[k+1]=temp;        
                    }
                }
            }
        }
        for (int x=0;x<s.length;x++)
        {
            newstr+=(s[x]);
        }
    }//arrange
    public void display()
    {//display
        System.out.println("Original String="+inputstr);

        System.out.println("New String="+newstr);
    }
}
