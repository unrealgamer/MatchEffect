package matcheffect.cards;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
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
    
    private Thread animateThread;
     
    /**
     * Card Panel Constructor
     * @param frontImgURL The front image to display once the card is clicked and then flipped
     */
    public CardPanel(String frontImgURL)
    {
        this.setAnimateThread();
        
        this.setSize(125, 150);
        try
        {
            this.backImage = ImageIO.read(new File("Resources/icon.jpg"));
            this.curImage = this.backImage;
            this.frontImage = ImageIO.read(new File(frontImgURL));
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
            setAnimateThread();
            blnIsFlipping = true;
            animateThread.start();
        }
    }//end doFlip()
    
    
    private void setAnimateThread()
    {
         animateThread = new Thread() {
            @Override
            public void run()
            {
                   if(!blnIsFlipping)
                       return;
                   
                    while(intWidth > 0)
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
                    if(curImage == backImage)
                        curImage = frontImage;
                    else
                        curImage = backImage;

                    while(intWidth <= 125)
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
                    blnIsFlipping = false;
                }
        };
    }
    
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
    
    
    public BufferedImage getFrontImage() {
        return frontImage;
    }

    public void setFrontImage(BufferedImage frontImage) {
        this.frontImage = frontImage;
    }

    public BufferedImage getBackImage() {
        return backImage;
    }

    public void setBackImage(BufferedImage backImage) {
        this.backImage = backImage;
    }

    public BufferedImage getCurImage() {
        return curImage;
    }

    public void setCurImage(BufferedImage curImage) {
        this.curImage = curImage;
    }

    public int getIntWidth() {
        return intWidth;
    }

    public void setIntWidth(int intWidth) {
        this.intWidth = intWidth;
    }

    public int getIntHeight() {
        return intHeight;
    }

    public void setIntHeight(int intHeight) {
        this.intHeight = intHeight;
    }

    public int getIntXOffset() {
        return intXOffset;
    }

    public void setIntXOffset(int intXOffset) {
        this.intXOffset = intXOffset;
    }

    public boolean isBlnCancelFlip() {
        return blnCancelFlip;
    }

    public void setBlnCancelFlip(boolean blnCancelFlip) {
        this.blnCancelFlip = blnCancelFlip;
    }

    public boolean isBlnIsFlipping() {
        return blnIsFlipping;
    }

    public void setBlnIsFlipping(boolean blnIsFlipping) {
        this.blnIsFlipping = blnIsFlipping;
    }
    
}//end Class
