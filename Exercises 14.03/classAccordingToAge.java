/*1. What class in school are you going according to age;
   Use an if-else-if.
   For example: 5-12 dimotiko, ...
   Can you use a switch statement?
*/

public class classAccordingToAge{
   public static void main(String [] args){
      
      for(int i=0;i<1;i++){
      int age=Integer.parseInt(args[0]);
         if (age>=5 && age<=18){
           if (age<=12){
           System.out.println("This age corresponds to elementary school");
           }else if (age<=15){
           System.out.println("This age corresponds to secondary school");
           }else{
           System.out.println("This age corresponds to high school");
           }

           break;

            }else{
         System.out.println("Invalid number, try again");
         i--;



        }

        }

      System.out.println("************Same exercise with switch statement************");
      for(int j=0;j<1;j++){
      System.out.println("Please give age");
      int age=Integer.parseInt(args[0]);
      if (age>=5 && age<=18){
      switch (age){
      case 5:
      System.out.println("This age corresponds to elementary school");
      break;
      case 6:
      System.out.println("This age corresponds to elementary school");
      break;
      case 7:
      System.out.println("This age corresponds to elementary school");
      break;
      case 8:
      System.out.println("This age corresponds to elementary school");  
      break;
      case 9:
      System.out.println("This age corresponds to elementary school");
      break;
      case 10:
      System.out.println("This age corresponds to elementary school");
      break;
      case 11:
      System.out.println("This age corresponds to elementary school");
      break;
      case 12:
      System.out.println("This age corresponds to secondary school");
      break;
      case 13:
      System.out.println("This age corresponds to secondary school");
      break;
      case 14:
      System.out.println("This age corresponds to secondary school");
      break;
      case 15:
      System.out.println("This age corresponds to secondary school");
      break;
      case 16:
      System.out.println("This age corresponds to high school"); 
      break; 
      case 17:
      System.out.println("This age corresponds to high school");
      break;
      case 18:
      System.out.println("This age corresponds to high school");  
      break;
      }  
    }else{
         System.out.println("Invalid number, try again");
         j--;
    } 
      

   }
}
}



