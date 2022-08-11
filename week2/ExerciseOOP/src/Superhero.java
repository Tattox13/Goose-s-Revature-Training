import java.util.Arrays;

public class Superhero {

    private String name;
    private String gender;
    private String comic;
    private boolean flight;
    private int yearofrelease;

    public Superhero(){

    }

    public Superhero(String name, String gender, String comic, boolean flight, int yearofrelease){
        this.name = name;
        this.gender = gender;
        this.comic = comic;
        this.flight = flight;
        this.yearofrelease = yearofrelease;

    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getGender() {return this.gender; }
    public void setGender(String gender) {this.gender = gender;}

    public String getComic() {return this.comic; }
    public void setComic(String comic) {
        this.comic = comic;
    }

    public boolean getFlight() {return this.flight; }
    public void setFlight(boolean flight) {
        this.flight = flight;
    }

    public int getYearofrelease() {return this.yearofrelease; }
    public void setYearofrelease(int yearofrelease) {
        this.yearofrelease = yearofrelease;
    }

    public void fly(){
        System.out.println("Can "+ getName() + " fly? \n-> " + getFlight());
    }

    @Override
    public String toString() {
        return "Hero " + name + ": \n" + getName() + " release in " + yearofrelease + " under " + comic + " studios.";
    }
}
