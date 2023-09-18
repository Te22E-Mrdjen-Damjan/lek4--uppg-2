import java.lang.annotation.Target;
import java.util.Scanner;

import javax.sound.sampled.BooleanControl;
public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner roblox = new Scanner(System.in);
        System.out.println("Skriv text");
        String text = roblox.nextLine();

        int antal_bokstäver = text.length();

        System.out.println("skriv en bokstav");

        String bokstav = roblox.nextLine();

        int plats = text.indexOf(bokstav);

        System.out.println("\""+text+"\" har " +antal_bokstäver+ " bokstäver");

        System.out.println("bokstaven "+bokstav+ " är på plats " +(plats+1));

        System.out.println("skriv en nummer");
        int start =roblox.nextInt();
        System.out.println("skriv en till nummer");
        int steg_fram = roblox.nextInt(); 
        roblox.nextLine();

        String delString = text.substring(start, steg_fram);
        System.out.println(delString);

        System.out.println("skriv en text");

        String textB = roblox.nextLine();
        boolean b = text.contains(textB);
        System.out.println(b);

        System.out.println("vilken text vill du byta ut");
        String bytaText= roblox.nextLine();
        System.out.println("vad vill du byta den till");
        String bytaTextTill = roblox.nextLine();

        String nytext = text.replace(bytaText, bytaTextTill);
        System.out.println(nytext);
    }
}
