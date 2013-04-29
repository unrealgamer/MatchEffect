package matcheffect;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        
        ArrayList<NormalTypes> availableTypes = new ArrayList<NormalTypes>(Arrays.asList(NormalTypes.values()));
            
        availableTypes.addAll(availableTypes);
        
        Collections.shuffle(availableTypes);
        
        for(int i = 0; i < 22; i++)
        {
            NormalTypes type = availableTypes.remove(0);
            
            CardPanel p = new CardPanel(type.getImageLoc());
            
            NormalCard card = new NormalCard(type, p);

            myCards.add(card);   
        }
        
        
        myCards.add(new FiredUpCard());
        myCards.add(new FiredUpCard());
        myCards.add(new FiredUpCard());
        
        Collections.shuffle(myCards);
        
        for(Card card : myCards)
            gamePanel.add(card.getCardPanel());
        
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        gamePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(2, 2, 2));
        setForeground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(800, 622));
        setResizable(false);

        infoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        infoPanel.setMinimumSize(new java.awt.Dimension(175, 600));
        infoPanel.setPreferredSize(new java.awt.Dimension(175, 600));
        infoPanel.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Score:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("99999999");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Name:");
        jLabel3.setToolTipText("");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Instructions");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("New Game");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(10);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Instructions here maybe?");
        jTextArea1.setBorder(null);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gamePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gamePanel.setMinimumSize(new java.awt.Dimension(600, 600));
        gamePanel.setName(""); // NOI18N
        gamePanel.setPreferredSize(new java.awt.Dimension(600, 600));
        gamePanel.setLayout(new java.awt.GridLayout(5, 5, 5, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
    
    //</editor-fold>
}
