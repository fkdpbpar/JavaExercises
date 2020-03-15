//2. What to do every day (switch). Monday-Friday: go to work. Sat-Sun: relaxing


public class workEveryDay{
 public static void main(String [] args){
  System.out.println("Please insert a day (e.g. Monday, Tuesday e.t.c.)");
  String day=args[0];
  switch (day){
  case "Monday":
  System.out.println("Go to work");
  break;
  case "Tuesday":
  System.out.println("Go to work");
  break;
  case "Wedsnesday":
  System.out.println("Go to work");
  break;
  case "Thurday":
  System.out.println("Go to work");
  break;
  case "Friday":
  System.out.println("Go to work");
  break;
  case "Saturday":
  System.out.println("relaxing");
  break;
  case "Sunday":
  System.out.println("relaxing");
  break;
  } 
 }
}