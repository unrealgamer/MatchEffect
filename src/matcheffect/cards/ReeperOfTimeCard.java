/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matcheffect.cards;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import matcheffect.GameBoard;

/**
 *
 * @author 1114447
 */
public class ReeperOfTimeCard extends SpecialCard 
{
    
    private final int intScoreToRemove = -250;
    private final int intSecondsActive = 1;
    
    public ReeperOfTimeCard(GameBoard gameBoard)
    {
        super("Resources/ReeperOfTimeCard.jpg", gameBoard);
    }
    
    @Override
    public void doAction() 
    {
        if(isActivated)
            return;
        
        isActivated = true;
        
        flipOver();
        
        myGameBoard.addScore(intScoreToRemove);
        
        new Thread("Clear Card") {
            @Override
            public void run()
            {
                try {
                    sleep(intSecondsActive * 1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YouKittenMeCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                myCardPanel.setVisible(false);
            }
        }.start();
    }
    
}
