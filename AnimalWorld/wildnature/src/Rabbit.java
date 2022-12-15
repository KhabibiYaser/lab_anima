public class Rabbit extends Animal {
    public Rabbit(String name , String ears , String color , String eyes , int legs , int wings , String meal , int weight){
        super(name,ears,color,eyes,legs,wings,meal,weight);
    }

    public void Continents(){
        System.out.println("The " + name + " usually live in Europe or on islands like New-Zealand" );
    }

    public float Amount_food(){
        return 110 * weight;
    }

    public String skinType(){
        if (color == "Grey"){
            return name + " have grey wool";
        } else {
            return name + " have thin skin , without wool";
        }
    }
    @Override
    public void diet(){
        System.out.println("Carrot , Grass , vegetables , etc");
    }
    @Override
    public String getSkin() {
        return skin;
    }

}
