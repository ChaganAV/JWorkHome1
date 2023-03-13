public class Hronology {
    private int year;
    private int period;
    private String rel;
    private String description;
    public Hronology(){
        this.year = 0;
        this.period = 0;
        this.rel = "";
        this.description = "";
    }
    public Hronology(int year, int period, String rel, String description) {
        this.year = year;
        this.period = period;
        this.rel = rel;
        this.description = description;
    }

    public Hronology(int year, int period, String rel) {
        this();
        this.year = year;
        this.period = period;
        this.rel = rel;
    }

    public Hronology(int year, int period) {
        this();
        this.year = year;
        this.period = period;
    }

    public Hronology(int year) {
        this();
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
