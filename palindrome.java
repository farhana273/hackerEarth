import java.util.*;
public class palindrome
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char [] array = s.toCharArray();
    char [] array2 = new char[array.length];
    for(int i = 0,j = array.length -1;i < array.length; i++,j--)
    {
      array2[i] = array[j];
    }
    for(int i= 0; i < array.length ; i++)
    {
      if(array[i]==array2[i])
      {
      }
      else
      {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}