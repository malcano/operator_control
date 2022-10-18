import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WhoWin {
    public static String rps(String p1, String p2) {
        //your code here

        if(p1==p2) // if p1 and p2 are equals, return Draw
            return "Draw!";

        boolean p1win = (p1+p2).equals("rockscissors") || (p1+p2).equals("scissorspaper") || (p1+p2).equals("paperrock") ? true : false ;// Did player 1 win?

        if(p1win)// if p1 won
            return "Player 1 won!";
        else// else
            return "Player 2 won!";
    }
        
    @Test
    public void test1() {
        assertEquals("Player 1 won!", WhoWin.rps("rock", "scissors"));
        assertEquals("Player 1 won!", WhoWin.rps("scissors", "paper"));
        assertEquals("Player 1 won!", WhoWin.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        assertEquals("Player 2 won!", WhoWin.rps("scissors", "rock"));
        assertEquals("Player 2 won!", WhoWin.rps("paper", "scissors"));
        assertEquals("Player 2 won!", WhoWin.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        assertEquals("Draw!", WhoWin.rps("scissors", "scissors"));
        assertEquals("Draw!", WhoWin.rps("paper", "paper"));
        assertEquals("Draw!", WhoWin.rps("rock", "rock"));
    }
}