package CO_Exercise;

public class Characteristic {
    public static void main(String[] args) {
        Superhero hero1 = new Superhero("Superman", "Clark Kent", "Lex Luthor","Super Human, Flight, Heat Vision",1938 );
        Superhero hero2 = new Superhero("Batman", "Bruce Wayne", "Joker",1939 );
        Superhero hero3 = new Superhero("Iron Man", "Tony Stark", "Mandarin",1968 );
        Superhero hero4 = new Superhero("Captain America", "Steve Rodgers", "Red Skull","Super Human",1941 );
        Superhero hero5 = new Superhero("Flash", "Barry Allen", "Reverse Flash","Super Speed",1940 );

        System.out.println("");
        System.out.println("Heroes Database: ");
        System.out.println("-------------------------------------");
        String heroString = hero1.toString();
        System.out.println(heroString);
        System.out.println(hero2.toString());
        System.out.println(hero3.toString());
        System.out.println(hero4.toString());
        System.out.println(hero5.toString());
        System.out.println("-------------------------------------");
        System.out.println("Batman and Iron Man similar ->");
        System.out.println(hero2.hashCode() == hero3.hashCode());
        System.out.println("Captain America and Flash similar ->");
        System.out.println(hero4.hashCode() == hero5.hashCode());
        System.out.println("-------------------------------------");
        System.out.println("Are Batman and Iron Man same person: " + hero2.equals(hero3));
        System.out.println("Are Batman and Superman same person: " + hero2.equals(hero1));

    }
}
