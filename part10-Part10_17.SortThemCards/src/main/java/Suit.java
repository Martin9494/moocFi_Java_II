

public enum Suit {
    CLUB("CLUB"), 
    DIAMOND("DIAMOND"), 
    HEART("HEARTH"), 
    SPADE("SPADE");


private String med;

private Suit(String med){
    this.med = med;
}

    public String getMed() {
        return med;
    }




}