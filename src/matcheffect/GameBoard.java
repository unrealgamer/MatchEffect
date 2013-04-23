package matcheffect;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import matcheffect.cards.*;

/**
 * @author Shane
 */
public class GameBoard extends javax.swing.JFrame {

    public final int intMyMaxPossibleMatches = 11;
    public final int intMyMaxCards = 25;
    
    private int intMyScore;
    private int intMyDifficulty;
    
    private String strMyUserName;
    
    private boolean blnIsPlaying;
    
    private ArrayList<Card> myCards;
    
    private Card myPreviousCard;
    
    public GameBoard() 
    {
        initComponents();
        startGame("Test", 3);
    }
    
    /**
     * Starts the game with a new username and difficulty. Generate a new board and starts the 
     * auto-subtract timer.
     * @param strUserName
     * @param intDifficulty 
     */
    public void startGame(String strUserName, int intDifficulty)
    {
        
        if(this.blnIsPlaying)
            return;
        
        this.blnIsPlaying = true;
        
        this.strMyUserName = strUserName;
        this.intMyDifficulty = intDifficulty;
        
        this.myCards = new ArrayList<Card>();
        
        generateAndPlaceCards();
        
        //throw new UnsupportedOperationException();
    }
    
    /**
     * Create 25 new random card objects and assign each on a JPanel
     * 11 Regular cards with matches (22 total) and 3 Special Cards
     */
    public void generateAndPlaceCards()
    {
        for(int i = 0; i < 11; i++)
        {
            JPanel p = new JPanel();
            //JLabel lbl = new JLabel();
            //lbl.setBounds(0,0,0,0);
            //lbl.setIcon(new ImageIcon("icon.jpg"));
            //p.add(lbl);
            NormalCard card = new NormalCard(NormalTypes.STAR, p);
            
            myCards.add(card);
            
            gamePanel.add(p);
        }
        gamePanel.setBorder(null);
        //throw new UnsupportedOperationException();
    }
    
    /**
     * Adds to the players score
     * @param intScoreToAdd The score to add
     */
    public void addScore(int intScoreToAdd)
    {
        this.intMyScore += intScoreToAdd;
    }
    
    /**
     * Checks if there is already a previous card. If there is check whether this new card matches and 
     * act accordingly. If not the set this card to the previous card and continue.
     * @param theCard 
     */
    public void checkCardMatch(Card theCard)
    {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Starts a timer that will subtract from the player's score every so often based on difficulty.
     * Will also call socreExpired once the score drops below zero.
     */
    private void startAutoSubtractScore()
    {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Gets a list of cards based on the boolean argument.
     * @param blnOnlyMatchedCards Return only matched cards or unmatched cards?
     * @return A list of cards
     */
    public ArrayList<Card> getCards(boolean blnOnlyMatchedCards)
    {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Gets an ArrayList off all of the boards cards
     * @return An ArrayList off all of the boards cards
     */
    public ArrayList<Card> getAllCards()
    {
        return this.myCards;
    }
    
    /**
     * Called when the score in the timer thread drops to or below zero. Then stops the game and calculates the score.
     */
    private void scoreExpired()
    {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Calculates and shows the final score based on the difficulty and score left.
     */
    private void calculateAndShowFinalScore()
    {
        
    }
    
    //<editor-fold defaultstate="collapsed" desc="UI Code">
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoPanel = new javax.swing.JPanel();
        gamePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(2, 2, 2));
        setForeground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        infoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gamePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gamePanel.setPreferredSize(new java.awt.Dimension(540, 500));
        gamePanel.setLayout(new java.awt.GridLayout(5, 5, 5, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName()) && false) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBoard().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gamePanel;
    private javax.swing.JPanel infoPanel;
    // End of variables declaration//GEN-END:variables
    
    
    //</editor-fold>
}
