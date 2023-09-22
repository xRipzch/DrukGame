import java.sql.SQLOutput;
import java.util.Scanner;

// True or false game
//Dice game
//Whose most likely
public class Drukspillet {
    Scanner in = new Scanner(System.in);
    char menuResult;
    int numOfPlayers;
    public static void main(String[] args) {
        new Drukspillet().run() ;
    }

    private void run() {
        menu();
        if (menuResult == 'd')
            new Dicegame();


    }

    public void menu(){
        System.out.println("WELCOME TO DRUKSPIL!");
        System.out.println("Enter number of players");
        numOfPlayers = in.nextInt();
        in.nextLine(); // scanner bug
        System.out.println("Please Choose from the list");
        System.out.println("Dice game (d)");
        System.out.println("True or false? (t)");
        System.out.println("Who's most likely? (w)");
        menuResult= in.nextLine().charAt(0);

    }
}
