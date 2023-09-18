import java.util.Scanner;
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


        String delString = text.substring(start, steg_fram);
        System.out.println(delString);

    }
}
