package matcheffect.cards;

/**
 *
 * @author Shane
 */
public enum NormalTypes {
    RED("location", 50),
    ORANGE("YGBKM.jpg", 100),
    YELLOW("location", 50),
    GREEN("Jamaican.jpg", 100),
    BLUE("location", 50),
    PURPLE("location", 100),
    CIRCLE("location", 50),
    SQUARE("location", 100),
    TRIANLGE("location", 50),
    STAR("location", 100),
    HEXAGON("location", 50);
    
    private final String strImageLoc;
    private final int intScoreToAdd;

    NormalTypes(String strImgLoc, int intScoreToAdd) {
        this.strImageLoc = strImgLoc;
        this.intScoreToAdd = intScoreToAdd;
    }
    
    public String getImageLoc() { return strImageLoc; }
    public int getScoreToAdd() { return intScoreToAdd; }
}
