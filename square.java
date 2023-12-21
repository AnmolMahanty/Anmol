import java.io.*; 
class Square 
{ 
  public static void main(String[] args) throws IOException 
  {  
  int a ,res; 
  BufferedReader br = new BufferedReader ( new 
  InputStreamReader(System.in)); 
  String str; 
  System.out.println("\n Enter a Number: "); 
 str=br.readLine(); 
 a= Integer.parseInt(str) ; 
 res=a * a; 
 System.out.println("\nThe Square = " +res); 
} 
} 
