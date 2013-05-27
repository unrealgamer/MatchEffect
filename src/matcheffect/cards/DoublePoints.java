/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matcheffect.cards;

import matcheffect.GameBoard;

/**
 *
 * @author 1114447
 */
public class DoublePoints extends SpecialCard 
{

    /**
     *
     */
    public DoublePoints(GameBoard gameBoard)
    {
        super("icon.jpg", gameBoard);
    }
  
    @Override
    public void doAction() 
    {
        this.myGameBoard.addScore(10);
    }
    
}
