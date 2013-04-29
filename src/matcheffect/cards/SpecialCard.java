package matcheffect.cards;

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
    
    
    @Override
    public void flipOver()
    {
    }
    
    @Override
    /**
     * Clears any previous listeners on our jPanel object and adds our new one that calls doAction()
     */
    public void createAndSetEventListener() {
    }
    
    @Override
    public abstract void doAction();

    @Override
    public CardPanel getCardPanel() {
        return myCardPanel;
    }
}
