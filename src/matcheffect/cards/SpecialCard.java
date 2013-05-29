package matcheffect.cards;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import matcheffect.*;

/**
 *
 * @author Shane
 */
public abstract class SpecialCard implements Card {
    
    protected String strMyImageLoc;
    protected GameBoard myGameBoard;
    protected CardPanel myCardPanel;
    protected Boolean isActivated;
    
    
    @Override
    public void flipOver()
    {
        this.myCardPanel.doFlip();
    }
    
    public SpecialCard(String strImageLoc, GameBoard gameBoard)
    {
        this.isActivated = false;
        this.strMyImageLoc = strImageLoc;
        this.myCardPanel = new CardPanel(this.strMyImageLoc);
        this.myGameBoard = gameBoard;
        createAndSetEventListener();
    }
    
    @Override
    /**
     * Clears any previous listeners on our Cardpanel object and adds our new one that calls doAction()
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
    
    @Override
    public abstract void doAction();

    @Override
    public CardPanel getCardPanel() {
        return myCardPanel;
    }
    
    public boolean isActivated()
    {
        return this.isActivated;
    }
}
