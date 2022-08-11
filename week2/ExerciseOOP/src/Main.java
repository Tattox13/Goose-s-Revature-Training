import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // SuperHeroes
        SupermanArchetype superman = new SupermanArchetype("Superman", "Male", "DC",  1938);

        System.out.println(superman.toString());
        superman.fly();

        System.out.println("---------------------------------------------------");

        Superhero hulk = new Superhero();
        hulk.setName("Hulk");
        hulk.setGender("Male");
        hulk.setComic("Marvel");
        hulk.setFlight(false);
        hulk.setYearofrelease(1962);

        System.out.println(hulk.toString());
        hulk.fly();
        System.out.println(hulk.getComic());

    }
}