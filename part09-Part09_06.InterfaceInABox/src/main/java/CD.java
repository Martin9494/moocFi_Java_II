public class CD implements Packable {

    private String artist;
    private String cdName;
    private double weight;
    private int publicationYear;

    public CD(String artist, String cdName, int publicationYear){
        this.artist = artist;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString(){
        return this.artist+": "+this.cdName+" ("+this.publicationYear+")";
    }

}
