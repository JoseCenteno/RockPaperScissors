package org.consoleTest;

import java.util.Scanner;

import game.Match;
import game.Move;

public class App 
{
    public static void main( String[] args )
    {
        Match match = new Match();
        
        match.Play();
        
        System.out.println("Player 1 wins: " + match.getWinsPlayer1().toString());
        System.out.println("Player 2 wins: " + match.getWinsPlayer2().toString());
        System.out.println("draw: " + match.getDraw().toString());
        System.out.print("Do you want to see all moves? (s/n)");
        
        Scanner input = new Scanner(System.in);
        String seeAllMoves = input.nextLine();
        if (seeAllMoves.toLowerCase().equals("s")) {
        	for(Move move : match.getLstMove()) {
        		System.out.println(   move.getFigure1().getName().concat(" - ").concat(
        							  move.getFigure2().getName()).concat(" - Wins: ").concat(
        									  move.getWinner().toString()) );        		
        	}
        }
        input.close();
    }
}
