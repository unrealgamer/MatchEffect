/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matcheffect.cards;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import matcheffect.GameBoard;

/**
 *
 * @author 1114447
 */
public class JamaicanMeCrazyCard extends SpecialCard
{
    /**
     *
     */
    public JamaicanMeCrazyCard(GameBoard gameBoard)
    {
        super("Resources/Jamaican.jpg", gameBoard);
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
        
        ArrayList<Card> matchedCards = myGameBoard.getCards(true);
        
        for(Card theCard : matchedCards)
        {
            if(theCard instanceof NormalCard)
            {
                NormalCard nCard = (NormalCard)theCard;
                nCard.setIsMatched(false);
                nCard.flipOver();
                myGameBoard.setIntMyCardMatches(myGameBoard.getIntMyCardMatches()-1);
            }
        }
        
        new Thread("Vanish") {
            @Override
            public void run()
            {
                try {
                    sleep((int)(1 * 1000));
                } catch (InterruptedException ex) {
                    Logger.getLogger(FiredUpCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                myCardPanel.setVisible(false);
            }
        }.start();
        
    }
}
