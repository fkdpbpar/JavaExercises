public class weightPlanet{
   public static void main(String [] args){
      
for(int j=0;j<1;j++){
      System.out.println("Please give a planet (e.g. Mars) and your weight in Kg");
      String planet=args[0];
      int weight=Integer.parseInt(args[1]);
      switch (planet){
      case "Venus":
      System.out.println("Your weight in Venus is "+(weight*0.87));
      break;
      case  "Mars":
      System.out.println("Your weight in Mars is "+(weight*0.39));
      break;
      case "Jupiter":
      System.out.println("Your weight in Jupiter is "+(weight*2.65));
      break;
      case "Saturn":
      System.out.println("Your weight in Saturn is "+(weight*1.17));  
      break;
      case "Uranus":
      System.out.println("Your weight in Uranus is "+(weight*1.05)); 
      break;
      case "Neptune":
      System.out.println("Your weight in Neptune is "+(weight*1.23)); 
      break;
      }  
    
      

   }
}
}