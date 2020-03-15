//8. Use ternary to return a message child or adult. Older than 18 is adult.

public class childOrAdult{
 public static void main(String[]args){
 int age=Integer.parseInt(args[0]);
 String message;
 message=(age>=18)?"You are an adult":"You are a child";
 System.out.println(message);
 }
}