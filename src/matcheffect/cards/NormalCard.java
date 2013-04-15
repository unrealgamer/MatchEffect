/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matcheffect.cards;

import javax.swing.JPanel;
import matcheffect.GameBoard;

/**
 *
 * @author Shane
 */
public class NormalCard implements Card{

    private NormalTypes myType;   
    private GameBoard myGameBoard;
    private JPanel myJPanel;
    
    
    public NormalCard(NormalTypes myType, JPanel myJPanel)
    {
        this.myType = myType;
        this.myJPanel = myJPanel;
    }
    
    @Override
    public void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void flipOver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    /**
     * Clears any previous listeners on our jPanel object and adds our new one that calls doAction()
     */
    public void createAndSetEventListener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
