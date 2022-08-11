package Tuesday.Inheritance;

public class Mammal extends Animal {
    public Mammal(double weight, int eyes, int legs, String species, String sound) {
        super(weight, eyes,legs,species,sound);
    }

    public Mammal() {
        super();
    }
}
