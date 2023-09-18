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
    }
}
