public class SupermanArchetype extends Superhero{

    public SupermanArchetype(String name, String gender, String comic, int yearofrelease){
    super(name, gender,comic,true,yearofrelease);
    }

    @Override
    public void fly(){
        System.out.println("Can the Supreme "+ getName() + " fly? \n-> " + getFlight());
    }

}
