//3. What season is according to month. Enter month from terminal.
//4. Print the number of days each month has. Use switch.
public class whichSeason{
 public static void main(String [] args){
 for(int j=0;j<1;j++){
 System.out.println("Please insert a month (e.g. January, February e.t.c.)");
 String month=args[0];
 switch(month){
  case "January":
  System.out.println("31 days");
  System.out.println("Winter");
  break;
  case "February":
  System.out.println("28 days");
  System.out.println("Winter");
  break;
  case "March":
  System.out.println("31 days");
  System.out.println("Spring");
  break;
  case "April":
  System.out.println("30 days");
  System.out.println("Spring");
  break;
  case "May":
  System.out.println("31 days");
  System.out.println("Spring");
  break;
  case "June":
  System.out.println("30 days");
  System.out.println("Summer");
  break;
  case "July":
  System.out.println("31 days");
  System.out.println("Summer");
  break;
  case "August":
  System.out.println("30 days");
  System.out.println("Summer");
  break;
  case "September":
  System.out.println("31 days");
  System.out.println("Autumn");
  break;
  case "October":
  System.out.println("30 days");
  System.out.println("Autumn");
  break;
  case "November":
  System.out.println("31 days");
  System.out.println("Autumn");
  break;
  case "December":
  System.out.println("30 days");
  System.out.println("Winter");
  break;
  
  }
 }
 }
}