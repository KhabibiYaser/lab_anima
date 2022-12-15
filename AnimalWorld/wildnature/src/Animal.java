import java.util.Random;
public abstract class Animal {
    float weight;

    String ears;
    String color;
    String eyes;
    int legs;
    int wings;
    String meal;
    String type = setType();


    public String name;
    public String skin = skinType();


    public Animal(String name , String ears , String color , String eyes , int legs , int wings , String meal , float weight){
        this.name = name;
        this.ears = ears;
        this.color = color;
        this.eyes = eyes;
        this.legs = legs;
        this.wings = wings;
        this.meal = meal;
        this.weight = weight;
    }

    public String setType(){
        if (wings > 0){
            return "Bird";
        } else {
            return "Mammal";
        }
    }

    public void getType() {
        System.out.println(type);
    }

    public int indicator_Hungriness(){
        Random rand = new Random();
        return rand.nextInt();
    }

    public String getPlace(){
        if (type == "Bird"){
            return "Bird can be on the ground or in the air";
        } else {
            return "Animal can be only on the ground";
        }
    }

    public abstract void Continents();
    public abstract float Amount_food();

    public abstract String skinType();

    public abstract String getSkin();



    public abstract void diet();
}
