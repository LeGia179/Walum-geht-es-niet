import java.util.Scanner;
public class AbenteuerPlattformApp {
    
    public static void main(String[] args) {
       
        AbenteuerPlattform Abenteuer1 = new AbenteuerPlattform(null, null,null, 0, 0, 0);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Gib die Zahl 1, 2 oder 3 ein um dein Abenteuer zu starten!");
        int i = scan.nextInt();
       
            if(i == 1) {
                System.out.println("Du bist auf der suche nach einen Abenteuer!");
            }       
 
        


           // Abenteuer1.sucheAbenteuer("Mars", 500, 2);
    }
}
