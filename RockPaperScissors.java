import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("When I say 'Shoot': Choose 'Rock', 'Paper' or 'Scissors'.");
        System.out.println("Are you ready? Write 'Yes' if you are.");
        if (scan.nextLine().equals("Yes")){
            System.out.println("Great!");
        }
        else {
            System.out.println("It's a No then..");
            System.exit(0);
        }
        System.out.println("rock-paper-scissors, shoot!");
        String playerChoice = scan.nextLine();
        choiceCheck(playerChoice);
        String computerChoice = computerChoice();
        choiceCheck(computerChoice);

        System.out.println("You chose: " + playerChoice);
        System.out.println("The computer chose: " + computerChoice);

        String gameResult = checkWin(playerChoice, computerChoice);

        System.out.println(gameResult);

    scan.close();
    }

    public static boolean choiceCheck(String playerChoice) {
        if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
            return true;
        }
        else {
            System.out.println("Invalid Choice..");
            return false;
        }
    }
    public static String computerChoice() {
        String comPlay;
        int compRps = (int)(Math.random()*3 +1);
        if (compRps == 1) {
            comPlay = "rock";
        }
        else if (compRps == 2) {
            comPlay = "paper";
        }
        else {
            comPlay = "scissors";
        }
        return comPlay;
    }

    public static String checkWin(String player, String computer) {
        String result;
        if (player.equals(computer)) {
            result = "TIE!";
            return result;
        }
        else if ((player.equals("rock") && computer.equals("paper")) || 
                (player.equals("paper") && computer.equals("scissors")) ||
                (player.equals("scissors") && computer.equals("rock"))
        ) {
            result = "You lose";
            return result;
        }
        else {
            result = "You win!";
            return result;
        }
    }
}
