package matcheffect;

import java.util.ArrayList;
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
        
        generateAndPlaceCards();
        
        throw new UnsupportedOperationException();
    }
    
    /**
     * Create 25 new random card objects and assign each on a JPanel
     * 11 Regular cards with matches (22 total) and 3 Special Cards
     */
    public void generateAndPlaceCards()
    {
        throw new UnsupportedOperationException();
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

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
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
                if ("Nimbus".equals(info.getName())) {
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
    
    //</editor-fold>
}
