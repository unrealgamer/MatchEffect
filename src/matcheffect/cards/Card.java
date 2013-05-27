package matcheffect.cards;

/**
 *
 * @author Shane
 */
public interface Card {
    
    public void doAction();
    public void flipOver();
    public void createAndSetEventListener();
    public CardPanel getCardPanel();
}
