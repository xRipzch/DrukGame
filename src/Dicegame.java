import java.util.Random;

public class Dicegame {
    Random random = new Random();
  private   int diceResult;

  public void diceMenu() {
      System.out.println("Welcome to the dice game!");
      System.out.println("The dice will roll and a challenge will appear!");
  }

  public int throwDice() {
      diceResult = random.nextInt(6)+1;
      return diceResult;
  }
  public void diceChallenge() {
      if ( diceResult==1) {

          System.out.println("Challenge: Hold your breath for as long as possible. \n The Winner points out someone who drinks 2 sips");
      }
      if (diceResult==2) {

          System.out.println("Each person states their body count.\n Drink according sips  of the person to your right's body count");
      }
      if (diceResult == 3) {
          System.out.println("Rock Paper Scissors! Find a partner. Looser has to empty their drink:D  ");

      }
      if (diceResult == 4) {
          System.out.println("");

      }
  }

}
