/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matcheffect.cards;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import matcheffect.GameBoard;

/**
 *
 * @author Shane
 */
public class NormalCard implements Card{

    private NormalTypes myType;   
    private GameBoard myGameBoard;
    private CardPanel myCardPanel;
    private boolean blnMyIsMatched;
    
    
    public NormalCard(GameBoard theGameBoard, NormalTypes myType, CardPanel myCardPanel)
    {
        this.myType = myType;
        this.myCardPanel = myCardPanel;
        this.myGameBoard = theGameBoard;
        this.blnMyIsMatched = false;
        createAndSetEventListener();
    }
    
    @Override
    public void doAction() {
        myGameBoard.checkCardMatch(this);
    }

    @Override
    public void flipOver(boolean toFront) {
        myCardPanel.setVisible(!toFront);
    }

    @Override
    /**
     * Clears any previous listeners on our jPanel object and adds our new one that calls doAction()
     */
    public void createAndSetEventListener() {
        for(MouseListener ml : this.myCardPanel.getMouseListeners())
            this.myCardPanel.removeMouseListener(ml); 
        MouseListener myListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                doAction();
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        };
        this.myCardPanel.addMouseListener(myListener);
    }
    
    public boolean isMatched()
    {
        return this.blnMyIsMatched;
    }
    
    public void setIsMatched(boolean isMatched)
    {
        this.blnMyIsMatched = isMatched;
    }
    
    public CardPanel getCardPanel()
    {
        return this.myCardPanel;
    }
    
    public NormalTypes getType()
    {
        return this.myType;
    }
    
}
