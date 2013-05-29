/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matcheffect.cards;

import java.awt.Color;
import java.awt.Cursor;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import matcheffect.GameBoard;

/**
 *
 * @author 1114447
 */
public class MatchDefectCard extends SpecialCard 
{
    private final int intSecondsVisible = 2;
    
    /**
     *
     */
    public MatchDefectCard(GameBoard gameBoard)
    {
        super("Resources/MatchDefect.jpg", gameBoard);
    }
    
    /**
     *
     */
    @Override
    public void doAction() 
    {
        if(isActivated)
            return;
        
        isActivated = true;
        
        flipOver();
        
        ArrayList<Card> allCards = myGameBoard.getAllCards();
        
        for(Card theCard : allCards)
        {
            theCard.flipOver();
        }
        final Color temp = myGameBoard.getPanelColor();
        
        myGameBoard.setPanelColor(Color.red);
        
        new Thread("Reset") {
            @Override
            public void run()
            {
                try {
                    sleep(intSecondsVisible * 1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YouKittenMeCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                myGameBoard.setPanelColor(temp);
                myGameBoard.clearBoard();
                myGameBoard.generateAndPlaceCards();
                for(Card theCard : myGameBoard.getAllCards())
                {
                    theCard.getCardPanel().repaint();
                }
            }
        }.start();
    }
    
}
