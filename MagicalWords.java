import java.util.*;
public class MagicalWords
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int  testCases = sc.nextInt();
    int [] array = {67, 71, 73, 79, 83, 89 ,97, 101, 103, 107 ,109 ,113 };
    for(int i = 0;i < testCases;i++)
    {
      int length = sc.nextInt();
      String word = sc.next();
      String newWord = "";
      int newIndex = 0;
      for(int j = 0; j < length;j++)
      {
       //System.out.println(word.charAt(j));
       int index = (int)word.charAt(j);
       //System.out.println(index);
       if(index<array[0])
       {
          //System.out.println("index=arra[0]");
         newIndex = array[0];
       }
       else if(index>array[array.length-1])
       {
         //System.out.println("index=arra[length-1]");
          newIndex = array[array.length-1];
       }
       else
       {
         for(int k =0 ; k < array.length;k++)
         {
           if(index==array[k])
           {
             //System.out.println("index=arra[k]");
             newIndex = index;
             break;
           }
           if(index<array[k+1]&&index>array[k])
           {
             //System.out.println("indexxxxx");
             
             int diffK = index - array[k];
             int diffKPlusOne = array[k+1] - index;
//              //System.out.println("diffK"+diffK);
//               //System.out.println("diffKPlusOne "+diffKPlusOne);
             if(diffK>diffKPlusOne)
             {
                newIndex = array[k+1];
             }
             else
             {
             newIndex = array[k];
             }
//             //System.out.println("array[k] "+array[k]);
//             //System.out.println(newIndex);
             break;
           }
           
         }
       }
       newWord = newWord+(char)newIndex;
      }
      System.out.println(newWord);
    }
  }
}