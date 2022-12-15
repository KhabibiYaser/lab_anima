import java.util.Random;
public abstract class Animal {
    float weight;

    String ears;
    String color;
    String eyes;
    int legs;
    int wings;
    String meal;
    public String type = setType();


    public String name;
    String skin = skinType();

    int speed;


    public Animal(String name , String ears , String color , String eyes , int legs , int wings , String meal , float weight,int speed){
        this.name = name;
        this.ears = ears;
        this.color = color;
        this.eyes = eyes;
        this.legs = legs;
        this.wings = wings;
        this.meal = meal;
        this.weight = weight;
        this.speed = speed;
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

    public float indicator_Hungriness(){
        Random rand = new Random();
        return rand.nextFloat();
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

    public abstract String inidcator_Huse(float x);


    public abstract void diet();
}
