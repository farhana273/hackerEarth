import java.util.*;

  public class cipherClass
{
  public static void main(String[]args)
  {
    try{
    
    Scanner sc = new Scanner(System.in);
    String line = sc.next();
     int k = sc.nextInt();
     String newString = "";
     int index = 0;
    for(int i = 0;i < line.length();i++)
    {
      if((int)line.charAt(i)>64 &&(int)line.charAt(i)<91)
      {
         index = (int)line.charAt(i) ;
       for(int j = 0; j < k; j++)
       {
         index = index + 1;
         if(index>90)
         {
           index = (index)%90 + 65 - 1;
         }
       }
        newString = newString + (char)index;
      }
      else if((int)line.charAt(i)>96 &&(int)line.charAt(i)<123)
      {
       index = (int)line.charAt(i) ;
       for(int j = 0; j < k; j++)
       {
         index = index + 1;
         if(index>122)
         {
           index = (index)%122 + 97 - 1;
            
         }
         
       }
      
        newString = newString + (char)index;
      }
      else if((int)line.charAt(i)>=48 &&(int)line.charAt(i)<=57)
      {
       
        index = (int)line.charAt(i) ;
       for(int j = 0; j < k; j++)
       {
         index = index + 1;
         if(index>57)
         {
           index = (index)%57 + 48 - 1;
         }
       }
        newString = newString + (char)index;
      }
      else
      {
        newString = newString + line.charAt(i);
      }
    }
    System.out.println(newString);
  }
  
   catch(Exception e)
    {
      System.out.println(e);
    }
}
  }