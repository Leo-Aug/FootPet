public class Cat extends Pet{
    private String sex;

    public Cat(){
        super();
        sex = null;
    }
    public Cat(String name, int health_index, int family_index, String sex){
        super(name, health_index, family_index);
        this.sex = sex;
    }

    public void print_information(){
        super.print_information();
        System.out.print("\tsex: "+sex);
    }

    public void touched(){
        family_index += 5;
        System.out.print("The cat " + name + " touched by the owner.\n");
    }
}
