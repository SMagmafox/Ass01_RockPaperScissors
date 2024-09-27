import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String moveA = " ";
        String moveB = " ";
        String continueYN = "true";
        Scanner console = new Scanner(System.in);

        do {
            do {
                System.out.print("Player A, Enter a move! [RPS]: ");
                moveA = console.nextLine();
                moveA = moveA.toUpperCase();

                System.out.print("Player B, Enter a move! [RPS]: ");
                moveB = console.nextLine();
                moveB = moveB.toUpperCase();
            } while (!moveA.matches("[RPS]")||!moveB.matches("[RPS]"));
                if(moveA.equals("R"))
                {
                    if(moveB.equals("R"))
                    {
                        System.out.println("Rock vs Rock, its a Tie!");
                    }
                    else if (moveB.equals("P"))
                    {
                        System.out.println("Paper covers Rock, Player B Wins!");
                    }
                    else if (moveB.equals("S"))
                    {
                        System.out.println("Rock breaks Scissors, Player A Wins!");
                    }
                }
                else if(moveA.equals("P")) {
                    if (moveB.equals("R")) {
                        System.out.println("Paper covers Rock, Player A Wins!");
                    } else if (moveB.equals("P")) {
                        System.out.println("Paper vs Paper, its a tie!");
                    } else //scissors is the only one left for Player B
                    {
                        System.out.println("Scissors cut Paper, Player B Wins!");
                    }
                }
                else //scissors is the only move for Player A
                {
                    if (moveB.equals("R"))
                    {
                        System.out.println("Rock breaks Scissors, Player B Wins!");
                    }
                    else if (moveB.equals("P"))
                    {
                        System.out.println("Scissors cut paper, Player A Wins!");
                    }
                    else
                        System.out.println("Scissors vs Scissors, its a tie!");
                }


                System.out.print("Would you like to play again? [Y/N]: ");
                continueYN = console.nextLine();
        } while (continueYN.equalsIgnoreCase("Y"));
    }
}