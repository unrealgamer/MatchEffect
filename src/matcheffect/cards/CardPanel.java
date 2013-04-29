/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matcheffect.cards;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 1263849
 */
public class CardPanel extends JPanel {
    
    private JLabel myLabel;
    
    public CardPanel(String strImagePath)
    {
        this.myLabel = new JLabel();
        this.myLabel.setBounds(0, 0, 0, 0);
        this.myLabel.setIcon(new ImageIcon(strImagePath));
        this.setBounds(0, 0, 100, 100);
        this.add(myLabel);
    }
    
    public void changeImage(String strImagePath)
    {
        this.myLabel.setIcon(new ImageIcon(strImagePath));
        this.myLabel.repaint();
        this.repaint();
    }  
}
