/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matcheffect.cards;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import matcheffect.GameBoard;

/**
 *
 * @author 1114447
 */
public class FiredUpCard extends SpecialCard 
{
    
    private final double dblVisibleSeconds = 2;
    
    public FiredUpCard(GameBoard gameBoard)
    {
      super("Resources/FiredUpCard.jpg", gameBoard);
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
        
        final ArrayList<Card> unMatchedCards = this.myGameBoard.getCards(false);
        
        for(int i = 0; i < unMatchedCards.size(); i++)
        {
            if(unMatchedCards.get(i).getCardPanel().isBlnIsFlipping())
            {
                unMatchedCards.remove(i);
                i--;
            }
        }
        
        for(Card theCard : unMatchedCards)
        {
                theCard.flipOver();
        }
        
        new Thread("Re-Flip") {
            @Override
            public void run()
            {
                try {
                    sleep((int)(dblVisibleSeconds * 1000));
                } catch (InterruptedException ex) {
                    Logger.getLogger(FiredUpCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                for(Card theCard : unMatchedCards)
                {
                        theCard.flipOver();
                }
                myCardPanel.setVisible(false);
            }
        }.start();
        
    }
    
}
