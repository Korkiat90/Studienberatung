
import java.util.*;

  public class Studienberatung{
    
    public static void main (String[]args){
      
    Scanner scanner = new Scanner(System.in);
    
    String Abitur;
    String Fachabitur;
    String Wissbegierig;
    
    System.out.println("Hast du Abitur?");
    
    Abitur = scanner.nextLine();
    
    if(Abitur.length()==0){
      
      System.out.println("Ich konnte dich nicht verstehen. Hast du Abitur?")
       Abitur = scanner.nextLine();
    }
    else if(Abitur.equalsIgnoreCase("ja")){
      
      System.out.println("Bist du Wissbegierig?")
      Wissbegierig = scanner.nextLine();
    
    if (Wissbegierig.equalsIgnoreCase("ja"){
      System.out.println("Auf jeden Fall studieren!");
      
    }
    else if(Wissbegierig.equalsIgnoreCase("nein"){
      System.out.println("nicht studieren");
    }
      
    }
    
    if(Abitur.equalsIgnoreCase("nein")){
      System.out.println("Hast du Fachabitur?");
      Fachabitur = scanner.nextLine();
      
      if(Fachabitur.equalsIgnoreCase("ja")){
        System.out.println("Hast du eine Berufsausbildung?");
        
        
      }
      else if(Fachabitur.equalsIgnoreCase("nein")){
        System.out.ptintln("nicht studieren");
        
      }
      
    }
      
      
      
      
      
      
      
      
      
      
    }
    
    
    
    
  }
