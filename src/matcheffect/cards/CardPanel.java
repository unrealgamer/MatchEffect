package matcheffect.cards;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * A Card Panel that will flip the image of the card and display it.
 * @author Shane
 */
public class CardPanel extends JPanel
{
    
    private BufferedImage frontImage;
    private BufferedImage backImage;
    private BufferedImage curImage;
    private int intWidth = 125;
    private int intHeight = 150;
    private int intXOffset = 0;
    private boolean blnCancelFlip = false;
    private boolean blnIsFlipping = false;
    
    private Thread animateThread = new Thread() {
            @Override
            public void run()
            {
               while(true)
               {
                   if(!blnIsFlipping)
                       continue;
                   
                    while(intWidth > 0 && !blnCancelFlip)
                    {
                        intWidth -= 5;
                        intXOffset += 2;
                        repaint();
                        try {
                            sleep(10);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(CardPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    if(blnCancelFlip)
                    {
                        intWidth = 125;
                        intXOffset = 0;
                        if(curImage == backImage)
                        curImage = frontImage;
                        else
                            curImage = backImage;
                        blnCancelFlip = false;
                        blnIsFlipping = false;
                        repaint();
                        continue;
                    }

                    if(curImage == backImage)
                        curImage = frontImage;
                    else
                        curImage = backImage;

                    while(intWidth <= 125  && !blnCancelFlip)
                    {
                        intWidth += 5;
                        intXOffset -= 2;
                        repaint();
                        try {
                            sleep(10);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(CardPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if(blnCancelFlip)
                    {
                        intWidth = 125;
                        intXOffset = 0;
                        blnCancelFlip = false;
                        repaint();
                    }
                    blnIsFlipping = false;
                }
            }
        };
    
    /**
     * Card Panel Constructor
     * @param frontImgURL The front image to display once the card is clicked and then flipped
     */
    public CardPanel(String frontImgURL)
    {
        
        this.setSize(125, 150);
        try
        {
            this.frontImage = ImageIO.read(new File(frontImgURL));
            this.backImage = ImageIO.read(new File("icon.jpg"));
            this.curImage = this.backImage;
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    } //end Constructor
    
    /**
     * Flips the card using a thread to animate the transition and repaint every 1/100 of a second.
     * @pre None
     * @param None
     * @return None
     * @post Card is flipped
     */
    public void doFlip()
    {
        if(!animateThread.isAlive())
        {
            blnIsFlipping = true;
            animateThread.start();
        }
        else
        {
            if(blnIsFlipping)
            {
                blnCancelFlip = true;
                blnIsFlipping = false;
            }
            else
            {
                blnIsFlipping = true;
            }
        }
    }//end doFlip()
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(curImage != null)
            g.drawImage(curImage, intXOffset, 0, intWidth, intHeight, null);
        else
        {
            Color old = g.getColor();
            g.setColor(Color.red);
            g.drawString("Image Load Error!", 10, 10);
            g.setColor(old);
        }
    }//end paintComponent
}//end Class
