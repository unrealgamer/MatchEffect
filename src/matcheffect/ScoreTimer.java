/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matcheffect;

import java.util.TimerTask;

/**
 *
 * @author Student
 */
public class ScoreTimer extends TimerTask {

    private GameBoard myBoard;
    
    public ScoreTimer(GameBoard board)
    {
        this.myBoard = board;
    }
    
    @Override
    public void run() {
       
    }
    
    public GameBoard getBoard()
    {
        return this.myBoard;
    }
    
}
