package CO_Exercise;

import Thursday.Movie;

public class Superhero {

    String heroName;
    String secretIdentity;
    String archenemy;
    String powers;
    int yearOfRelease;


    public Superhero(String heroName, String secretIdentity, String archenemy, String powers, int yearOfRelease){
        this.heroName = heroName;
        this.secretIdentity = secretIdentity;
        this.archenemy = archenemy;
        this.powers = powers;
        this.yearOfRelease = yearOfRelease;

    }

    public Superhero(String heroName, String secretIdentity, String archenemy, int yearOfRelease){
        this.heroName = heroName;
        this.secretIdentity = secretIdentity;
        this.archenemy = archenemy;
        this.powers = "none";
        this.yearOfRelease = yearOfRelease;

    }

    @Override
    public String toString(){
        String returnValue = "";
        returnValue += "Hero: " + this.heroName;
        returnValue += " | Secret Identity: " + this.secretIdentity;
        returnValue += " | Archenemy: " + this.archenemy;
        returnValue += " | Powers: " + this.powers;
        returnValue += " | Year of release: " + this.yearOfRelease;
        return returnValue;
    }

    @Override
    public int hashCode() {
        return powers.hashCode();
    }

    @Override
    public boolean equals(Object obj){

        if (!(obj instanceof Superhero)) return false;
        Superhero other = (Superhero) obj;
        if (!this.heroName.equals(other.heroName)) return false;
        if (!this.secretIdentity.equals(other.secretIdentity)) return false;
        if (!this.powers.equals(other.powers)) return false;

        return true;
    }
}
