import java.util.*;
public class toggleString
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char [] array = s.toCharArray();
    for(int i = 0; i < array.length; i++)
    {
      if(Character.isUpperCase(array[i]))
      {
        array[i] = Character.toLowerCase(array[i]);
      }
      else
      {
        array[i] = Character.toUpperCase(array[i]);
      }
    }
    String newString = String.valueOf(array);
    System.out.println(newString);
  }
}