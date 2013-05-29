/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matcheffect.cards;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import matcheffect.GameBoard;

/**
 *
 * @author 1114447
 */
public class YouKittenMeCard extends SpecialCard
{
    
    private final int intSecondsActive = 5;
    
    public YouKittenMeCard(GameBoard gameBoard)
    {
       super("Resources/YGBKM.jpg", gameBoard); 
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
        
        // Transparent 16 x 16 pixel cursor image.
        BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);

        // Create a new blank cursor.
        Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
            cursorImg, new Point(0, 0), "blank cursor");

        // Set the blank cursor to the JFrame.
        myGameBoard.getContentPane().setCursor(blankCursor);
        
        new Thread("Disappear") {
            @Override
            public void run()
            {
                try {
                    sleep(intSecondsActive * 1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(YouKittenMeCard.class.getName()).log(Level.SEVERE, null, ex);
                }
                myCardPanel.setVisible(false);
                myGameBoard.getContentPane().setCursor(Cursor.getDefaultCursor());
            }
        }.start();
    }
    
}
