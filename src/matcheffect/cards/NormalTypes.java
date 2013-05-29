package matcheffect.cards;

/**
 *
 * @author Shane
 */
public enum NormalTypes {
    RED("Resources/Galaxy1.jpg", 50),
    ORANGE("Resources/Galaxy2.jpg", 100),
    YELLOW("Resources/Galaxy3.jpg", 50),
    GREEN("Resources/Galaxy4.jpg", 100),
    BLUE("Resources/Galaxy5.jpg", 50),
    PURPLE("Resources/Galaxy6.jpg", 100),
    CIRCLE("Resources/Galaxy7.jpg", 50),
    SQUARE("Resources/Galaxy8.jpg", 100),
    TRIANLGE("Resources/Galaxy9.jpg", 50),
    STAR("Resources/Galaxy10.jpg", 100),
    HEXAGON("Resources/Galaxy11.jpg", 50);
    
    private final String strImageLoc;
    private final int intScoreToAdd;

    NormalTypes(String strImgLoc, int intScoreToAdd) {
        this.strImageLoc = strImgLoc;
        this.intScoreToAdd = intScoreToAdd;
    }
    
    public String getImageLoc() { return strImageLoc; }
    public int getScoreToAdd() { return intScoreToAdd; }
}
