public class Leopard extends Animal {

    public String skin = skinType();


    public Leopard(String name , String ears , String color , String eyes , int legs , int wings , String meal , float weight , int speed){
        super(name,ears,color,eyes,legs,wings,meal,weight,speed);
    }

    @Override
    public void Continents() {
        System.out.println( name + " usually lives in South-America , tropics like Amazon");
    }

    @Override
    public float Amount_food() {
        return 1;
    }


    public String skinType() {

        return name + "s skin color is tawny yellow and its fur presents" + "\n" +
                " densely packed dark irregular black rosettes " + "\n" +
                name + " cat is a small wild cat and its skin had yellowish ground color" + "\n" +
                ". Two distinct dark stripes extending between eyes and ears, black spots on dorsum" + "\n" +
                " are its characteristic feature";
    }

    @Override
    public String getSkin() {
        return skin;
    }

    @Override
    public void diet(){
        System.out.println(" Any meat , rabbits  , gazels , bywols ");
    }


    @Override
    public String inidcator_Huse(float x) {
        if (x > 0.3) {
            return "Y";
        }
        else {
            return "N" ;
        }
    }


}
