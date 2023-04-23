import java.io.*;
class HelloWorld {
    public static void main(String[] args) throws IOException 
    {
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int f1=0,f2=1,f;
       f=f1+f2;
       System.out.println(f1 + "\n" + f2 + "\n" + f);
       int cnt=3;
       while(cnt < n){
           f1=f2;
           f2=f;
           f=f1+f2;
           System.out.println(f);
           cnt++;
       }
    }
}