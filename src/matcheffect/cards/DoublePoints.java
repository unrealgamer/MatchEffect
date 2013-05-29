/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matcheffect.cards;

import java.util.logging.Level;
import java.util.logging.Logger;
import matcheffect.GameBoard;

/**
 *
 * @author 1114447
 */
public class DoublePoints extends SpecialCard 
{

    private final int intSecondsActive = 10;
    
    /**
     *
     */
    public DoublePoints(GameBoard gameBoard)
    {
        super("Resources/DoublePoints.jpg", gameBoard);
    }
  
    @Override
    public void doAction() 
    {
        if(this.isActivated)
            return;
        this.flipOver();
        this.isActivated = true;
        this.myGameBoard.setBlnIsDouble(true);
        new Thread("DoublePoints") {
            @Override
            public void run() {
                try {
                    sleep(intSecondsActive * 1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(DoublePoints.class.getName()).log(Level.SEVERE, null, ex);
                }
                myGameBoard.setBlnIsDouble(false);
                myCardPanel.setVisible(false);
            }
            
        }.start();
        
    }
    
}
