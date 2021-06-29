public class Dog extends Pet{
    private String kind;

    public Dog(){
        super();
        kind = null;
    }

    public Dog(String name, int health_index, int family_index, String kind){
        super(name, health_index, family_index);
        this.kind = kind;
    }

    public void print_information(){
        super.print_information();
        System.out.print("\tkind: "+kind);
    }

    public void play_fly_dish(){
        family_index += 5;
        System.out.print("The dog " + name + " played fly dish with the owner.\n");
    }
}
