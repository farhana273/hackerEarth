import java.util.*;
public class seatArrangement
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int testCases = sc.nextInt();
    for(int i = 0; i < testCases; i++)
    {
      int n = sc.nextInt();
      int result = n % 12;
      if(result==1)
      {
        System.out.println(11+n+ " WS");
      }
      else if(result==2)
      {
        System.out.println(9+n+ " MS");
      }
       else if(result==3)
      {
        System.out.println(7+n+ " AS");
      }
        else if(result==4)
      {
        System.out.println(5+n+ " AS");
      }
         else if(result==5)
      {
        System.out.println(3+n+ " MS");
      }
          else if(result==6)
      {
        System.out.println(1+n+ " WS");
      }
            else if(result==7)
      {
        System.out.println(n-1+ " WS");
      }
             if(result==8)
      {
        System.out.println(n-3+ " MS");
      }
      else if(result==9)
      {
        System.out.println(n-5+" AS");
      }
       else if(result==10)
      {
        System.out.println(n-7+ " AS");
      }
        else if(result==11)
      {
        System.out.println(n-9+ " MS");
      }
         else if(result==0)
      {
        System.out.println(n-11+ " WS");
      }
        
            
          
      
    }
    
    
  }
  
}