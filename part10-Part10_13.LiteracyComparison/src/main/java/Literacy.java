

public class Literacy{
    //Adult literacy rate, 
    //population 15+ years,
    // female (%),
    // male (%),
    //United Republic of Tanzania,
    //2015,
    //76.08978

    private String first;
    private String second;
    private String maleOrFemale;
    private String country;
    private int year;
    private String percent;


    public Literacy(String first, String second, String maleOrFemale, String country, int year, String percent){
        this.first = first;
        this.second = second;
        this.maleOrFemale = maleOrFemale.split(" ")[0];
        this.country = country;
        this.year = year;
        this.percent = percent;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String getMaleOrFemale() {
        return maleOrFemale;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getPercent() {
        return percent;
    }
    //Niger (2015), female, 11.01572
    @Override
    public String toString(){
        return this.country+" ("+this.year+"), "+this.maleOrFemale+", "+this.percent;
    }



}
