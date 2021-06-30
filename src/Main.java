import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Pet pets[] = {new Cat("Cat1", 80, 50, "male"), new Dog("Dog1", 85, 60, "中华田园犬")};

        boolean exit = false;
        int choice = 0;
        do{
            Scanner input = new Scanner(System.in);

            System.out.println("请选择：");
            System.out.println("1. 查看所有宠物信息");
            System.out.println("2. 提升亲密度");
            System.out.println("3. 送去医院");
            System.out.println("4. 退出");

            choice = input.nextInt();

            switch(choice){
                case 1:
                    for(Pet pet : pets){
                        pet.print_information();
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("请输入对应宠物名字：");
                    String name_case2;
                    name_case2 = input.next();
                    Pet pet_case2 = null;
                    for(Pet pet : pets){
                        if(pet.get_name().equals(name_case2)){
                            pet_case2 = pet;
                        }
                    }
                    if(pet_case2 == null){
                        System.out.println("无匹配项");
                    }else{
                        if(pet_case2 instanceof Cat){
                            Cat cat_case2 = (Cat)pet_case2;
                            cat_case2.touched();
                        }else{
                            Dog dog_case2 = (Dog)pet_case2;
                            dog_case2.play_fly_dish();
                        }
                    }
                    break;
                case 3:
                    System.out.print("请输入对应宠物名字：");
                    String name_case3;
                    name_case3 = input.next();
                    Pet pet_case3 = null;
                    for(Pet pet : pets){
                        if(pet.get_name().equals(name_case3)){
                            pet_case3 = pet;
                        }
                    }
                    if(pet_case3 == null){
                        System.out.println("无匹配项。");
                    }else{
                        pet_case3.cured();
                        System.out.println("宠物" + pet_case3.get_name() + "接受了治疗。");
                    }

                    break;
                default:
                    exit = true;
                    break;
            }
        }while(!exit);
    }
}
