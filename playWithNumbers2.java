import java.util.*;
import java.io.*;
public class playWithNumbers2
{
  public static void main(String[]args)throws Exception
  {
     HashMap<String,Long> hm=new HashMap<String,Long>();
    MyScanner sc = new MyScanner();
    out = new PrintWriter(new BufferedOutputStream(System.out), true);
    int n = sc.nextInt();
    long [] array = new long[n];
    int q = sc.nextInt();
   array[0] =sc.nextLong();
    for(int i = 1; i < n;i++)
    {
      array[i] = array[i-1] + sc.nextLong();
      
    }
    for(int i = 0; i < q;i++)
    {
      
      int s =sc.nextInt()-1;
      int e =sc.nextInt()-1;
      long sum = 0;
      long div = e - s + 1;
      
      if(s==0)
      {
        sum = array[e];
      }
      else
      {
        sum = array[e] - array[s-1];
      }
     out.println(sum/div);
    }
  }

  public static PrintWriter out;
 
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
         
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //--------------------------------------------------------
}
