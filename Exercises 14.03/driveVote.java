/*6. Based on age what can you do?
lt 16>>You cannot drive
16-17>>You can drive but not vote
18-21>>You can vote but not drink
gt 22>>You can do anything */

public class driveVote{
 public static void main(String[]args){
 for(int i=0;i<1;i++){
 int age = Integer.parseInt(args[0]);
 if (age>=16){
  if(age==16){
  System.out.println("You cannot drive");
  }else if(age==17 || age==18){
  System.out.println("You can drive but not vote");
  }else if(age>=18 && age<=21){
  System.out.println("You can vote but not drink");
  }else if(age>21){
  System.out.println("You can do anything");
  }
  
 }else{
 System.out.println("Invalid number, try again");
         i--;
 }
 }
 }
}