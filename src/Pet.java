public class Pet {
    protected String name;
    protected int health_index;
    protected int family_index;

    public Pet(){
        name = null;
        health_index = 0;
        family_index = 0;
    }

    public Pet(String name, int health_index, int family_index){
        this.name = name;
        this.health_index = health_index;
        this.family_index = family_index;
    }

    public void print_information() {
        System.out.print("name: "+name+"\thealth index: "+health_index+"\tfamily index: "+family_index);
    }

    public void cured(){
        health_index += 5;
    }

    public String get_name(){
        return name;
    }
}
